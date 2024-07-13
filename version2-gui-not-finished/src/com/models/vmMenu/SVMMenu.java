package com.models.vmMenu;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

import com.models.items.Item;
import com.models.payment.Payment;
import com.models.inventory.Inventory;
import com.models.denominations.Denominations;
import com.models.vendingMachine.SVendingMachine;

/**
 * The SVMMenu class represents the menu of the vending machine simulator.
 * It manages the operations related to adding, removing, and restocking items, handling payments, and managing denominations.
 */
public class SVMMenu {
    private Denominations CPaymentSlot;
    private Inventory CTransacSummary;

    private Denominations            replenishedDMN;
    private HashMap<String, Integer> categoryMap;
    private HashMap<String, Integer> instanceTracker;
    private HashMap<String, String>  commonItemSlots;

    private Denominations CTempPayment;
    private Payment CPayment;

    private Item CSelectedItem;
    private ArrayList<String> arrReceipt;

    /**
     * Initializes a new instance of the SVMMenu class.
     */
    public SVMMenu() {
        this.CPaymentSlot = new Denominations();
        this.CTransacSummary = new Inventory();
        this.CTempPayment = new Denominations();
        this.CPayment = new Payment();
        this.replenishedDMN = new Denominations();
        this.categoryMap = new HashMap<String, Integer>();
        this.instanceTracker = new HashMap<String, Integer>();
        this.commonItemSlots = new HashMap<>();
    }

    /**
     * Checks if the provided item quantity is valid.
     * 
     * @param nQuantity The quantity of the item to be checked.
     * @return True if the item quantity is between 10 and 20 (inclusive), false otherwise.
     */
    public boolean isItemQuantityValid(int nQuantity) {
        if (nQuantity >= 10 && nQuantity <= 20) {  // min: 10, max : 20
            return true;
        }
        return false;
    }

    public void initializeItems(SVendingMachine CSpecialVM) {
        CSpecialVM.addItem(new Item("Beef Tapa", "Viand", 1, 82, 180, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Bacon", "Viand", 1, 65, 161, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Hotdog", "Viand", 1, 59, 160, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Longganisa", "Viand", 1, 72, 160, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Bangus", "Viand", 1, 89, 407, categoryMap, commonItemSlots));

        CSpecialVM.addItem(new Item("Plain Rice", "Rice", 1, 20, 205, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Sinangag", "Rice", 1, 25, 279, categoryMap, commonItemSlots));
        
        CSpecialVM.addItem(new Item("Water", "Beverage", 1, 15, 0, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Coffee", "Beverage", 1, 20, 8, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Orange Juice", "Beverage", 1, 26, 112, categoryMap, commonItemSlots));
        
        CSpecialVM.addItem(new Item("Fried Egg", "Egg", 1, 26, 112, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Scrambled Egg", "Egg", 1, 26, 112, categoryMap, commonItemSlots));
        
        CSpecialVM.addItem(new Item("Tomato Slices", "Side", 1, 26, 112, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Cucumber Slices", "Side", 1, 26, 112, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Atchara", "Side", 1, 26, 112, categoryMap, commonItemSlots));

        CSpecialVM.addItem(new Item("Ketchup", "Condiment", 1, 26, 112, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Soy Sauce", "Condiment", 1, 26, 112, categoryMap, commonItemSlots));
        CSpecialVM.addItem(new Item("Vinegar", "Condiment", 1, 26, 112, categoryMap, commonItemSlots));
    }

    public void addItemsinTracker(SVendingMachine CSpecialVM) {
        for (Item CItem : CSpecialVM.getItems()) {
            instanceTracker.put(CItem.getName(), instanceTracker.getOrDefault(CItem.getName(), 0) + 1);
        }
    }
        
    /**
     * Removes an item from the vending machine.
     *
     * @param CSpecialVM    The vending machine from which the item is to be removed.
     * @param  strName      The name of the item to be removed.
     * @return True if the item is successfully removed, false otherwise.
     */
    public boolean removeItem(SVendingMachine CSpecialVM, String strName) {        
        boolean bItemFound = false;
        ArrayList<Item> itemToRemove = new ArrayList<Item>();
        
        for (Item CItem : CSpecialVM.getItems()) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                bItemFound = true;
                itemToRemove.add(CItem);
                strName = CItem.getName();
            }
        }

        if (bItemFound) {
            CSpecialVM.getItems().removeAll(itemToRemove);
            instanceTracker.remove(strName);
            updateRemainingItemSlots(CSpecialVM);
            return true;
        } 
        
        return false;
    }

    /**
     * Updates the remaining item slots in the vending machine after removing an item.
     *
     * @param CSpecialVM The vending machine for which the item slots need to be updated.
     */
    private void updateRemainingItemSlots(SVendingMachine CSpecialVM) {
        categoryMap.clear();
        commonItemSlots.clear();

        for (Item CItem : CSpecialVM.getItems()) {
            CItem.generateSlot(categoryMap, commonItemSlots);
        }
    }

    /**
     * Retrieves the current quantity of an item in the vending machine.
     *
     * @param CSpecialVM    The vending machine from which the quantity is to be retrieved.
     * @param strName       The name of the item whose quantity is to be retrieved.
     * @return The current quantity of the item.
     */
    public int getCurrentQuantity(SVendingMachine CSpecialVM, String strName) {
        int nCurrentQTY = 0;

        for (Item CItem : CSpecialVM.getItems()) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                nCurrentQTY = instanceTracker.get(strName);
            }
        }

        return nCurrentQTY;
    }

    /**
     * Checks if the quantity to add to an item is valid.
     *
     * @param CSpecialVM    The vending machine for which the quantity is to be checked.
     * @param strName       The name of the item to which the quantity is to be added.
     * @param nAddQTY       The quantity to be added to the item.
     * @return -1 if the quantity to add is invalid, 0 if it exceeds the maximum quantity, 1 if valid.
     */
    public int isQuantityToAddValid(SVendingMachine CSpecialVM, String strName, int nAddQTY) {
        int nValidFlag = -1;

        for (Item CItem : CSpecialVM.getItems()) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                
                if (nAddQTY < 1) {
                    nValidFlag = -1;
                    break;
                } else if  ((instanceTracker.get(strName) + nAddQTY) > 20) {
                    nValidFlag = 0;
                    break;
                }  else if (((instanceTracker.get(strName)-1) + nAddQTY) < 10) {
                    nValidFlag = 0;
                    break;
                } else {
                    nValidFlag = 1;
                    break;
                }
            }
        }

        return nValidFlag;
    }

    /**
     * Restocks an item in the vending machine.
     *
     * @param CSpecialVM    The vending machine in which the item is to be restocked.
     * @param strName       he name of the item to be restocked.
     * @param  nAddQTY      The quantity to be restocked.
     * @return True if the item is successfully restocked, false otherwise.
     */
    public boolean restockItem(SVendingMachine CSpecialVM, String strName, int nAddQTY) {
        boolean bItemFound = false;
        Item    CFoundItem = null;

        for (Item CItem : CSpecialVM.getItems()) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                bItemFound = true;
                CFoundItem = CItem;
                break;
            }
        }

        if (bItemFound) {
            int nUpdatedQuantity = instanceTracker.getOrDefault(strName, 0) + nAddQTY;
            instanceTracker.put(strName, nUpdatedQuantity);

            String strCateg = CFoundItem.getCategory();
            float fPrice = CFoundItem.getPrice();
            float fCalories = CFoundItem.getCalories();

            for (int i = 0; i < nAddQTY; i++) {
                Item CNewItem = new Item(strName, strCateg, 1, fPrice, fCalories, categoryMap, commonItemSlots);
                CSpecialVM.addItem(CNewItem);
            }
            return true;
        } 
        return false;     
    }

    /**
     * Collects the payment from the vending machine.
     *
     * @return The total payment collected from the vending machine.
     */
    public float collectPayment() {
        float fTotalPayment = CPaymentSlot.calculateTotalAmount();
        CPaymentSlot.resetDenominations();
        return fTotalPayment;
    }

    /**
     * Replenishes the denominations in the vending machine.
     *
     * @param CSpecialVM The vending machine for which the denominations are to be replenished.
     */
    public void replenishDenom(SVendingMachine CSpecialVM) {
        CSpecialVM.setDenomination(replenishedDMN);  
    }

    /**
     * Inserts coins to the denominations in the vending machine.
     *
     * @param CSpecialVM    The vending machine to which coins are to be added.
     * @param n1Peso        The number of 1 peso coins to be added.
     * @param n5Peso        The number of 5 peso coins to be added.
     * @param n10Peso       The number of 10 peso coins to be added.
     */
    public void addCoins(SVendingMachine CSpecialVM, 
                        int n1Peso, int n5Peso, int n10Peso) {
        replenishedDMN.set1Coins(replenishedDMN.get1Coins() + n1Peso);
        replenishedDMN.set5Coins(replenishedDMN.get5Coins() + n5Peso);
        replenishedDMN.set10Coins(replenishedDMN.get10Coins() + n10Peso);
    }

    /**
     * Inserts bills to the denominations in the vending machine.
     *
     * @param CSpecialVM    The vending machine to which bills are to be added.
     * @param n20Peso       The number of 20 peso bills to be added.
     * @param n50Peso       The number of 50 peso bills to be added.
     * @param n100Peso      The number of 100 peso bills to be added.
     * @param n200Peso      The number of 200 peso bills to be added.
     * @param n500Peso      The number of 500 peso bills to be added.
     * @param n1000Peso     The number of 1000 peso bills to be added.
     */
    public void addBills(SVendingMachine CSpecialVM, int n20Peso, int n50Peso, 
                        int n100Peso, int n200Peso, int n500Peso, int n1000Peso) {
        replenishedDMN.set20Bills(replenishedDMN.get20Bills() + n20Peso);
        replenishedDMN.set50Bills(replenishedDMN.get50Bills() + n50Peso);
        replenishedDMN.set100Bills(replenishedDMN.get100Bills() + n100Peso);
        replenishedDMN.set200Bills(replenishedDMN.get200Bills() + n200Peso);
        replenishedDMN.set500Bills(replenishedDMN.get500Bills() + n500Peso);
        replenishedDMN.set1000Bills(replenishedDMN.get1000Bills() + n1000Peso);
    }

    /**
     * Displays the transaction summary from the vending machine.
     *
     * @param CSpecialVM The vending machine for which the transaction summary is to be displayed.
     */
    public void displayTransacSummary(SVendingMachine CSpecialVM) {
        CTransacSummary.setEndingInventoryMap(CSpecialVM.getItems());
        CTransacSummary.setItemsSoldMap(CSpecialVM.getItemsSold());
    }

    /**
     * Displays the transaction summary from the vending machine.
     *
     * @param CSpecialVM The vending machine for which the transaction summary is to be displayed.
     */
    public ArrayList<String> displayStartTransacSummary(SVendingMachine CSpecialVM) {
        return CTransacSummary.displayStartInventoryMap();
    }

    /**
     * Displays the transaction summary for the ending inventory from the vending machine.
     *
     * @param CSpecialVM The vending machine for which the ending inventory summary is to be displayed.
     * @return An ArrayList of strings containing the ending inventory transaction summary.
     */
    public ArrayList<String> displayEndTransacSummary(SVendingMachine CSpecialVM) {
        return CTransacSummary.displayEndInventoryMap();
    }

    /**
     * Displays the list of items sold during the current transaction from the vending machine.
     *
     * @param CSpecialVM The vending machine for which the list of sold items is to be displayed.
     * @return An ArrayList of strings containing the list of items sold during the current transaction.
     */
    public ArrayList<String> displayItemsSold(SVendingMachine CSpecialVM) {
        return CTransacSummary.displayItemsSold();
    }

    /**
     * Sets the starting inventory of the vending machine in the transaction summary.
     *
     * @param arrItems The ArrayList of items representing the starting inventory.
     */
    public void setStartInventory(ArrayList<Item> arrItems) {
        CTransacSummary.setStartingInventoryMap(arrItems);
    }

    /**
     * Sets the ending inventory of the vending machine in the transaction summary.
     *
     * @param arrItems The ArrayList of items representing the ending inventory.
     */
    public void setEndInventory(ArrayList<Item> arrItems) {
        CTransacSummary.setEndingInventoryMap(arrItems);
    }

    /**
     * Sets the list of items sold during the current transaction in the transaction summary.
     *
     * @param arrItems The ArrayList of items representing the items sold.
     */
    public void setItemsSold(ArrayList<Item> arrItems) {
        CTransacSummary.setItemsSoldMap(arrItems);
    }

    //-----------------------------------------------------------------------------
    // FEATURES
    
    /**
     * Displays all items available in the vending machine.
     *
     * @param CRegularVM The vending machine for which the items are to be displayed.
     * @return An ArrayList of strings representing the displayed items.
     */
    public ArrayList<String> displayAllItems(SVendingMachine CSpecialVM) {
        ArrayList<String> arrItems = new ArrayList<String>();

        HashMap<String, Integer> itemQuantityMap = new HashMap<>();

        for (Item CItem : CSpecialVM.getItems()) {
            String itemName = CItem.getName();
            int itemQuantity = itemQuantityMap.getOrDefault(itemName, 0);
            itemQuantity += CItem.getNumInstances();
            itemQuantityMap.put(itemName, itemQuantity);
        }
        
        for (Item CItem : CSpecialVM.getItems()) {
            String itemName = CItem.getName();
            int itemQuantity = itemQuantityMap.getOrDefault(itemName, 0);

            if (itemQuantity > 0) {
                String strSpace = "  ";
                String strSlot = CItem.getSlot() + "   ";
                String strName = itemName + "   ";
                float fCalories = CItem.getCalories();
                float fPrice = CItem.getPrice();
                int nNumInstance = itemQuantity;

                String strItem = strSpace + strSlot + strName + fCalories + strSpace + fPrice + strSpace + nNumInstance;

                if (!arrItems.contains(strItem)) {
                    arrItems.add(strItem);
                }

                itemQuantityMap.put(itemName, 0);
            }
        }

        Collections.sort(arrItems);
        return arrItems;
    }

    /**
     * Handles coin insertion for payment. Updates the temporary payment denominations
     * based on the number of 1 peso, 5 pesos, and 10 pesos coins inserted.
     *
     * @param n1Peso The number of 1 peso coins to be added.
     * @param n5Peso The number of 5 peso coins to be added.
     * @param n10Peso The number of 10 peso coins to be added.
     */
    public void handleCoinInsertion(int n1Peso, int n5Peso, int n10Peso) {
        while (n1Peso > 0) {
            CPayment.updateUserCoinDenom(1, CTempPayment);
            n1Peso--;
        }

        while (n5Peso > 0) {
            CPayment.updateUserCoinDenom(2, CTempPayment);
            n5Peso--;
        }

        while (n10Peso > 0) {
            CPayment.updateUserCoinDenom(3, CTempPayment);
            n10Peso--;
        }
    }

     /**
     * Handles bill insertion for payment. Updates the temporary payment denominations
     * based on the number of 20, 50, 100, 200, 500, and 1000 peso bills inserted.
     *
     * @param n20Peso The number of 20 peso bills to be added.
     * @param n50Peso The number of 50 peso bills to be added.
     * @param n100Peso The number of 100 peso bills to be added.
     * @param n200Peso The number of 200 peso bills to be added.
     * @param n500Peso The number of 500 peso bills to be added.
     * @param n1000Peso The number of 1000 peso bills to be added.
     */
    public void handleBillInsertion(int n20Peso, int n50Peso, int n100Peso, int n200Peso, int n500Peso, int n1000Peso) {
        while (n20Peso > 0) {
            CPayment.updateUserBillDenom(1, CTempPayment); 
            n20Peso--;
        }
        
        while (n50Peso > 0) {
            CPayment.updateUserBillDenom(2, CTempPayment);
            n50Peso--;
        }
        
        while (n100Peso > 0) {
            CPayment.updateUserBillDenom(3, CTempPayment); 
            n100Peso--;
        }

        while (n200Peso > 0) {
            CPayment.updateUserBillDenom(4, CTempPayment);
            n200Peso--;
        }

        while (n500Peso > 0) {
            CPayment.updateUserBillDenom(5, CTempPayment); 
            n500Peso--;
        }

        while (n1000Peso > 0) {
            CPayment.updateUserBillDenom(6, CTempPayment); 
            n1000Peso--;
        }
    }

    /**
     * Retrieves the total amount inserted by the user for the current transaction.
     *
     * @return The total amount inserted in the temporary payment denominations.
     */
    public float getAmountInserted() {
        return CTempPayment.calculateTotalAmount();
    }

    /**
     * Retrieves the temporary payment denominations used for the current transaction.
     *
     * @return The temporary payment denominations (coins and bills) used.
     */
    public Denominations getTempPayment() {
        return CTempPayment;
    }

    /**
     * Cancels the current purchase transaction, returning the inserted payment
     * in the temporary payment denominations to the user.
     */
    public void cancelPurchase() {
        arrReceipt = new ArrayList<String>();
        if (CTempPayment.calculateTotalAmount() > 0) {
            String strCancel = "---------------------------------------" + "\n" +
                               " Purchase cancelled." + "\n" + "Returning inserted payment...";
            arrReceipt.add(strCancel);
            CPayment.returnPayment(CTempPayment, arrReceipt);
            CTempPayment.resetDenominations();
            strCancel = "---------------------------------------";
            arrReceipt.add(strCancel);
        }
    }

    /**
     * Handles the purchase of the selected item from the vending machine.
     * Processes the payment, dispenses the item, and updates the vending machine's state
     * and the user's change, if applicable.
     *
     * @param CSpecialVM The vending machine to handle the item purchase.
     * @return True if the item is successfully purchased, false otherwise.
     */
    public boolean handleItemSelection(SVendingMachine CSpecialVM, String strSlot) {
        boolean bValidSlot = CSpecialVM.isSlotValid(strSlot);
            if (bValidSlot) {
                CSelectedItem = CSpecialVM.getItemBySlot(strSlot);
                
                if (CSelectedItem != null) {
                    if (CSelectedItem.getNumInstances() > 0) {
                        return true;
                    }
                }
            }
        return false;
    }

    /**
     * Resets the temporary payment denominations to zero, cancelling any current
     * payment process.
     */
    public void resetTempPaymentDenominations() {
        CTempPayment.resetDenominations();
    }

    public boolean handleItemPurchase(SVendingMachine CSpecialVM) {
        arrReceipt = new ArrayList<String>();

        String strReceipt = "---------------------------------------" + "\n" +
                            " Selected item   : " + CSelectedItem.getName() + "\n" +
                            " Purchase amount : " + CSelectedItem.getPrice() + "\n" +
                            "\n" + 
                            " Amount inserted : " + CTempPayment.calculateTotalAmount() + "\n";
        CPayment.setTotalAmount(CSelectedItem.getPrice());
        
        float fChange = CPayment.calculateChange(CSpecialVM, CTempPayment);

        if (fChange < 0) {
            strReceipt += "\n" + " Insufficient amount inserted." + "\n" + " Returning inserted payment...";
            arrReceipt.add(strReceipt);
            CPayment.returnPayment(CTempPayment, arrReceipt);
            CTempPayment.resetDenominations();
            strReceipt = "---------------------------------------";
            arrReceipt.add(strReceipt);
            return false;

        } else if (fChange == 0) {
            strReceipt += "\n" + " Change: " + fChange + "\n" +
                          " Dispensing " + CSelectedItem.getName() + " ..." + "\n" +
                          "---------------------------------------" + "\n" +
                          " Transaction successful." + "\n" + " Thank you for purchasing!";
            CSpecialVM.updateNumInstOfItemSold(CSelectedItem.getName(), CSelectedItem.getPrice());
            CSpecialVM.getItems().remove(CSelectedItem);
            CPaymentSlot.addDenomination(CTempPayment);
            arrReceipt.add(strReceipt);
            return true;
        
        } else {
            arrReceipt.add(strReceipt);

            boolean bIsSuccess = CPayment.produceChange(CSpecialVM, CPaymentSlot, CTempPayment, arrReceipt);
            if (bIsSuccess) {
                String strReceipt2 = " Dispensing " + CSelectedItem.getName() + " ..." + "\n";
                CSpecialVM.updateNumInstOfItemSold(CSelectedItem.getName(), CSelectedItem.getPrice());
                CSpecialVM.getItems().remove(CSelectedItem);
                strReceipt2 += "---------------------------------------" + "\n" +
                              " Transaction successful." + "\n" + " Thank you for purchasing!";
                arrReceipt.add(strReceipt2);
                return true;

            } else {
                String strReceipt3 = "\n" + " Returning inserted payment...";
                arrReceipt.add(strReceipt3);
                CPayment.returnPayment(CTempPayment, arrReceipt);
                CTempPayment.resetDenominations();
                String strReceipt4 = "---------------------------------------";
                arrReceipt.add(strReceipt4);
                return false;
            }
        }
    }

    /**
     * Calculates the change to be given to the user after a successful item purchase.
     * Determines the difference between the item's price and the amount inserted.
     *
     * @param CSpecialVM The vending machine for which the change is to be calculated.
     * @return The change to be given to the user.
     */
    public float calculateChange(SVendingMachine CSpecialVM) {
        float fChange = CPayment.calculateChange(CSpecialVM, CTempPayment);
        return fChange;
    }

   /**
     * Retrieves the receipt of the last transaction.
     *
     * @param CSpecialVM The vending machine for which the receipt is to be retrieved.
     * @return An ArrayList of strings representing the receipt.
     */
    public ArrayList<String> getReceipt(SVendingMachine CSpecialVM) {
        return arrReceipt;
    }

    public int getQuantity(String strName) {
        int nQuantity = instanceTracker.get(strName);
        return nQuantity - 1;
    }

}
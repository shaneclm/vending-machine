package com.models.vendingMachine;

import java.util.ArrayList;

import com.models.items.Item;
import com.models.denominations.Denominations;

/**
 * The VendingMachine class represents a vending machine that can store and sell items.
 * It also keeps track of the denominations (coins and bills) available for giving change.
 */
public class VendingMachine {
    protected ArrayList<Item> arrItems;
    protected ArrayList<Item> arrItemsSold;
    protected Denominations CVMDenominations;
    protected Item CNewItemSold;

    /**
     * Initializes a new instance of the VendingMachine class.
     */
    public VendingMachine() {
        this.arrItems = new ArrayList<Item>();
        this.arrItemsSold = new ArrayList<Item>();
        this.CVMDenominations = new Denominations();
    }
    
    /**
     * Inserts an item to the list of items in the vending machine.
     * 
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        arrItems.add(item);
    }

    /**
     * Checks if a particular slot is valid by searching for an item in the list of items with a matching slot.
     *
     * @param strSlot   The slot to check for validity.
     * @return True if a matching slot is found, false otherwise.
     */
    public boolean isSlotValid(String strSlot) {
        for (Item CItem : arrItems) {
            if (CItem.getSlot().equals(strSlot)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves the item based on a specified slot from the list of items in the vending machine.
     *
     * @param strSlot   The slot of the item to retrieve.
     * @return The item in the specified slot, null if no item is found.
     */
    public Item getItemBySlot(String strSlot) {
        for (Item CItem : arrItems) {
            if (CItem.getSlot().equals(strSlot)) {
                return CItem;
            }
        }
        return null;
    }

    /**
     * Checks if an item with the specified name exists in the vending machine.
     *
     * @param strName The name of the item to check for existence.
     * @return True if the item exists, false otherwise.
     */
    public boolean doesItemExist(String strName) {
        for (Item CItem : arrItems) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Updates the number of instances of an item sold.
     *
     * @param strName The name of the item that was sold.
     * @param fPrice The price of the item sold.
     */
    public void updateNumInstOfItemSold(String strName, float fPrice) {
        boolean bItemFound = false;

        for (Item CItemSold : arrItemsSold) {
            if (CItemSold.getName().equals(strName)) {
                CItemSold.setNumInstance(CItemSold.getNumInstances() + 1);
                bItemFound = true;
            }
        }

        if (!bItemFound) {
            CNewItemSold = new Item(strName, 1, fPrice);
            arrItemsSold.add(CNewItemSold);
        }
    }

    /**
     * obtains the list of items
     * 
     * <p>
     * Precondition : The arrItems ArrayList has been instantiated and contains
     * valid Item objects.
     * <p>
     * Postcondition: The list of items in the vending machine is returned.
     * 
     * @return the arraylist of items
     */
    public ArrayList<Item> getItems() {
        return this.arrItems;
    }

    /**
     * Obtains the list of items stored in the vending machine.
     * 
     * @return The ArrayList of items stored in the vending machine.
     */
    public ArrayList<Item> getItemsSold() {
        return this.arrItemsSold;
    }

     /**
     * Adjoins the provided denominations to the vending machine.
     * 
     * @param denominations The denominations instance that will be used to add in the vending machine.
     */
    public void setDenomination(Denominations Denominations) {
        this.CVMDenominations = Denominations;
    }

    /**
     * Retrieves the denominations of the vending machine.
     *
     * @return The Denominations object of the vending machine.
     */
    public Denominations getDenominations() {
        return CVMDenominations;
    }

}

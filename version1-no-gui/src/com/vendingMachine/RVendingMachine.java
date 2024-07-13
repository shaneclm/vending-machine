package com.vendingMachine;

import java.util.ArrayList;

import com.items.Item;
import com.denominations.Denominations;

public class RVendingMachine {

    private ArrayList<Item> arrItems;
    private ArrayList<Item> arrItemsSold;
    private Denominations   RVMDenominations;
    //private HashMap<String, Integer> itemsSoldMap = new HashMap<>();

    public RVendingMachine() {
        this.arrItems = new ArrayList<Item>();
        this.arrItemsSold = new ArrayList<Item>();
        this.RVMDenominations = new Denominations();
    }

    public void addItem(Item item) {
        arrItems.add(item);
    }

    public void removeItem(Item item) {
        arrItems.remove(item);
    }

    public boolean isSlotValid(String strSlot) {
        for (Item CItem : arrItems) {
            if (CItem.getSlot().equals(strSlot)) {
                return true; // if found
            }
        }
        return false; // not found
    }

    public Item getItemBySlot(String strSlot) {
        for (Item CItem : arrItems) {
            if (CItem.getSlot().equals(strSlot)) {
                return CItem; // if found
            }
        }
        return null; // not found
    }

    public void updateQtyOfItemSold(String strName, float fPrice) {
        boolean bItemFound = false;

        for (Item CItemSold : arrItemsSold) {
            if (CItemSold.getName().equals(strName)) {
                CItemSold.setQuantity(CItemSold.getQuantity() + 1);
                bItemFound = true;
            }
        }

        if (!bItemFound) {
            Item CNewItemSold = new Item(strName, 1, fPrice);
            arrItemsSold.add(CNewItemSold);
        }
    }

    public void addDenomination(Denominations denomination) {
        this.RVMDenominations = denomination;
    }

    public Denominations getDenominations() {
        return RVMDenominations;
    }

    public void setDenominations(Denominations RVMDenominations) {
        this.RVMDenominations = RVMDenominations;
    }

    public void displayCoins() {
        System.out.println("Coins Available: [" + RVMDenominations.get1Coins() + "] 1 PESO\t [" + RVMDenominations.get5Coins() + "] 5 PESO\t [" 
                                                + RVMDenominations.get10Coins() + "] 10 PESO");
    }

    public void displayBills() {
        System.out.println("Bills Available: [" + RVMDenominations.get20Bills() + "] 20 PESO\t [" + RVMDenominations.get50Bills() + "] 50 PESO\t [" 
                                                + RVMDenominations.get100Bills() + "] 100 PESO");
        System.out.println("                 [" + RVMDenominations.get200Bills() + "] 200 PESO\t [" + RVMDenominations.get500Bills() + "] 500 PESO\t [" 
                                                + RVMDenominations.get1000Bills() + "] 1000 PESO");
    }

    public ArrayList<Item> getItems() {
        return arrItems;
    }

    public ArrayList<Item> getItemsSold() {
        return arrItemsSold;
    }
    
}

package com.inventory;

import java.util.HashMap;
import java.util.ArrayList;

//import com.vendingMachine.RVendingMachine;
import com.items.Item;

public class Inventory {
    private HashMap<String, Integer> startingInventoryMap = new HashMap<>();
    private HashMap<String, Integer> endingInventoryMap   = new HashMap<>();
    private HashMap<String, Integer> itemsSoldMap         = new HashMap<>();
    
    private float fStartTotal = 0;
    private float fEndTotal   = 0;

    public void setStartingInventoryMap(ArrayList<Item> arrItems) {

        for (Item item : arrItems) {
            String strName = item.getName();
            int nItemQTY = item.getQuantity();
            this.fStartTotal += (float) (nItemQTY * item.getPrice());

            startingInventoryMap.put(strName, nItemQTY);
        }
    }

    public void setEndingInventoryMap(ArrayList<Item> arrItems) {

        for (Item item : arrItems) {
            String strName = item.getName();
            int nItemQTY = item.getQuantity();
            this.fEndTotal += (float) (nItemQTY * item.getPrice());

            endingInventoryMap.put(strName, nItemQTY);
        }
    }

    public void setItemsSoldMap(ArrayList<Item> arrItemsSold) {
        for (Item item : arrItemsSold) {
            String strName = item.getName();
            int nStartQTY = startingInventoryMap.getOrDefault(strName, 0);
            int nEndQTY = endingInventoryMap.getOrDefault(strName, 0);

            int nSoldQTY = nStartQTY - nEndQTY;
            
            if (nSoldQTY > 0) {
                this.itemsSoldMap.put(strName, nSoldQTY);
            }
        }
    }

    public void displayTransactionSummary() {
        System.out.println("\t\tTransaction Summary\n");

        System.out.println("\tStarting Inventory:");
        displayInventoryMap(startingInventoryMap);
        System.out.println("\n\tTotal Value of Items in Starting Inventory: " + fStartTotal + "\n");

        System.out.println("\tEnding Inventory:");
        displayInventoryMap(endingInventoryMap);
        System.out.println("\n\tTotal Value of Items in Ending Inventory: " + fEndTotal + "\n");

        System.out.println("\tItems Sold:");
        displayInventoryMap(itemsSoldMap);
        System.out.println("\n\tTotal Amount Collected in Sales: " + (fStartTotal - fEndTotal));

    }

    public void displayInventoryMap(HashMap<String, Integer> inventoryMap) {
        System.out.println("\n\t| " + String.format("%-15s", "ITEM") + " | " + String.format("%3s", "QTY") + " | ");

        for (String strItemName : inventoryMap.keySet()) {
            int nItemQTY = inventoryMap.get(strItemName);
            
            System.out.println("\t| " + String.format("%-15s", strItemName) + " | " + String.format("%3s", nItemQTY) + " | ");
        }
    }

    public void resetInventory() {
        startingInventoryMap.clear();
        endingInventoryMap.clear();
        itemsSoldMap.clear();
        fStartTotal = 0;
        fEndTotal = 0;
    }

}
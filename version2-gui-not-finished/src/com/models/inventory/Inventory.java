package com.models.inventory;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

import com.models.items.Item;

/**
 * the class represents an inventory management system that provides methods to
 * set and display the starting inventory, ending inventory, and items sold
 * 
 */
public class Inventory {
    private HashMap<String, Integer> startingInventoryMap;
    private HashMap<String, Integer> endingInventoryMap;
    private HashMap<String, Integer> itemsSoldMap;

    private float fStartTotal;
    private float fEndTotal;

    /**
     * Constructs an Inventory object with empty starting, ending, and items sold maps, and initializes
     * the start and end total to zero.
     */
    public Inventory() {
        startingInventoryMap = new HashMap<String, Integer>();
        endingInventoryMap   = new HashMap<String, Integer>();
        itemsSoldMap         = new HashMap<String, Integer>();

        fStartTotal = 0;
        fEndTotal   = 0;
    }

    /**
     * Displays the starting inventory map as an ArrayList of formatted strings.
     *
     * @return An ArrayList of formatted strings representing the starting inventory.
     */
    public ArrayList<String> displayStartInventoryMap() {
        ArrayList<String> arrItems = new ArrayList<String>();

        ArrayList<String> sortedItems = new ArrayList<>(startingInventoryMap.keySet());
        
        HashMap<String, Integer> itemQuantityMap = new HashMap<>();

        for (String strItemName : sortedItems) {

            int nItemQTY        = startingInventoryMap.get(strItemName);
            String strSpace     = "        ";
            String strLongSpace = "                                        ";

            String strItem = strSpace + strItemName + strLongSpace + nItemQTY;
            if (!arrItems.contains(strItem)) {
                    arrItems.add(strItem);
            }

        }

        Collections.sort(arrItems);
        return arrItems;
    }

    /**
     * Displays the ending inventory map as an ArrayList of formatted strings.
     *
     * @return An ArrayList of formatted strings representing the ending inventory.
     */
    public ArrayList<String> displayEndInventoryMap() {
        ArrayList<String> arrItems = new ArrayList<String>();

        ArrayList<String> sortedItems = new ArrayList<>(endingInventoryMap.keySet());
        
        HashMap<String, Integer> itemQuantityMap = new HashMap<>();

        for (String strItemName : sortedItems) {

            int nItemQTY        = endingInventoryMap.get(strItemName);
            String strSpace     = "        ";
            String strLongSpace = "                                        ";

            String strItem = strSpace + strItemName + strLongSpace + nItemQTY;
            if (!arrItems.contains(strItem)) {
                    arrItems.add(strItem);
            }

        }

        Collections.sort(arrItems);
        return arrItems;
    }

    /**
     * Displays the items sold map as an ArrayList of formatted strings.
     *
     * @return An ArrayList of formatted strings representing the items sold.
     */
    public ArrayList<String> displayItemsSold() {
        ArrayList<String> arrItems = new ArrayList<String>();

        ArrayList<String> sortedItems = new ArrayList<>(itemsSoldMap.keySet());
        
        HashMap<String, Integer> itemQuantityMap = new HashMap<>();

        for (String strItemName : sortedItems) {

            int nItemQTY        = itemsSoldMap.get(strItemName);
            String strSpace     = "        ";
            String strLongSpace = "                                        ";

            String strItem = strSpace + strItemName + strLongSpace + nItemQTY;
            if (!arrItems.contains(strItem)) {
                    arrItems.add(strItem);
            }

        }

        Collections.sort(arrItems);
        return arrItems;
    }

    /**
     * Resets the inventory by clearing the starting, ending, and items sold maps, and setting the start and end
     * total to zero.
     */
    public void resetInventory() {
        startingInventoryMap.clear();
        endingInventoryMap.clear();
        itemsSoldMap.clear();
        fStartTotal = 0;
        fEndTotal = 0;
    }

    /**
     * Sets the starting inventory map based on the provided list of items.
     *
     * @param arrItems The ArrayList of Item objects representing the starting inventory.
     */
    public void setStartingInventoryMap(ArrayList<Item> arrItems) {
        HashMap<String, Integer> itemQuantities = new HashMap<>();

        for (Item CItem : arrItems) {
            String strName = CItem.getName();
            int nItemQTY = CItem.getNumInstances();

            float itemValue = nItemQTY * CItem.getPrice();
            this.fStartTotal += itemValue;

            itemQuantities.put(strName, itemQuantities.getOrDefault(strName, 0) + nItemQTY);
        }

        startingInventoryMap = itemQuantities;
    }

    /**
     * Sets the ending inventory map based on the provided list of items.
     *
     * @param arrItems The ArrayList of Item objects representing the ending inventory.
     */
    public void setEndingInventoryMap(ArrayList<Item> arrItems) {
        HashMap<String, Integer> itemQuantities = new HashMap<>();

        for (Item CItem : arrItems) {
            String strName = CItem.getName();
            int nItemQTY = CItem.getNumInstances();
            
            float itemValue = nItemQTY * CItem.getPrice();
            this.fEndTotal += itemValue;

            itemQuantities.put(strName, itemQuantities.getOrDefault(strName, 0) + nItemQTY);
        }

        endingInventoryMap = itemQuantities;
    }

    /**
     * Sets the items sold map based on the provided list of items sold.
     *
     * @param arrItemsSold The ArrayList of Item objects representing the items sold.
     */
    public void setItemsSoldMap(ArrayList<Item> arrItemsSold) {
        for (Item CItem : arrItemsSold) {
            String strName = CItem.getName();
            int nStartQTY = startingInventoryMap.getOrDefault(strName, 0);
            int nEndQTY = endingInventoryMap.getOrDefault(strName, 0);

            int nSoldQTY = nStartQTY - nEndQTY;
            if (nSoldQTY > 0) {
                this.itemsSoldMap.put(strName, nSoldQTY);
            }
        }
    }

}


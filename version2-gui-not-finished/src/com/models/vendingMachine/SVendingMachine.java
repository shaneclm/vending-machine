package com.models.vendingMachine;

import com.models.denominations.Denominations;
import com.models.items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * The SVendingMachine class is a subclass of VendingMachine that represents a specialized vending machine
 * capable of handling additional add-ons for items. It manages a list of available items, a list of sold items,
 * and denominations for change within the vending machine.
 */
public class SVendingMachine extends VendingMachine {

    /**
     * Initializes a new instance of the SVendingMachine class.
     */
    public SVendingMachine() {
        this.arrItems         = new ArrayList<Item>();
        this.arrItemsSold     = new ArrayList<Item>();
        this.CVMDenominations = new Denominations();
    }

     /**
     * Returns the count of unique items within the specified category.
     *
     * @param category the category of items to count
     * @return the count of unique items within the specified category
     */
    public int getUniqueItemsCount(String category) {
        int nCount = 0;
        Set<String> uniqueNames = new HashSet<>();

        for (Item item : arrItems) {
            if (category.equalsIgnoreCase(item.getCategory()) && !uniqueNames.contains(item.getName())) {
                uniqueNames.add(item.getName());
                nCount++;
            }
        }

        return nCount;
    }

    /**
     * Displays the add-ons available within the specified add-on category.
     *
     * @param addOnCategory the add-on category to display
     */


}



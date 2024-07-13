package com.models.vendingMachine;

import java.util.ArrayList;

import com.models.items.Item;
import com.models.denominations.Denominations;

/**
 * The RVendingMachine class is a subclass of VendingMachine that manages a list of available items,
 * a list of sold items, and denominations for change within the vending machine.
 */
public class RVendingMachine extends VendingMachine {

    /**
     * Initializes a new instance of the RVendingMachine class.
     */
    public RVendingMachine() {
        this.arrItems         = new ArrayList<Item>();
        this.arrItemsSold     = new ArrayList<Item>();
        this.CVMDenominations = new Denominations();
    }

}

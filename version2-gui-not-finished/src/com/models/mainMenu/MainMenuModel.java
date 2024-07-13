package com.models.mainMenu;

import com.models.vendingMachine.*;

/**
 * Represents the model for the main menu of a vending machine application.
 * This class provides methods to create regular and special vending machines.
 */
public class MainMenuModel {
    private RVendingMachine  CRegularVM;
    private SVendingMachine  CSpecialVM;
    
    /**
     * Initializes the MainMenuModel with regular and special vending machines set to null.
     */
    public MainMenuModel() {
        RVendingMachine  CRegularVM       = null;
        SVendingMachine  CSpecialVM       = null;
    }
    
    /**
     * Creates a new regular vending machine.
     * 
     * @return The created regular vending machine (CRegularVM) or null if creation failed.
     */
    public VendingMachine createRegularVM() {
        CRegularVM = new RVendingMachine();

        if (CRegularVM != null){
            return CRegularVM;
        }

        return null;
    }

     /**
     * Creates a new special vending machine.
     * 
     * @return The created special vending machine (CSpecialVM) or null if creation failed.
     */
    public VendingMachine createSpecialVM() {
        CSpecialVM = new SVendingMachine();

        if (CSpecialVM != null) {
            return CSpecialVM;
        }

        return null;
    }
    
    /**
     * Exits the vending machine application by terminating the program.
     */
    public void exitVM() {
        System.exit(0);
    }


}

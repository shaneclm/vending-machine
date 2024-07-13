package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for restocking items in the regular vending machine.
 * This class handles user interactions with the restock item view and controls actions
 * such as searching for an item, validating the quantity to add, and restocking the item.
 */
public class SVMRestockItemController {    
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private SVMRestockMenuView CSVMRestockMenuView;
    private RestockItemView CSVMRestockItemView;
    
    /**
     * Constructor for the SVMRestockItemController class.
     *
     * @param CSpecialVM          the regular vending machine model
     * @param CSVMMenu            the SVMMenu object associated with the regular vending machine
     * @param CSVMRestockMenuView the view for the restock menu of the regular vending machine
     * @param CSVMRestockItemView the view for restocking items in the regular vending machine
     */
    public SVMRestockItemController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVMRestockMenuView CSVMRestockMenuView, RestockItemView CSVMRestockItemView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMRestockMenuView = CSVMRestockMenuView;
        this.CSVMRestockItemView = CSVMRestockItemView;
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the restock item view.
     * Listens for events such as searching for an item and restocking the item.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Search" button in the restock item view of a regular vending machine.
         */
        CSVMRestockItemView.setSearchButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                String strName = CSVMRestockItemView.getItemName();
                boolean bItemExists = CSpecialVM.doesItemExist(strName);

                if (bItemExists) {
                    int nCurrentQTY = CSVMMenu.getCurrentQuantity(CSpecialVM, strName);
                    CSVMRestockItemView.updateCurrentQTY(nCurrentQTY - 1);
                }
                else {
                    CSVMRestockMenuView.setPrompt("Item does not exist.");
                    CSVMRestockItemView.setVisible(false);
                    CSVMRestockMenuView.setVisible(true);
                }
            }
        });

         /**
         * ActionListener for the "Done" button in the restock item view of a regular vending machine.
         */
        CSVMRestockItemView.setDoneButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                String strName = CSVMRestockItemView.getItemName();
                int nEnterQTY = (Integer.parseInt(CSVMRestockItemView.getEnterQTY()));

                int nValidAddQTY = CSVMMenu.isQuantityToAddValid(CSpecialVM, strName, nEnterQTY);
                if (nValidAddQTY == -1) {
                    CSVMRestockItemView.setPrompt("Invalid quantity. Enter a positive value.");
                }
                else if (nValidAddQTY == 0) {
                    CSVMRestockItemView.setPrompt("Invalid Quantity. Maximum quantity per item is only 20.");
                }
                else if (nValidAddQTY == 1) {
                    boolean bIsItemRestocked = CSVMMenu.restockItem(CSpecialVM, strName, nEnterQTY);
                    if (bIsItemRestocked) {
                        CSVMRestockMenuView.setPrompt("Restock successful!");
                        CSVMRestockItemView.clearTextFields();
                        CSVMRestockItemView.setVisible(false);
                        CSVMRestockMenuView.setVisible(true);
                    }
                    else {
                        CSVMRestockMenuView.setPrompt("Error: Restock unsuccessful.");
                        CSVMRestockItemView.clearTextFields();
                        CSVMRestockItemView.setVisible(false);
                        CSVMRestockMenuView.setVisible(true);
                    }
                }
                
                
                
            }
        });
    }
}

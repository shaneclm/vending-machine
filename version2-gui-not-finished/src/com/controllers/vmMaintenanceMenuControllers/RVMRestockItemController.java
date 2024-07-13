package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for restocking items in the regular vending machine.
 * This class handles user interactions with the restock item view and controls actions
 * such as searching for an item, validating the quantity to add, and restocking the item.
 */
public class RVMRestockItemController {    
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private RestockMenuView CRVMRestockMenuView;
    private RestockItemView CRVMRestockItemView;
    
    /**
     * Constructor for the RVMRestockItemController class.
     *
     * @param CRegularVM          the regular vending machine model
     * @param CRVMMenu            the RVMMenu object associated with the regular vending machine
     * @param CRVMRestockMenuView the view for the restock menu of the regular vending machine
     * @param CRVMRestockItemView the view for restocking items in the regular vending machine
     */
    public RVMRestockItemController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, RestockMenuView CRVMRestockMenuView, RestockItemView CRVMRestockItemView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMRestockMenuView = CRVMRestockMenuView;
        this.CRVMRestockItemView = CRVMRestockItemView;
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
        CRVMRestockItemView.setSearchButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMRestockItemView.setVisible(true);
                CRVMRestockMenuView.setVisible(false);

                String strName = CRVMRestockItemView.getItemName();
                boolean bItemExists = CRegularVM.doesItemExist(strName);

                if (bItemExists) {
                    int nCurrentQTY = CRVMMenu.getCurrentQuantity(CRegularVM, strName);
                    CRVMRestockItemView.updateCurrentQTY(nCurrentQTY);
                }
                else {
                    CRVMRestockMenuView.setPrompt("Item does not exist.");
                    CRVMRestockItemView.setVisible(false);
                    CRVMRestockMenuView.setVisible(true);
                }
            }
        });

         /**
         * ActionListener for the "Done" button in the restock item view of a regular vending machine.
         */
        CRVMRestockItemView.setDoneButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
                String strName = CRVMRestockItemView.getItemName();
                int nEnterQTY = (Integer.parseInt(CRVMRestockItemView.getEnterQTY()));
                
                int nValidAddQTY = CRVMMenu.isQuantityToAddValid(CRegularVM, strName, nEnterQTY);
                if (nValidAddQTY == -1) {
                    CRVMRestockItemView.setPrompt("Invalid quantity. Enter a positive value.");
                }
                else if (nValidAddQTY == 0) {
                    CRVMRestockItemView.setPrompt("Invalid Quantity. Maximum quantity per item is only 20.");
                }
                else if (nValidAddQTY == 1) {
                    boolean bIsItemRestocked = CRVMMenu.restockItem(CRegularVM, strName, nEnterQTY);
                    if (bIsItemRestocked) {
                        CRVMRestockMenuView.setPrompt("Restock successful!");
                        CRVMRestockItemView.clearTextFields();
                        CRVMRestockItemView.setVisible(false);
                        CRVMRestockMenuView.setVisible(true);
                    }
                    else {
                        CRVMRestockMenuView.setPrompt("Error: Restock unsuccessful.");
                        CRVMRestockItemView.clearTextFields();
                        CRVMRestockItemView.setVisible(false);
                        CRVMRestockMenuView.setVisible(true);
                    }
                }
                
                
                
            }
        });
    }
}

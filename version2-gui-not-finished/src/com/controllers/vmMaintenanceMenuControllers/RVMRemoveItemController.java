package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for removing items from the regular vending machine.
 * This class handles user interactions with the remove item view and controls actions
 * such as removing an item from the vending machine.
 */
public class RVMRemoveItemController {    
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private StockMenuView CRVMStockMenuView;
    private RemoveItemView CRVMRemoveItemView;
    
    /**
     * Constructor for the RVMRemoveItemController class.
     *
     * @param CRegularVM          the regular vending machine model
     * @param CRVMMenu            the RVMMenu object associated with the regular vending machine
     * @param CRVMStockMenuView   the view for the stock menu of the regular vending machine
     * @param CRVMRemoveItemView  the view for removing items from the regular vending machine
     */
    public RVMRemoveItemController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, StockMenuView CRVMStockMenuView, RemoveItemView CRVMRemoveItemView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMStockMenuView = CRVMStockMenuView;
        this.CRVMRemoveItemView = CRVMRemoveItemView;        
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the remove item view.
     * Listens for the "Remove" button and removes the specified item from the vending machine.
     * Displays appropriate prompts based on the success or failure of the removal process.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Remove" button in the remove item view of a regular vending machine.
         */
        CRVMRemoveItemView.setRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMRemoveItemView.setVisible(true);
                CRVMStockMenuView.setVisible(false);

                String strName = CRVMRemoveItemView.getItemName();
                boolean bIsItemRemoved = false;
                
                bIsItemRemoved = CRVMMenu.removeItem(CRegularVM, strName);

                if (bIsItemRemoved) {
                    CRVMStockMenuView.setPrompt("Item successfully removed!");
                    CRVMRemoveItemView.clearTextFields();
                    CRVMRemoveItemView.setVisible(false);
                    CRVMStockMenuView.setVisible(true);
                }            
                else {
                    CRVMStockMenuView.setPrompt("Item does not exist.");
                    CRVMRemoveItemView.clearTextFields();
                    CRVMRemoveItemView.setVisible(false);
                    CRVMStockMenuView.setVisible(true);                    
                }
            }
        });
    }
}

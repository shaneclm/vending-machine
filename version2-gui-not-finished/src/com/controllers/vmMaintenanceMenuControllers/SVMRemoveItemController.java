package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.vmMaintenanceMenuViews.RemoveItemView;
import com.views.vmMaintenanceMenuViews.SVMRestockMenuView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SVMRemoveItemController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private SVMRestockMenuView CSVMRestockMenuView;
    private RemoveItemView CSVMRemoveItemView;

    public SVMRemoveItemController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVMRestockMenuView CSVMRestockMenuView, RemoveItemView CSVMRemoveItemView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMRestockMenuView = CSVMRestockMenuView;
        this.CSVMRemoveItemView = CSVMRemoveItemView;        
        initializeListeners();
    }

    public void initializeListeners() {
        /**
         * ActionListener for the "Remove" button in the remove item view of a regular vending machine.
         */
        CSVMRemoveItemView.setRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMRemoveItemView.setVisible(true);
                CSVMRestockMenuView.setVisible(false);

                String strName = CSVMRemoveItemView.getItemName();
                boolean bIsItemRemoved = false;
                
                bIsItemRemoved = CSVMMenu.removeItem(CSpecialVM, strName);

                if (bIsItemRemoved) {
                    CSVMRestockMenuView.setPrompt("Item successfully removed!");
                    CSVMRemoveItemView.clearTextFields();
                    CSVMRemoveItemView.setVisible(false);
                    CSVMRestockMenuView.setVisible(true);
                }            
                else {
                    CSVMRestockMenuView.setPrompt("Item does not exist.");
                    CSVMRemoveItemView.clearTextFields();
                    CSVMRemoveItemView.setVisible(false);
                    CSVMRestockMenuView.setVisible(true);                    
                }
            }
        });
    }
}

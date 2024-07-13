package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.vmMaintenanceMenuViews.SVMMaintenanceMenuView;
import com.views.vmMaintenanceMenuViews.SVMRestockMenuView;
import com.views.vmMaintenanceMenuViews.RestockItemView;
import com.views.vmMaintenanceMenuViews.RemoveItemView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the stock menu of a Special vending machine in the
 * vending machine maintenance menu.
 * This class handles user interactions with the stock menu view and controls actions
 * such as adding new items, removing items, and finishing stock management.
 */
public class SVMRestockMenuController {
    private SVMMaintenanceMenuView CSVMMaintenanceMenuView;
    private SVMRestockMenuView CSVMRestockMenuView;
    private RestockItemView CSVMRestockItemView;
    private RemoveItemView CSVMRemoveItemView;
    private SVMRestockItemController CSVMRestockItemController;
    private SVMRemoveItemController CSVMRemoveItemController;

     /**
     * Constructor for the SVMStockMenuController class.
     *
     * @param CSpecialVM              the Special vending machine to manage
     * @param CSVMMenu                the SVMMenu object associated with the Special vending machine
     * @param CSVMMaintenanceMenuView the main view for the vending machine maintenance menu
     * @param CSVMStockMenuView       the view for the stock menu of the Special vending machine
     */
    public SVMRestockMenuController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVMMaintenanceMenuView CSVMMaintenanceMenuView, SVMRestockMenuView CSVMRestockMenuView) {
        this.CSVMMaintenanceMenuView = CSVMMaintenanceMenuView;
        this.CSVMRestockMenuView = CSVMRestockMenuView;
        this.CSVMRestockItemView = new RestockItemView();
        this.CSVMRemoveItemView = new RemoveItemView();
        this.CSVMRestockItemController = new SVMRestockItemController(CSpecialVM, CSVMMenu, CSVMRestockMenuView, CSVMRestockItemView);        
        this.CSVMRemoveItemController = new SVMRemoveItemController(CSpecialVM, CSVMMenu, CSVMRestockMenuView, CSVMRemoveItemView);
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the stock menu view.
     * Listens for events such as adding items, removing items, and finishing stock management.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Add" button in the stock menu view of a Special vending machine.
         */
        CSVMRestockMenuView.setRestockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMRestockItemView.setVisible(true);
                CSVMRestockMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Remove" button in the stock menu view of a Special vending machine.
         */
        CSVMRestockMenuView.setRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMRemoveItemView.setVisible(true);
                CSVMRestockMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Finish" button in the stock menu view of a Special vending machine.
         */
        CSVMRestockMenuView.setFinishButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMMaintenanceMenuView.setVisible(true);
                CSVMRestockItemView.setVisible(false);     
            } 
        });
    }
}

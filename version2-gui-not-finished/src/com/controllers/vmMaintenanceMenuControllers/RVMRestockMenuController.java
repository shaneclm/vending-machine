package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.RestockItemView;
import com.views.vmMaintenanceMenuViews.RestockMenuView;
import com.views.vmMaintenanceMenuViews.RVMMaintenanceMenuView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for the restock menu of a regular vending machine in the vending machine maintenance mode.
 * This class handles the user interactions with the restock menu view, such as clicking the "Restock" button
 * to access the restock item view or clicking the "Finish" button to return to the vending machine maintenance menu.
 */
public class RVMRestockMenuController {
    private RVMMaintenanceMenuView CRVMMaintenanceMenuView;
    private RestockMenuView CRVMRestockMenuView;
    private RestockItemView CRVMRestockItemView;
    private RVMRestockItemController CRVMRestockItemController;
    
    /**
     * Initializes the `RVMRestockMenuController` with the required views and controllers.
     *
     * @param CRegularVM              the regular vending machine model
     * @param CRVMMenu                the regular vending machine menu model
     * @param CRVMMaintenanceMenuView the vending machine maintenance menu view
     * @param CRVMRestockMenuView     the restock menu view of the regular vending machine
     */
    public RVMRestockMenuController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, RVMMaintenanceMenuView CRVMMaintenanceMenuView, RestockMenuView CRVMRestockMenuView) {
        this.CRVMMaintenanceMenuView = CRVMMaintenanceMenuView;
        this.CRVMRestockMenuView = CRVMRestockMenuView;
        this.CRVMRestockItemView = new RestockItemView();
        this.CRVMRestockItemController = new RVMRestockItemController(CRegularVM, CRVMMenu, CRVMRestockMenuView, CRVMRestockItemView);
        initializeListeners();
    }

    /**
     * Initializes the action listeners for the buttons in the restock menu view.
     * The "Restock" button allows the user to access the restock item view, and the
     * "Finish" button returns the user to the vending machine maintenance menu.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Restock" button.
         */
        CRVMRestockMenuView.setRestockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMRestockItemView.setVisible(true);
                CRVMRestockMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Finish" button.
         */
        CRVMRestockMenuView.setFinishButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMMaintenanceMenuView.setVisible(true);
                CRVMRestockItemView.setVisible(false);                
            } 
        });
    }
}

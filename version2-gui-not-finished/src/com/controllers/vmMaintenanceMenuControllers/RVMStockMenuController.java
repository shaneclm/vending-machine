package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.RVMMaintenanceMenuView;
import com.views.vmMaintenanceMenuViews.StockMenuView;
import com.views.vmMaintenanceMenuViews.RVMItemCategoryView;
import com.views.vmMaintenanceMenuViews.RemoveItemView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the stock menu of a regular vending machine in the
 * vending machine maintenance menu.
 * This class handles user interactions with the stock menu view and controls actions
 * such as adding new items, removing items, and finishing stock management.
 */
public class RVMStockMenuController {
    private RVendingMachine CRegularVM;
    private RVMMaintenanceMenuView CRVMMaintenanceMenuView;
    private StockMenuView CRVMStockMenuView;
    private RVMItemCategoryView CRVMAddNewItemCategView;
    private RemoveItemView CRVMRemoveItemView;
    private RVMItemCategoryController CRVMItemCategController;
    private RVMRemoveItemController CRVMRemoveItemController;

     /**
     * Constructor for the RVMStockMenuController class.
     *
     * @param CRegularVM              the regular vending machine to manage
     * @param CRVMMenu                the RVMMenu object associated with the regular vending machine
     * @param CRVMMaintenanceMenuView the main view for the vending machine maintenance menu
     * @param CRVMStockMenuView       the view for the stock menu of the regular vending machine
     */
    public RVMStockMenuController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, RVMMaintenanceMenuView CRVMMaintenanceMenuView, StockMenuView CRVMStockMenuView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMaintenanceMenuView = CRVMMaintenanceMenuView;
        this.CRVMStockMenuView = CRVMStockMenuView;
        this.CRVMAddNewItemCategView = new RVMItemCategoryView();
        this.CRVMRemoveItemView = new RemoveItemView();
        this.CRVMItemCategController = new RVMItemCategoryController(CRegularVM, CRVMMenu, CRVMStockMenuView, CRVMAddNewItemCategView);
        this.CRVMRemoveItemController = new RVMRemoveItemController(CRegularVM, CRVMMenu, CRVMStockMenuView, CRVMRemoveItemView);
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the stock menu view.
     * Listens for events such as adding items, removing items, and finishing stock management.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Add" button in the stock menu view of a regular vending machine.
         */
        CRVMStockMenuView.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (CRegularVM.getItems().size() < 200) {   // Means that all 10 vending machine slots are occupied.
                    CRVMAddNewItemCategView.setVisible(true);
                    CRVMStockMenuView.setVisible(false);
                }
                else {
                    CRVMStockMenuView.setPrompt("Error: All vending machine slots are occupied.");
                }
            }
        });

        /**
         * ActionListener for the "Remove" button in the stock menu view of a regular vending machine.
         */
        CRVMStockMenuView.setRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMRemoveItemView.setVisible(true);
                CRVMStockMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Finish" button in the stock menu view of a regular vending machine.
         */
        CRVMStockMenuView.setFinishButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMStockMenuView.setVisible(false);
                CRVMMaintenanceMenuView.setVisible(true);
            } 
        });
    }
}

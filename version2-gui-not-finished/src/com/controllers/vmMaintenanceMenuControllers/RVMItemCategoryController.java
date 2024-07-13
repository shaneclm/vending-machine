package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.AddNewItemView;
import com.views.vmMaintenanceMenuViews.RVMItemCategoryView;
import com.views.vmMaintenanceMenuViews.StockMenuView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the item category selection in the maintenance menu of a regular vending machine.
 * This class handles user interactions with the item category selection view and controls actions
 * such as storing the selected item category and navigating to the view for adding a new item.
 */
public class RVMItemCategoryController {
    private RVMMenu CRVMMenu;
    private RVMItemCategoryView CAddNewItemCategView;
    private AddNewItemView CAddNewItemView;
    private RVMAddNewItemController CRVMItemCategController;

    /**
     * Constructor for the RVMItemCategoryController class.
     *
     * @param CRegularVM          the regular vending machine model
     * @param CRVMMenu            the RVMMenu object associated with the regular vending machine
     * @param CRVMStockMenuView   the view for the stock menu of the regular vending machine
     * @param CAddNewItemCategView the view for selecting the item category for adding a new item
     */
    public RVMItemCategoryController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, StockMenuView CRVMStockMenuView, RVMItemCategoryView CAddNewItemCategView) {
        this.CRVMMenu = CRVMMenu;
        this.CAddNewItemCategView = CAddNewItemCategView;
        this.CAddNewItemView = new AddNewItemView();
        this.CRVMItemCategController = new RVMAddNewItemController(CRegularVM, CAddNewItemView, CRVMMenu, CRVMStockMenuView);
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the item category selection view.
     * Listens for events such as selecting a viand, rice, or beverage category,
     * and navigates to the view for adding a new item after selecting the category.
     */
    public void initializeListeners() {
        // ActionListener for the "Viand" button in the item category selection view.
        CAddNewItemCategView.setViandButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMMenu.storeItemCateg("Viand");                
                // AddNewItemView CAddNewItemView = new AddNewItemView(); 
                // RVMAddNewItemController CRVMItemCategController = new RVMAddNewItemController(CRegularVM, CAddNewItemView, CRVMMenu, CRVMStockMenuView);
                // alternative w/o error: new AddNewItemController(CRegularVM, CAddNewItemView, CRVMMenu, CRVMStockMenuView);
                CAddNewItemCategView.setVisible(false);
                CAddNewItemView.setVisible(true);
            } 
        });

        // ActionListener for the "Rice" button in the item category selection view.
        CAddNewItemCategView.setRiceButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMMenu.storeItemCateg("Rice");
                // AddNewItemView CAddNewItemView = new AddNewItemView(); 
                // RVMAddNewItemController CRVMItemCategController = new RVMAddNewItemController(CRegularVM, CAddNewItemView, CRVMMenu, CRVMStockMenuView);

                CAddNewItemCategView.setVisible(false);
                CAddNewItemView.setVisible(true);
                
            } 
        });

        // ActionListener for the "Beverage" button in the item category selection view.
        CAddNewItemCategView.setBeverageButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMMenu.storeItemCateg("Beverage");                
                // AddNewItemView CAddNewItemView = new AddNewItemView(); 
                // RVMAddNewItemController CRVMItemCategController = new RVMAddNewItemController(CRegularVM, CAddNewItemView, CRVMMenu, CRVMStockMenuView);

                CAddNewItemCategView.setVisible(false);
                CAddNewItemView.setVisible(true);
                
            } 
        });
    }
}

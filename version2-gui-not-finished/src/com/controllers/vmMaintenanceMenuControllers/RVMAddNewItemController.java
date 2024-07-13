package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for adding a new item to the regular vending machine in the maintenance menu.
 * This class handles user interactions with the view for adding a new item and controls actions
 * such as validating the item details and adding the item to the vending machine's stock.
 */
public class RVMAddNewItemController {
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private StockMenuView CRVMStockMenuView;
    private AddNewItemView CAddNewItemView;
    
    /**
     * Constructor for the RVMAddNewItemController class.
     *
     * @param CRegularVM          the regular vending machine model
     * @param CAddNewItemView     the view for adding a new item
     * @param CRVMMenu            the RVMMenu object associated with the regular vending machine
     * @param CRVMStockMenuView   the view for the stock menu of the regular vending machine
     */
    public RVMAddNewItemController(RVendingMachine CRegularVM, AddNewItemView CAddNewItemView, RVMMenu CRVMMenu, StockMenuView CRVMStockMenuView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMStockMenuView = CRVMStockMenuView;
        this.CAddNewItemView = CAddNewItemView;        
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the view for adding a new item.
     * Listens for the "Add" button click and handles the process of adding a new item
     * to the vending machine's stock after validating the item details.
     */
    public void initializeListeners() {
        // ActionListener for the "Add" button in the view for adding a new item.
        CAddNewItemView.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CAddNewItemView.setVisible(true);
                CRVMStockMenuView.setVisible(false);

                String strName = CAddNewItemView.getItemName();
                int nQuantity = CAddNewItemView.getSpinnerValue();
                float fPrice = CAddNewItemView.getItemPrice();
                float fCalories = CAddNewItemView.getItemCalories();

                boolean bIsQuantityValid = CRVMMenu.isItemQuantityValid(nQuantity);
                boolean bIsItemAdded = false;
                
                if (bIsQuantityValid) {
                    bIsItemAdded = CRVMMenu.addNewItem(CRegularVM, strName, nQuantity, fPrice, fCalories);
                    
                    if (bIsItemAdded) {
                        CRVMStockMenuView.setPrompt("Item successfully added!");
                        CAddNewItemView.setVisible(false);
                        CRVMStockMenuView.setVisible(true);
                        CAddNewItemView.clearTextFields();
                    }
                    else {
                        CAddNewItemView.setPrompt("Error: Item addition failed. Please try again.");
                    }   

                }
                else {
                    CAddNewItemView.setPrompt("Invalid quantity. Item slot can only hold 10 to 20 items.");
                }
            }
        });
    }
}


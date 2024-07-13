package com.controllers.vmTestFeaturesMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.vmFeaturesViews.SVendingMachineView;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;
import com.views.vmFeaturesViews.SVMCustomizeView;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the special vending machine during the test features.
 * This class handles user interactions with the special vending machine view during the test features
 * and controls actions such as loading coins and bills, processing purchases, customizing the machine,
 * and updating the view accordingly.
 */
public class SVMCustomizeController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private SVendingMachineView CSVendingMachineView;
    private SVMCustomizeView CSVMCustomizeView;

    
    public SVMCustomizeController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVendingMachineView CSVendingMachineView, SVMCustomizeView CSVMCustomizeView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVendingMachineView = CSVendingMachineView;
        this.CSVMCustomizeView = CSVMCustomizeView;
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the special vending machine view during the test features.
     * Listens for events such as clicking the load button to add coins and bills,
     * processing purchases, customizing the machine, and updating the view accordingly.
     */
    public void initializeListeners() {           
        CSVMCustomizeView.setCancelButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMMenu.cancelPurchase();         
                CSVMCustomizeView.cancelPurchase();
                CSVMCustomizeView.setDenomInputTextField(String.valueOf(CSVMMenu.getAmountInserted()));
                ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
                CSVMCustomizeView.updateReceiptTextArea(arrReceipt);
            }
        });

        // CSVMCustomizeView.setProceedButtonListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent evt) {
        //         float fAmountInserted = CSVMMenu.getAmountInserted();
                
        //         if (fAmountInserted > 0) {
        //             // if payment is inserted, proceed to slot validation
        //             String strSlot = CSVMCustomizeView.getSlotEntered();
        //             boolean bValidSlot = CSpecialVM.isSlotValid(strSlot);
        //             if (bValidSlot) {
        //                 // if slot is valid, handle item selection
        //                 boolean bItemAvail = CSVMMenu.handleItemSelection(CSpecialVM, strSlot);
        //                 if (bItemAvail) {
        //                     boolean bSuccess = CSVMMenu.handleItemPurchase(CSpecialVM);
        //                     if (bSuccess) {
        //                         ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
        //                         CSVMCustomizeView.updateReceiptTextArea(arrReceipt);
        //                     }
        //                     else {
        //                         ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
        //                         CSVMCustomizeView.updateReceiptTextArea(arrReceipt);
        //                     }
        //                 }
        //             }
        //             else {
        //                 CSVMCustomizeView.setPrompt("Invalid slot.");
        //             }
        //         }
        //         else {
        //             CSVMCustomizeView.setPrompt("Please insert payment first.");
        //         } 

        //         CSVMMenu.resetTempPaymentDenominations();
        //         CSVMCustomizeView.clearDenomInputTextField();
        //     }
            
        // });


    }
}

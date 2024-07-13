package com.controllers.vmTestFeaturesMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmFeaturesViews.RVendingMachineView;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the vending machine during the test features.
 * This class handles user interactions with the vending machine view during the test features
 * and controls actions such as loading coins and bills, processing purchases, and updating the view accordingly.
 */
public class RVendingMachineController {
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private VMTestFeaturesMenuView CRVMTestFeaturesMenuView;
    private RVendingMachineView CRVendingMachineView;

    /**
     * Constructor for the RVendingMachineController class.
     *
     * @param CRegularVM               the regular vending machine model
     * @param CRVMMenu                 the RVMMenu object associated with the regular vending machine
     * @param CRVMTestFeaturesMenuView the view for the test features menu of the regular vending machine
     * @param CRVendingMachineView     the view for the main menu of the regular vending machine
     */
    public RVendingMachineController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, VMTestFeaturesMenuView CRVMTestFeaturesMenuView, RVendingMachineView CRVendingMachineView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMTestFeaturesMenuView = CRVMTestFeaturesMenuView;
        this.CRVendingMachineView = CRVendingMachineView;
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the vending machine view during the test features.
     * Listens for events such as clicking the load button to add coins and bills,
     * processing purchases, and updating the view accordingly.
     */
    public void initializeListeners() {
        CRVendingMachineView.setLoadButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            CRVendingMachineView.clearReceiptTextArea();
            CRVendingMachineView.clearSlotEntered();
                
            int n1Peso = (CRVendingMachineView.get1PesoSpinnerValue());
            int n5Peso = (CRVendingMachineView.get5PesoSpinnerValue());
            int n10Peso = (CRVendingMachineView.get10PesoSpinnerValue());

            int n20Peso = (CRVendingMachineView.get20PesoSpinnerValue());
            int n50Peso = (CRVendingMachineView.get50PesoSpinnerValue());
            int n100Peso = (CRVendingMachineView.get100PesoSpinnerValue());
            int n200Peso = (CRVendingMachineView.get200PesoSpinnerValue());
            int n500Peso = (CRVendingMachineView.get500PesoSpinnerValue());
            int n1000Peso = (CRVendingMachineView.get1000PesoSpinnerValue());

            CRVMMenu.handleCoinInsertion(n1Peso, n5Peso, n10Peso);
            CRVMMenu.handleBillInsertion(n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);

            Denominations CTest = CRVMMenu.getTempPayment();

            CRVendingMachineView.set1PesoField(String.valueOf(CTest.get1Coins()));
            CRVendingMachineView.set5PesoField(String.valueOf(CTest.get5Coins()));
            CRVendingMachineView.set10PesoField(String.valueOf(CTest.get10Coins()));
            CRVendingMachineView.set20PesoField(String.valueOf(CTest.get20Bills()));
            CRVendingMachineView.set50PesoField(String.valueOf(CTest.get50Bills()));
            CRVendingMachineView.set100PesoField(String.valueOf(CTest.get100Bills()));
            CRVendingMachineView.set200PesoField(String.valueOf(CTest.get200Bills()));
            CRVendingMachineView.set500PesoField(String.valueOf(CTest.get500Bills()));
            CRVendingMachineView.set1000PesoField(String.valueOf(CTest.get1000Bills()));

            CRVendingMachineView.setDenomInputTextField(String.valueOf(CRVMMenu.getAmountInserted()));

            CRVendingMachineView.clearDenomSpinnerValues();

            }
        });

        CRVendingMachineView.setCancelButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CRVMMenu.cancelPurchase();         
                CRVendingMachineView.cancelPurchase();
                CRVendingMachineView.setDenomInputTextField(String.valueOf(CRVMMenu.getAmountInserted()));
                ArrayList<String> arrReceipt = CRVMMenu.getReceipt(CRegularVM);
                CRVendingMachineView.updateReceiptTextArea(arrReceipt);
            }
        });

        CRVendingMachineView.setProceedButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                float fAmountInserted = CRVMMenu.getAmountInserted();
                
                if (fAmountInserted > 0) {
                    // if payment is inserted, proceed to slot validation
                    String strSlot = CRVendingMachineView.getSlotEntered();
                    boolean bValidSlot = CRegularVM.isSlotValid(strSlot);
                    if (bValidSlot) {
                        // if slot is valid, handle item selection
                        boolean bItemAvail = CRVMMenu.handleItemSelection(CRegularVM, strSlot);
                        if (bItemAvail) {
                            boolean bSuccess = CRVMMenu.handleItemPurchase(CRegularVM);
                            if (bSuccess) {
                                ArrayList<String> arrReceipt = CRVMMenu.getReceipt(CRegularVM);
                                CRVendingMachineView.updateReceiptTextArea(arrReceipt);
                            }
                            else {
                                ArrayList<String> arrReceipt = CRVMMenu.getReceipt(CRegularVM);
                                CRVendingMachineView.updateReceiptTextArea(arrReceipt);
                            }
                        }
                    }
                    else {
                        CRVendingMachineView.setPrompt("Invalid slot.");
                    }
                }
                else {
                    CRVendingMachineView.setPrompt("Please insert payment first.");
                } 

                CRVMMenu.resetTempPaymentDenominations();
                CRVendingMachineView.clearDenomInputTextField();
                CRVendingMachineView.updateItemTextArea(CRVMMenu.displayAllItems(CRegularVM));
            }
            
        });

        CRVendingMachineView.setEndVMTestButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                  CRVMTestFeaturesMenuView.setVisible(true);
                  CRVendingMachineView.setVisible(false);
            }
        });




    }
}

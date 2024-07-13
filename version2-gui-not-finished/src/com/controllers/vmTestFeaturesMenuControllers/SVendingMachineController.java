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
public class SVendingMachineController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private VMTestFeaturesMenuView CSVMTestFeaturesMenuView;
    private SVendingMachineView CSVendingMachineView;
    private SVMCustomizeView CSVMCustomizeView;

    /**
     * Constructor for the SVendingMachineController class.
     *
     * @param CSpecialVM            the special vending machine model
     * @param CSVMMenu              the SVMMenu object associated with the special vending machine
     * @param CSVMTestFeaturesMenuView the view for the test features menu of the special vending machine
     * @param CSVendingMachineView     the view for the main menu of the special vending machine
     */
    public SVendingMachineController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, VMTestFeaturesMenuView CSVMTestFeaturesMenuView, SVendingMachineView CSVendingMachineView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMTestFeaturesMenuView = CSVMTestFeaturesMenuView;
        this.CSVendingMachineView = CSVendingMachineView;
        this.CSVMCustomizeView = new SVMCustomizeView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the special vending machine view during the test features.
     * Listens for events such as clicking the load button to add coins and bills,
     * processing purchases, customizing the machine, and updating the view accordingly.
     */
    public void initializeListeners() {
        CSVendingMachineView.setLoadButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            CSVendingMachineView.clearReceiptTextArea();
            CSVendingMachineView.clearSlotEntered();
            
            int n1Peso = (CSVendingMachineView.get1PesoSpinnerValue());
            int n5Peso = (CSVendingMachineView.get5PesoSpinnerValue());
            int n10Peso = (CSVendingMachineView.get10PesoSpinnerValue());

            int n20Peso = (CSVendingMachineView.get20PesoSpinnerValue());
            int n50Peso = (CSVendingMachineView.get50PesoSpinnerValue());
            int n100Peso = (CSVendingMachineView.get100PesoSpinnerValue());
            int n200Peso = (CSVendingMachineView.get200PesoSpinnerValue());
            int n500Peso = (CSVendingMachineView.get500PesoSpinnerValue());
            int n1000Peso = (CSVendingMachineView.get1000PesoSpinnerValue());

            CSVMMenu.handleCoinInsertion(n1Peso, n5Peso, n10Peso);
            CSVMMenu.handleBillInsertion(n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);

            Denominations CTest = CSVMMenu.getTempPayment();

            CSVendingMachineView.set1PesoField(String.valueOf(CTest.get1Coins()));
            CSVendingMachineView.set5PesoField(String.valueOf(CTest.get5Coins()));
            CSVendingMachineView.set10PesoField(String.valueOf(CTest.get10Coins()));
            CSVendingMachineView.set20PesoField(String.valueOf(CTest.get20Bills()));
            CSVendingMachineView.set50PesoField(String.valueOf(CTest.get50Bills()));
            CSVendingMachineView.set100PesoField(String.valueOf(CTest.get100Bills()));
            CSVendingMachineView.set200PesoField(String.valueOf(CTest.get200Bills()));
            CSVendingMachineView.set500PesoField(String.valueOf(CTest.get500Bills()));
            CSVendingMachineView.set1000PesoField(String.valueOf(CTest.get1000Bills()));

            CSVendingMachineView.setDenomInputTextField(String.valueOf(CSVMMenu.getAmountInserted()));

            CSVendingMachineView.clearDenomSpinnerValues();

            }
        });
             

        CSVendingMachineView.setCancelButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMMenu.cancelPurchase();         
                CSVendingMachineView.cancelPurchase();
                CSVendingMachineView.setDenomInputTextField(String.valueOf(CSVMMenu.getAmountInserted()));
                ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
                CSVendingMachineView.updateReceiptTextArea(arrReceipt);
            }
        });

        CSVendingMachineView.setProceedButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                float fAmountInserted = CSVMMenu.getAmountInserted();
                
                if (fAmountInserted > 0) {
                    // if payment is inserted, proceed to slot validation
                    String strSlot = CSVendingMachineView.getSlotEntered();
                    boolean bValidSlot = CSpecialVM.isSlotValid(strSlot);
                    if (bValidSlot) {
                        // if slot is valid, handle item selection
                        boolean bItemAvail = CSVMMenu.handleItemSelection(CSpecialVM, strSlot);
                        if (bItemAvail) {
                            boolean bSuccess = CSVMMenu.handleItemPurchase(CSpecialVM);
                            if (bSuccess) {
                                ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
                                CSVendingMachineView.updateReceiptTextArea(arrReceipt);
                            }
                            else {
                                ArrayList<String> arrReceipt = CSVMMenu.getReceipt(CSpecialVM);
                                CSVendingMachineView.updateReceiptTextArea(arrReceipt);
                            }
                        }
                    }
                    else {
                        CSVendingMachineView.setPrompt("Invalid slot.");
                    }
                }
                else {
                    CSVendingMachineView.setPrompt("Please insert payment first.");
                } 

                CSVMMenu.resetTempPaymentDenominations();
                CSVendingMachineView.clearDenomInputTextField();
            }
            
        });

        CSVendingMachineView.setCustomizeButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SVMCustomizeController CSVMCustomizeController = new SVMCustomizeController(CSpecialVM, CSVMMenu, CSVendingMachineView, CSVMCustomizeView);
                CSVMCustomizeView.setVisible(true);
                CSVendingMachineView.setVisible(false);
                
                CSVMCustomizeView.clearReceiptTextArea();
                // CSVMCustomizeView.clearSlotEntered();
                
                int n1Peso = (CSVMCustomizeView.get1PesoSpinnerValue());
                int n5Peso = (CSVMCustomizeView.get5PesoSpinnerValue());
                int n10Peso = (CSVMCustomizeView.get10PesoSpinnerValue());

                int n20Peso = (CSVMCustomizeView.get20PesoSpinnerValue());
                int n50Peso = (CSVMCustomizeView.get50PesoSpinnerValue());
                int n100Peso = (CSVMCustomizeView.get100PesoSpinnerValue());
                int n200Peso = (CSVMCustomizeView.get200PesoSpinnerValue());
                int n500Peso = (CSVMCustomizeView.get500PesoSpinnerValue());
                int n1000Peso = (CSVMCustomizeView.get1000PesoSpinnerValue());

                CSVMMenu.handleCoinInsertion(n1Peso, n5Peso, n10Peso);
                CSVMMenu.handleBillInsertion(n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);

                Denominations CTest = CSVMMenu.getTempPayment();

                CSVMCustomizeView.set1PesoField(String.valueOf(CTest.get1Coins()));
                CSVMCustomizeView.set5PesoField(String.valueOf(CTest.get5Coins()));
                CSVMCustomizeView.set10PesoField(String.valueOf(CTest.get10Coins()));
                CSVMCustomizeView.set20PesoField(String.valueOf(CTest.get20Bills()));
                CSVMCustomizeView.set50PesoField(String.valueOf(CTest.get50Bills()));
                CSVMCustomizeView.set100PesoField(String.valueOf(CTest.get100Bills()));
                CSVMCustomizeView.set200PesoField(String.valueOf(CTest.get200Bills()));
                CSVMCustomizeView.set500PesoField(String.valueOf(CTest.get500Bills()));
                CSVMCustomizeView.set1000PesoField(String.valueOf(CTest.get1000Bills()));

                CSVMCustomizeView.setDenomInputTextField(String.valueOf(CSVMMenu.getAmountInserted()));

                CSVMCustomizeView.clearDenomSpinnerValues();

                CSVMCustomizeView.setA1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Beef Tapa")));
                CSVMCustomizeView.setA2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Bacon")));
                CSVMCustomizeView.setA3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Hotdog")));
                CSVMCustomizeView.setA4QTYTextField(String.valueOf(CSVMMenu.getQuantity("Longganisa")));
                CSVMCustomizeView.setA5QTYTextField(String.valueOf(CSVMMenu.getQuantity("Bangus")));
                CSVMCustomizeView.setB1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Plain Rice")));
                CSVMCustomizeView.setB2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Sinangag")));
                CSVMCustomizeView.setC1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Water")));
                CSVMCustomizeView.setC2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Coffee")));
                CSVMCustomizeView.setC3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Orange Juice")));
                CSVMCustomizeView.setD1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Fried Egg")));
                CSVMCustomizeView.setD2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Scrambled Egg")));
                CSVMCustomizeView.setE1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Tomato Slices")));
                CSVMCustomizeView.setE2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Cucumber Slices")));
                CSVMCustomizeView.setE3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Atchara")));
                CSVMCustomizeView.setF1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Ketchup")));
                CSVMCustomizeView.setF2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Soy Sauce")));
                CSVMCustomizeView.setF3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Vinegar")));
            }
        });

        CSVendingMachineView.setEndVMTestButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CSVMTestFeaturesMenuView.setVisible(true);
                CSVendingMachineView.setVisible(false);
            }
        });




    }
}

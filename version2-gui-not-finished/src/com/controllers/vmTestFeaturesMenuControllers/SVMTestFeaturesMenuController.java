package com.controllers.vmTestFeaturesMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.VMMenuView;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;
import com.views.vmFeaturesViews.SVendingMachineView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the test features menu of a special vending machine.
 * This class handles user interactions with the test features menu view and controls actions
 * such as starting the test, processing coin and bill insertions, and updating denominations and item quantities.
 */
public class SVMTestFeaturesMenuController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private VMMenuView CSVMMenuView;
    private VMTestFeaturesMenuView CSVMTestFeaturesMenuView;
    private SVendingMachineView CSVendingMachineView;
    
    /**
     * Constructor for the SVMTestFeaturesMenuController class.
     *
     * @param CSpecialVM               the special vending machine model
     * @param CSVMMenu                 the SVMMenu object associated with the special vending machine
     * @param CSVMTestFeaturesMenuView the view for the test features menu of the special vending machine
     * @param CSVMMenuView             the view for the main menu of the special vending machine
     */
    public SVMTestFeaturesMenuController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, VMTestFeaturesMenuView CSVMTestFeaturesMenuView, VMMenuView CSVMMenuView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMMenuView = CSVMMenuView;
        this.CSVMTestFeaturesMenuView = CSVMTestFeaturesMenuView;
        this.CSVendingMachineView = new SVendingMachineView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the test features menu view.
     * Listens for events such as clicking the start button to begin the test,
     * and processing coin and bill insertions during the test.
     */
    public void initializeListeners() {
        CSVMTestFeaturesMenuView.setStartButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SVendingMachineController CSVMFeaturesController = new SVendingMachineController(CSpecialVM, CSVMMenu, CSVMTestFeaturesMenuView, CSVendingMachineView);
                CSVendingMachineView.setVisible(true);
		        CSVMTestFeaturesMenuView.setVisible(false);
                
                int n1Peso = (CSVendingMachineView.get1PesoSpinnerValue());
                int n5Peso = (CSVendingMachineView.get5PesoSpinnerValue());
                int n10Peso = (CSVendingMachineView.get10PesoSpinnerValue());
                        
                CSVMMenu.handleCoinInsertion(n1Peso, n5Peso, n10Peso);

                int n20Peso = (CSVendingMachineView.get20PesoSpinnerValue());
                int n50Peso = (CSVendingMachineView.get50PesoSpinnerValue());
                int n100Peso = (CSVendingMachineView.get100PesoSpinnerValue());
                int n200Peso = (CSVendingMachineView.get200PesoSpinnerValue());
                int n500Peso = (CSVendingMachineView.get500PesoSpinnerValue());
                int n1000Peso = (CSVendingMachineView.get1000PesoSpinnerValue());

                CSVMMenu.handleBillInsertion(n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);
                
                Denominations CTempPayment = CSVMMenu.getTempPayment();
                CSVendingMachineView.set1PesoField(String.valueOf(CTempPayment.get1Coins()));
                CSVendingMachineView.set5PesoField(String.valueOf(CTempPayment.get5Coins()));
                CSVendingMachineView.set10PesoField(String.valueOf(CTempPayment.get10Coins()));
                CSVendingMachineView.set20PesoField(String.valueOf(CTempPayment.get20Bills()));
                CSVendingMachineView.set50PesoField(String.valueOf(CTempPayment.get50Bills()));
                CSVendingMachineView.set100PesoField(String.valueOf(CTempPayment.get100Bills()));
                CSVendingMachineView.set200PesoField(String.valueOf(CTempPayment.get200Bills()));
                CSVendingMachineView.set500PesoField(String.valueOf(CTempPayment.get500Bills()));
                CSVendingMachineView.set1000PesoField(String.valueOf(CTempPayment.get1000Bills()));

                CSVendingMachineView.setA1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Beef Tapa")));
                CSVendingMachineView.setA2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Bacon")));
                CSVendingMachineView.setA3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Hotdog")));
                CSVendingMachineView.setA4QTYTextField(String.valueOf(CSVMMenu.getQuantity("Longganisa")));
                CSVendingMachineView.setA5QTYTextField(String.valueOf(CSVMMenu.getQuantity("Bangus")));
                CSVendingMachineView.setB1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Plain Rice")));
                CSVendingMachineView.setB2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Sinangag")));
                CSVendingMachineView.setC1QTYTextField(String.valueOf(CSVMMenu.getQuantity("Water")));
                CSVendingMachineView.setC2QTYTextField(String.valueOf(CSVMMenu.getQuantity("Coffee")));
                CSVendingMachineView.setC3QTYTextField(String.valueOf(CSVMMenu.getQuantity("Orange Juice")));
            }
        });

        CSVMTestFeaturesMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMMenuView.setVisible(true);
		        CSVMTestFeaturesMenuView.setVisible(false);
            }
        });
    }

}

package com.controllers.vmTestFeaturesMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.VMMenuView;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;
import com.views.vmFeaturesViews.RVendingMachineView;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the test features menu of a regular vending machine.
 * This class handles user interactions with the test features menu view and controls actions
 * such as starting the test, processing coin and bill insertions, and updating denominations.
 */
public class RVMTestFeaturesMenuController {
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private VMMenuView CRVMMenuView;
    private VMTestFeaturesMenuView CRVMTestFeaturesMenuView;
    private RVendingMachineView CRVendingMachineView;
    
    /**
     * Constructor for the RVMTestFeaturesMenuController class.
     *
     * @param CRegularVM               the regular vending machine model
     * @param CRVMMenu                 the RVMMenu object associated with the regular vending machine
     * @param CRVMTestFeaturesMenuView the view for the test features menu of the regular vending machine
     * @param CRVMMenuView             the view for the main menu of the regular vending machine
     */
    public RVMTestFeaturesMenuController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, VMTestFeaturesMenuView CRVMTestFeaturesMenuView, VMMenuView CRVMMenuView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMMenuView = CRVMMenuView;
        this.CRVMTestFeaturesMenuView = CRVMTestFeaturesMenuView;
        this.CRVendingMachineView = new RVendingMachineView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the test features menu view.
     * Listens for events such as clicking the start button to begin the test,
     * and processing coin and bill insertions during the test.
     */

    public void initializeListeners() {
        CRVMTestFeaturesMenuView.setStartButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                RVendingMachineController CRVMFeaturesController = new RVendingMachineController(CRegularVM, CRVMMenu, CRVMTestFeaturesMenuView, CRVendingMachineView);
                CRVendingMachineView.setVisible(true);
		        CRVMTestFeaturesMenuView.setVisible(false);
                
                ArrayList<String> arrItems = CRVMMenu.displayAllItems(CRegularVM);
                CRVendingMachineView.updateItemTextArea(arrItems);

                int n1Peso = (CRVendingMachineView.get1PesoSpinnerValue());
                int n5Peso = (CRVendingMachineView.get5PesoSpinnerValue());
                int n10Peso = (CRVendingMachineView.get10PesoSpinnerValue());
                        
                CRVMMenu.handleCoinInsertion(n1Peso, n5Peso, n10Peso);

                int n20Peso = (CRVendingMachineView.get20PesoSpinnerValue());
                int n50Peso = (CRVendingMachineView.get50PesoSpinnerValue());
                int n100Peso = (CRVendingMachineView.get100PesoSpinnerValue());
                int n200Peso = (CRVendingMachineView.get200PesoSpinnerValue());
                int n500Peso = (CRVendingMachineView.get500PesoSpinnerValue());
                int n1000Peso = (CRVendingMachineView.get1000PesoSpinnerValue());

                CRVMMenu.handleBillInsertion(n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);
                

                Denominations CTempPayment = CRVMMenu.getTempPayment();
                CRVendingMachineView.set1PesoField(String.valueOf(CTempPayment.get1Coins()));
                CRVendingMachineView.set5PesoField(String.valueOf(CTempPayment.get5Coins()));
                CRVendingMachineView.set10PesoField(String.valueOf(CTempPayment.get10Coins()));
                CRVendingMachineView.set20PesoField(String.valueOf(CTempPayment.get20Bills()));
                CRVendingMachineView.set50PesoField(String.valueOf(CTempPayment.get50Bills()));
                CRVendingMachineView.set100PesoField(String.valueOf(CTempPayment.get100Bills()));
                CRVendingMachineView.set200PesoField(String.valueOf(CTempPayment.get200Bills()));
                CRVendingMachineView.set500PesoField(String.valueOf(CTempPayment.get500Bills()));
                CRVendingMachineView.set1000PesoField(String.valueOf(CTempPayment.get1000Bills()));
            }
        });

        CRVMTestFeaturesMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMMenuView.setVisible(true);
		        CRVMTestFeaturesMenuView.setVisible(false);
            }
        });
    }

}

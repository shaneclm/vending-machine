package com.controllers.vmMaintenanceMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.VMMenuView;
import com.views.vmMaintenanceMenuViews.SVMMaintenanceMenuView;
import com.views.vmMaintenanceMenuViews.SVMRestockMenuView;
import com.views.vmMaintenanceMenuViews.CollectPaymentView;
import com.views.vmMaintenanceMenuViews.ReplenishDenomView;
import com.views.vmMaintenanceMenuViews.TransacSummaryView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the maintenance menu of a Special vending machine.
 * This class handles user interactions with the maintenance menu view and controls actions
 * such as navigating to stock management, restocking, collecting payments, replenishing denominations,
 * and displaying transaction summaries.
 */
public class SVMMaintenanceMenuController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private VMMenuView CSVMMenuView;
    private SVMMaintenanceMenuView CSVMMaintenanceMenuView;
    private SVMRestockMenuView CSVMRestockMenuView;
    private CollectPaymentView CSVMCollectPaymentView;
    private ReplenishDenomView CSVMReplenishDenomView;
    private TransacSummaryView CSVMTransacSummaryView;
    
    /**
     * Constructor for the SVMMaintenanceMenuController class.
     *
     * @param CSpecialVM             the Special vending machine model
     * @param CSVMMenu               the SVMMenu object associated with the Special vending machine
     * @param CSVMMaintenanceMenuView the main view for the vending machine maintenance menu
     * @param CSVMMenuView           the main view for the vending machine menu
     */
    public SVMMaintenanceMenuController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVMMaintenanceMenuView CSVMMaintenanceMenuView, VMMenuView CSVMMenuView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMMenuView = CSVMMenuView;
        this.CSVMMaintenanceMenuView = CSVMMaintenanceMenuView;
        this.CSVMRestockMenuView = new SVMRestockMenuView();
        this.CSVMCollectPaymentView = new CollectPaymentView();
        this.CSVMReplenishDenomView = new ReplenishDenomView();
        this.CSVMTransacSummaryView = new TransacSummaryView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the maintenance menu view.
     * Listens for events such as stock management, restocking, collecting payments,
     * replenishing denominations, displaying transaction summaries, and exiting the maintenance menu.
     */
    public void initializeListeners() {
        /**
         * ActionListener for the "Stock" button in the maintenance menu view.
         */
        CSVMMaintenanceMenuView.setRestockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SVMRestockMenuController CSVMRestockMenuController = new SVMRestockMenuController(CSpecialVM, CSVMMenu, CSVMMaintenanceMenuView, CSVMRestockMenuView);
                CSVMRestockMenuView.setVisible(true);
                CSVMMaintenanceMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Collect Payment" button in the maintenance menu view.
         */
        CSVMMaintenanceMenuView.setCollectButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMCollectPaymentView.setVisible(true);
                CSVMMaintenanceMenuView.setVisible(false);
                float fTotalPayment = 0;
                
                fTotalPayment = CSVMMenu.collectPayment();
                CSVMCollectPaymentView.setPrompt(fTotalPayment);

                CSVMCollectPaymentView.setDoneButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        CSVMCollectPaymentView.setVisible(false);
                        CSVMMaintenanceMenuView.setVisible(true);
                    }
                });
            }
        });

        /**
         * ActionListener for the "Replenish Denomination" button in the maintenance menu view.
         */
        CSVMMaintenanceMenuView.setReplenishButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMReplenishDenomView.setVisible(true);
                CSVMMaintenanceMenuView.setVisible(false);             
                
                int n1Peso = (CSVMReplenishDenomView.get1PesoSpinnerValue());
                int n5Peso = (CSVMReplenishDenomView.get5PesoSpinnerValue());
                int n10Peso = (CSVMReplenishDenomView.get10PesoSpinnerValue());
                        
                CSVMMenu.addCoins(CSpecialVM, n1Peso, n5Peso, n10Peso);

                int n20Peso = (CSVMReplenishDenomView.get20PesoSpinnerValue());
                int n50Peso = (CSVMReplenishDenomView.get50PesoSpinnerValue());
                int n100Peso = (CSVMReplenishDenomView.get100PesoSpinnerValue());
                int n200Peso = (CSVMReplenishDenomView.get200PesoSpinnerValue());
                int n500Peso = (CSVMReplenishDenomView.get500PesoSpinnerValue());
                int n1000Peso = (CSVMReplenishDenomView.get1000PesoSpinnerValue());

                CSVMMenu.addBills(CSpecialVM, n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);

                Denominations CSVMDenom = CSpecialVM.getDenominations();
                CSVMReplenishDenomView.set1PesoField(String.valueOf(CSVMDenom.get1Coins()));
                CSVMReplenishDenomView.set5PesoField(String.valueOf(CSVMDenom.get5Coins()));
                CSVMReplenishDenomView.set10PesoField(String.valueOf(CSVMDenom.get10Coins()));
                CSVMReplenishDenomView.set20PesoField(String.valueOf(CSVMDenom.get20Bills()));
                CSVMReplenishDenomView.set50PesoField(String.valueOf(CSVMDenom.get50Bills()));
                CSVMReplenishDenomView.set100PesoField(String.valueOf(CSVMDenom.get100Bills()));
                CSVMReplenishDenomView.set200PesoField(String.valueOf(CSVMDenom.get200Bills()));
                CSVMReplenishDenomView.set500PesoField(String.valueOf(CSVMDenom.get500Bills()));
                CSVMReplenishDenomView.set1000PesoField(String.valueOf(CSVMDenom.get1000Bills()));

                // save 
                CSVMReplenishDenomView.setSaveButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        int n1Peso = (CSVMReplenishDenomView.get1PesoSpinnerValue());
                        int n5Peso = (CSVMReplenishDenomView.get5PesoSpinnerValue());
                        int n10Peso = (CSVMReplenishDenomView.get10PesoSpinnerValue());
                                
                        CSVMMenu.addCoins(CSpecialVM, n1Peso, n5Peso, n10Peso);

                        int n20Peso = (CSVMReplenishDenomView.get20PesoSpinnerValue());
                        int n50Peso = (CSVMReplenishDenomView.get50PesoSpinnerValue());
                        int n100Peso = (CSVMReplenishDenomView.get100PesoSpinnerValue());
                        int n200Peso = (CSVMReplenishDenomView.get200PesoSpinnerValue());
                        int n500Peso = (CSVMReplenishDenomView.get500PesoSpinnerValue());
                        int n1000Peso = (CSVMReplenishDenomView.get1000PesoSpinnerValue());

                        CSVMMenu.addBills(CSpecialVM, n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);
                        

                        CSVMMenu.replenishDenom(CSpecialVM);
                        Denominations CTest = CSpecialVM.getDenominations();

                        CSVMReplenishDenomView.clearTextFields();
                        CSVMMaintenanceMenuView.setVisible(true);
                        CSVMReplenishDenomView.setVisible(false);
                    }
                });
            }
        });

        /**
         * ActionListener for the "Transaction Summary" button in the maintenance menu view.
         */
        CSVMMaintenanceMenuView.setTransacButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SVMTransacSummaryController CSVMTransacSummaryController = new SVMTransacSummaryController(CSpecialVM, CSVMMenu, CSVMMaintenanceMenuView, CSVMTransacSummaryView);
                CSVMTransacSummaryView.setVisible(true);
                CSVMMaintenanceMenuView.setVisible(false); 
                
            }
        });
        
        /**
         * ActionListener for the "Exit" button in the maintenance menu view.
         */
        CSVMMaintenanceMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		        CSVMMaintenanceMenuView.setVisible(false);
                CSVMMenuView.setVisible(true);
            }
        });
    }
}
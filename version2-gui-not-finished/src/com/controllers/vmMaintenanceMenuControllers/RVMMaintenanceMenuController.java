package com.controllers.vmMaintenanceMenuControllers;

import com.models.denominations.Denominations;
import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.VMMenuView;
import com.views.vmMaintenanceMenuViews.RVMMaintenanceMenuView;
import com.views.vmMaintenanceMenuViews.StockMenuView;
import com.views.vmMaintenanceMenuViews.RestockMenuView;
import com.views.vmMaintenanceMenuViews.CollectPaymentView;
import com.views.vmMaintenanceMenuViews.ReplenishDenomView;
import com.views.vmMaintenanceMenuViews.TransacSummaryView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the maintenance menu of a regular vending machine.
 * This class handles user interactions with the maintenance menu view and controls actions
 * such as navigating to stock management, restocking, collecting payments, replenishing denominations,
 * and displaying transaction summaries.
 */
public class RVMMaintenanceMenuController {
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private VMMenuView CRVMMenuView;
    private RVMMaintenanceMenuView CRVMMaintenanceMenuView;
    private StockMenuView CRVMStockMenuView;
    private RestockMenuView CRVMRestockMenuView;
    private CollectPaymentView CRVMCollectPaymentView;
    private ReplenishDenomView CRVMReplenishDenomView;
    private TransacSummaryView CRVMTransacSummaryView;
    
    /**
     * Constructor for the RVMMaintenanceMenuController class.
     *
     * @param CRegularVM             the regular vending machine model
     * @param CRVMMenu               the RVMMenu object associated with the regular vending machine
     * @param CRVMMaintenanceMenuView the main view for the vending machine maintenance menu
     * @param CRVMMenuView           the main view for the vending machine menu
     */
    public RVMMaintenanceMenuController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, RVMMaintenanceMenuView CRVMMaintenanceMenuView, VMMenuView CRVMMenuView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMMenuView = CRVMMenuView;
        this.CRVMMaintenanceMenuView = CRVMMaintenanceMenuView;
        this.CRVMStockMenuView = new StockMenuView();
        this.CRVMRestockMenuView = new RestockMenuView();
        this.CRVMCollectPaymentView = new CollectPaymentView();
        this.CRVMReplenishDenomView = new ReplenishDenomView();
        this.CRVMTransacSummaryView = new TransacSummaryView();
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
        CRVMMaintenanceMenuView.setStockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                RVMStockMenuController CRVMStockMenuController = new RVMStockMenuController(CRegularVM, CRVMMenu, CRVMMaintenanceMenuView, CRVMStockMenuView);
                CRVMStockMenuView.setVisible(true);
                CRVMMaintenanceMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Restock" button in the maintenance menu view.
         */
        CRVMMaintenanceMenuView.setRestockButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                RVMRestockMenuController CRVMRestockMenuController = new RVMRestockMenuController(CRegularVM, CRVMMenu, CRVMMaintenanceMenuView, CRVMRestockMenuView);
                CRVMRestockMenuView.setVisible(true);
                CRVMMaintenanceMenuView.setVisible(false);
            }
        });

        /**
         * ActionListener for the "Collect Payment" button in the maintenance menu view.
         */
        CRVMMaintenanceMenuView.setCollectButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMCollectPaymentView.setVisible(true);
                CRVMMaintenanceMenuView.setVisible(false);
                float fTotalPayment = 0;
                
                fTotalPayment = CRVMMenu.collectPayment();
                CRVMCollectPaymentView.setPrompt(fTotalPayment);

                CRVMCollectPaymentView.setDoneButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        CRVMCollectPaymentView.setVisible(false);
                        CRVMMaintenanceMenuView.setVisible(true);
                    }
                });
            }
        });

        /**
         * ActionListener for the "Replenish Denomination" button in the maintenance menu view.
         */
        CRVMMaintenanceMenuView.setReplenishButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMReplenishDenomView.setVisible(true);
                CRVMMaintenanceMenuView.setVisible(false);             
                
                int n1Peso = (CRVMReplenishDenomView.get1PesoSpinnerValue());
                int n5Peso = (CRVMReplenishDenomView.get5PesoSpinnerValue());
                int n10Peso = (CRVMReplenishDenomView.get10PesoSpinnerValue());
                        
                CRVMMenu.addCoins(CRegularVM, n1Peso, n5Peso, n10Peso);

                int n20Peso = (CRVMReplenishDenomView.get20PesoSpinnerValue());
                int n50Peso = (CRVMReplenishDenomView.get50PesoSpinnerValue());
                int n100Peso = (CRVMReplenishDenomView.get100PesoSpinnerValue());
                int n200Peso = (CRVMReplenishDenomView.get200PesoSpinnerValue());
                int n500Peso = (CRVMReplenishDenomView.get500PesoSpinnerValue());
                int n1000Peso = (CRVMReplenishDenomView.get1000PesoSpinnerValue());

                CRVMMenu.addBills(CRegularVM, n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);

                Denominations CRVMDenom = CRegularVM.getDenominations();
                CRVMReplenishDenomView.set1PesoField(String.valueOf(CRVMDenom.get1Coins()));
                CRVMReplenishDenomView.set5PesoField(String.valueOf(CRVMDenom.get5Coins()));
                CRVMReplenishDenomView.set10PesoField(String.valueOf(CRVMDenom.get10Coins()));
                CRVMReplenishDenomView.set20PesoField(String.valueOf(CRVMDenom.get20Bills()));
                CRVMReplenishDenomView.set50PesoField(String.valueOf(CRVMDenom.get50Bills()));
                CRVMReplenishDenomView.set100PesoField(String.valueOf(CRVMDenom.get100Bills()));
                CRVMReplenishDenomView.set200PesoField(String.valueOf(CRVMDenom.get200Bills()));
                CRVMReplenishDenomView.set500PesoField(String.valueOf(CRVMDenom.get500Bills()));
                CRVMReplenishDenomView.set1000PesoField(String.valueOf(CRVMDenom.get1000Bills()));

                // save 
                CRVMReplenishDenomView.setSaveButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                        int n1Peso = (CRVMReplenishDenomView.get1PesoSpinnerValue());
                        int n5Peso = (CRVMReplenishDenomView.get5PesoSpinnerValue());
                        int n10Peso = (CRVMReplenishDenomView.get10PesoSpinnerValue());
                                
                        CRVMMenu.addCoins(CRegularVM, n1Peso, n5Peso, n10Peso);

                        int n20Peso = (CRVMReplenishDenomView.get20PesoSpinnerValue());
                        int n50Peso = (CRVMReplenishDenomView.get50PesoSpinnerValue());
                        int n100Peso = (CRVMReplenishDenomView.get100PesoSpinnerValue());
                        int n200Peso = (CRVMReplenishDenomView.get200PesoSpinnerValue());
                        int n500Peso = (CRVMReplenishDenomView.get500PesoSpinnerValue());
                        int n1000Peso = (CRVMReplenishDenomView.get1000PesoSpinnerValue());

                        CRVMMenu.addBills(CRegularVM, n20Peso, n50Peso, n100Peso, n200Peso, n500Peso, n1000Peso);
                        

                        CRVMMenu.replenishDenom(CRegularVM);
                        Denominations CTest = CRegularVM.getDenominations();

                        CRVMReplenishDenomView.clearTextFields();
                        CRVMMaintenanceMenuView.setVisible(true);
                        CRVMReplenishDenomView.setVisible(false);
                    }
                });
            }
        });

        /**
         * ActionListener for the "Transaction Summary" button in the maintenance menu view.
         */
        CRVMMaintenanceMenuView.setTransacButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RVMTransacSummaryController CRVMTransacSummaryController = new RVMTransacSummaryController(CRegularVM, CRVMMenu, CRVMMaintenanceMenuView, CRVMTransacSummaryView);
                CRVMTransacSummaryView.setVisible(true);
                CRVMMaintenanceMenuView.setVisible(false); 
            }
        });
        
        /**
         * ActionListener for the "Exit" button in the maintenance menu view.
         */
        CRVMMaintenanceMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		        CRVMMaintenanceMenuView.setVisible(false);
                CRVMMenuView.setVisible(true);
            }
        });
    }
}
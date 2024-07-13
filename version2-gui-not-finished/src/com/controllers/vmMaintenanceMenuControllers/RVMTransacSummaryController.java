package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.models.vmMenu.RVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RVMTransacSummaryController {
    private RVendingMachine CRegularVM;
    private RVMMenu CRVMMenu;
    private RVMMaintenanceMenuView CRVMMaintenanceMenuView;
    private TransacSummaryView CRVMTransacSummaryView;

    public RVMTransacSummaryController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, RVMMaintenanceMenuView CRVMMaintenanceMenuView, TransacSummaryView CRVMTransacSummaryView) {
        this.CRegularVM = CRegularVM;
        this.CRVMMenu = CRVMMenu;
        this.CRVMMaintenanceMenuView = CRVMMaintenanceMenuView;
        this.CRVMTransacSummaryView = CRVMTransacSummaryView;
        initializeListeners();
    }

    public void initializeListeners() {
        CRVMTransacSummaryView.setLoadStartButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMTransacSummaryView.setPromptField(CRVMMenu.displayStartTransacSummary(CRegularVM));
            }
        });

        CRVMTransacSummaryView. setLoadEndButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMTransacSummaryView.setPromptField(CRVMMenu.displayEndTransacSummary(CRegularVM));
            }
        });

        CRVMTransacSummaryView.setLoadItemSoldButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMTransacSummaryView.setPromptField(CRVMMenu.displayItemsSold(CRegularVM));
            }
        });

        CRVMTransacSummaryView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CRVMMaintenanceMenuView.setVisible(true); 
                CRVMTransacSummaryView.setVisible(false);
            }
        });

    }
}

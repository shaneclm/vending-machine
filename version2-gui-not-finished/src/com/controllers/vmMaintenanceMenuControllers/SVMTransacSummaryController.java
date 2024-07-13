package com.controllers.vmMaintenanceMenuControllers;

import com.models.vendingMachine.SVendingMachine;
import com.models.vmMenu.SVMMenu;
import com.views.vmMaintenanceMenuViews.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SVMTransacSummaryController {
    private SVendingMachine CSpecialVM;
    private SVMMenu CSVMMenu;
    private SVMMaintenanceMenuView CSVMMaintenanceMenuView;
    private TransacSummaryView CSVMTransacSummaryView;

    public SVMTransacSummaryController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, SVMMaintenanceMenuView CSVMMaintenanceMenuView, TransacSummaryView CSVMTransacSummaryView) {
        this.CSpecialVM = CSpecialVM;
        this.CSVMMenu = CSVMMenu;
        this.CSVMMaintenanceMenuView = CSVMMaintenanceMenuView;
        this.CSVMTransacSummaryView = CSVMTransacSummaryView;
        initializeListeners();
    }

    public void initializeListeners() {
        CSVMTransacSummaryView.setLoadStartButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMTransacSummaryView.setPromptField(CSVMMenu.displayStartTransacSummary(CSpecialVM));
            }
        });

        CSVMTransacSummaryView. setLoadEndButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMTransacSummaryView.setPromptField(CSVMMenu.displayEndTransacSummary(CSpecialVM));
            }
        });

        CSVMTransacSummaryView.setLoadItemSoldButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMTransacSummaryView.setPromptField(CSVMMenu.displayItemsSold(CSpecialVM));
            }
        });

        CSVMTransacSummaryView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CSVMMaintenanceMenuView.setVisible(true); 
                CSVMTransacSummaryView.setVisible(false);
            }
        });

    }
}

package com.controllers.vmMenuControllers;

import com.models.vendingMachine.RVendingMachine;
import com.views.MainMenuView;
import com.views.VMMenuView;
import com.models.vmMenu.RVMMenu;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;
import com.views.vmMaintenanceMenuViews.RVMMaintenanceMenuView;
import com.controllers.vmTestFeaturesMenuControllers.RVMTestFeaturesMenuController;
import com.controllers.vmMaintenanceMenuControllers.RVMMaintenanceMenuController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the menu of the vending machine simulator.
 * It controls actions such as starting test features, accessing maintenance menu,
 * and exiting the main menu.
 */
public class RVMMenuController {
    private RVendingMachine CRegularVM;
    private MainMenuView CVMMainMenuView;
    private VMMenuView CRVMMenuView;
    private RVMMenu CRVMMenu;
    private VMTestFeaturesMenuView CVMTestFeaturesView;
    private RVMMaintenanceMenuView CVMMaintenanceMenuView;
    
    /**
     * Constructor for the RVMMenuController class.
     *
     * @param CRegularVM            the regular vending machine model
     * @param CRVMMenu              the RVMMenu object associated with the regular vending machine
     * @param CVMMainMenuView       the view for the main menu of the vending machine simulator
     * @param CRVMMenuView          the view for the menu of the regular vending machine
     */
    public RVMMenuController(RVendingMachine CRegularVM, RVMMenu CRVMMenu, MainMenuView CVMMainMenuView, VMMenuView CRVMMenuView) {
        this.CRegularVM = CRegularVM;           
        this.CRVMMenu = CRVMMenu;               // Menu model
        this.CVMMainMenuView = CVMMainMenuView; // Main menu 
        this.CRVMMenuView = CRVMMenuView;       // Menu view
        this.CVMTestFeaturesView = new VMTestFeaturesMenuView();
        this.CVMMaintenanceMenuView = new RVMMaintenanceMenuView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the main menu view.
     * Listens for events such as clicking the "Test VM" button to start test features,
     * accessing the maintenance menu, and exiting the main menu.
     */
    public void initializeListeners() {
        CRVMMenuView.setTestVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {  
                if (CRegularVM.getItems().size() < 1) {
                    CRVMMenuView.setPrompt("Vending machine untestable: Minimum 8 items");
                } else if (CRegularVM.getDenominations().calculateTotalAmount() == 0) {
                    CRVMMenuView.setPrompt("Vending machine untestable: Empty change slot");
                } else {
                    RVMTestFeaturesMenuController CRVMTestFeaturesController = new RVMTestFeaturesMenuController(CRegularVM, CRVMMenu, CVMTestFeaturesView, CRVMMenuView);
                    CVMTestFeaturesView.setVisible(true);
                    CRVMMenuView.setVisible(false);
                }
            } 
        });
        
        CRVMMenuView.setMaintenanceButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                RVMMaintenanceMenuController CRVMMaintenanceMenuController = new RVMMaintenanceMenuController(CRegularVM, CRVMMenu, CVMMaintenanceMenuView, CRVMMenuView);
                CVMMaintenanceMenuView.setVisible(true);
                CRVMMenuView.setVisible(false);
            } 
        });

        CRVMMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		        CRVMMenuView.setVisible(false);
                CVMMainMenuView.setVisible(true);
            }
        });
    }
}

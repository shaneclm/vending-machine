package com.controllers.vmMenuControllers;

import com.models.vendingMachine.SVendingMachine;
import com.views.MainMenuView;
import com.views.VMMenuView;
import com.models.vmMenu.SVMMenu;
import com.views.vmFeaturesViews.VMTestFeaturesMenuView;
import com.views.vmMaintenanceMenuViews.SVMMaintenanceMenuView;
import com.controllers.vmMaintenanceMenuControllers.SVMMaintenanceMenuController;
import com.controllers.vmTestFeaturesMenuControllers.SVMTestFeaturesMenuController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for managing the menu of the special vending machine simulator.
 * It controls actions such as starting test features, accessing maintenance menu,
 * and exiting the main menu.
 */
public class SVMMenuController {
    private SVendingMachine CSpecialVM;
    private MainMenuView CVMMainMenuView;
    private VMMenuView CSVMMenuView;
    private SVMMenu CSVMMenu;
    private VMTestFeaturesMenuView CVMTestFeaturesView;
    private SVMMaintenanceMenuView CVMMaintenanceMenuView;
    
    /**
     * Constructor for the SVMMenuController class.
     *
     * @param CSpecialVM            the special vending machine model
     * @param CSVMMenu              the SVMMenu object associated with the special vending machine
     * @param CVMMainMenuView       the view for the main menu of the vending machine simulator
     * @param CSVMMenuView          the view for the menu of the special vending machine
     */
    public SVMMenuController(SVendingMachine CSpecialVM, SVMMenu CSVMMenu, MainMenuView CVMMainMenuView, VMMenuView CSVMMenuView) {
        this.CSpecialVM = CSpecialVM;           
        this.CSVMMenu = CSVMMenu;               // Menu model
        this.CVMMainMenuView = CVMMainMenuView; // Main menu 
        this.CSVMMenuView = CSVMMenuView;       // Menu view
        this.CVMTestFeaturesView = new VMTestFeaturesMenuView();
        this.CVMMaintenanceMenuView = new SVMMaintenanceMenuView();
        initializeListeners();
    }

    /**
     * Initializes action listeners for buttons in the main menu view.
     * Listens for events such as clicking the "Test VM" button to start test features,
     * accessing the maintenance menu, and exiting the main menu.
     */
    public void initializeListeners() {
        CSVMMenuView.setTestVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {  
                if (CSpecialVM.getItems().size() < 1) {
                    CSVMMenuView.setPrompt("Vending machine untestable: Minimum 8 items");
                } else if (CSpecialVM.getDenominations().calculateTotalAmount() == 0) {
                    CSVMMenuView.setPrompt("Vending machine untestable: Empty change slot");
                } else {
                    SVMTestFeaturesMenuController CSVMTestFeaturesController = new SVMTestFeaturesMenuController(CSpecialVM, CSVMMenu, CVMTestFeaturesView, CSVMMenuView);
                    CVMTestFeaturesView.setVisible(true);
                    CSVMMenuView.setVisible(false);
                }
            } 
        });
        
        CSVMMenuView.setMaintenanceButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                SVMMaintenanceMenuController CSVMMaintenanceMenuController = new SVMMaintenanceMenuController(CSpecialVM, CSVMMenu, CVMMaintenanceMenuView, CSVMMenuView);
                CVMMaintenanceMenuView.setVisible(true);
                CSVMMenuView.setVisible(false);
            } 
        });

        CSVMMenuView.setExitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		        CSVMMenuView.setVisible(false);
                CVMMainMenuView.setVisible(true);
            }
        });
    }
}

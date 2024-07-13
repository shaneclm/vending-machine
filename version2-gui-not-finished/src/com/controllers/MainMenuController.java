package com.controllers;

import com.controllers.vmMenuControllers.*;
import com.views.MainMenuView;
import com.views.VMMenuView;
import com.models.vendingMachine.*;
import com.models.items.Item;
import com.models.mainMenu.MainMenuModel;
import com.models.vmMenu.*;
import com.views.CreateVMView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Controller class for the main menu of the vending machine application.
 * This class handles user interactions with the main menu view and manages the
 * creation of regular and special vending machines.
 */
public class MainMenuController {
    private MainMenuView CVMMainMenuView;
    private MainMenuModel CVMMainMenuModel;
    private CreateVMView CCreateVMView;
    private VMMenuView CVMMenuView;
    
    private VendingMachine CVendingMachine;

    public MainMenuController(MainMenuView CVMView, MainMenuModel CVMModel) {
        this.CVMMainMenuView = CVMView;
        this.CVMMainMenuModel = CVMModel;
        this.CCreateVMView = new CreateVMView();
        this.CVMMenuView = new VMMenuView();
        initializeListeners();
    }
    
    /**
     * Initializes the action listeners for buttons on the main menu view.
     */
    public void initializeListeners() {
        /**
         * Handles the "Create VM" button click event.
         * Shows the "Create VM" view and hides the main menu view.
         * Creates a regular vending machine when the "Regular VM" button is clicked.
         * Creates a special vending machine when the "Special VM" button is clicked.
         */
        CVMMainMenuView.setCreateVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                CCreateVMView.setVisible(true);
                CVMMainMenuView.setVisible(false);
            }
        });
        
        /**
         * Handles the "Test VM" button click event.
         * Switches to the vending machine menu view if a vending machine has been created.
         * Prints the type of vending machine (Regular or Special) for verification.
         */
        CVMMainMenuView.setTestVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CVendingMachine != null) {

                    CVMMenuView.setVisible(true);
                    CVMMainMenuView.setVisible(false);

                    if (CVendingMachine instanceof RVendingMachine) {
                        RVendingMachine CRegularVM = (RVendingMachine) CVendingMachine;
                        RVMMenu CRVMMenu = new RVMMenu();
                        RVMMenuController CRVMMenuController = new RVMMenuController(CRegularVM, CRVMMenu, CVMMainMenuView, CVMMenuView);
                    }

                    else if (CVendingMachine instanceof SVendingMachine) {
                        SVendingMachine CSpecialVM = (SVendingMachine) CVendingMachine;
                        SVMMenu CSVMMenu = new SVMMenu();
                        CSVMMenu.initializeItems(CSpecialVM);
                        CSVMMenu.addItemsinTracker(CSpecialVM);
                        SVMMenuController CSVMMenuController = new SVMMenuController(CSpecialVM, CSVMMenu, CVMMainMenuView, CVMMenuView);
                    }
                }
            } 
        });
        
        /**
         * Handles the "Exit VM" button click event.
         * Exits the vending machine application when the button is clicked.
         */
        CVMMainMenuView.setExitVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
		        CVMMainMenuModel.exitVM();
            } 
        });

        /**
         * Handles the "Regular VM" button click event in the "Create VM" view.
         * Creates a regular vending machine when the button is clicked.
         * Switches back to the main menu view after creating the vending machine.
         */
        CCreateVMView.setRegularVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CVendingMachine = CVMMainMenuModel.createRegularVM();
                CCreateVMView.setVisible(false);
                CVMMainMenuView.setVisible(true); 
            }
        });

        /**
         * Handles the "Special VM" button click event in the "Create VM" view.
         * Creates a special vending machine when the button is clicked.
         * Switches back to the main menu view after creating the vending machine.
         *
         * @param evt The action event representing the button click.
         */
        CCreateVMView.setSpecialVMButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close VMCreationView and make VMSimulatorView visible again
                CVendingMachine = CVMMainMenuModel.createSpecialVM();
                CCreateVMView.setVisible(false);
                CVMMainMenuView.setVisible(true);
            }
        });
    }
    
}

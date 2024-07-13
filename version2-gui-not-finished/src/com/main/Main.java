package com.main;

import com.controllers.MainMenuController;
import com.views.MainMenuView;
import com.models.mainMenu.MainMenuModel;

public class Main {

    public static void main(String[] args) {
        MainMenuView CVMMainMenuView = new MainMenuView();
        MainMenuModel CVMMainMenuModel = new MainMenuModel();
        
        MainMenuController CVMMainMenuController = new MainMenuController(CVMMainMenuView, CVMMainMenuModel);
        CVMMainMenuView.setVisible(true);
    }
    
}

package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The RVMItemCategoryView class represents the graphical user interface for selecting the category of a new item
 * in the vending machine for the Remote Vending Machine system.
 * It allows the user to choose between different item categories such as Viand, Rice, and Beverage.
 */
public class RVMItemCategoryView extends JFrame {
    private JLabel jAuthorLabel;
    private JPanel jBGPanel;
    private JButton jBeverageButton;
    private JLabel jBottomLabel;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton jRiceButton;
    private JButton jViandButton;

    /**
     * Creates a new instance of the RVMItemCategoryView class.
     * This method initializes the GUI components.
     */
    public RVMItemCategoryView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jPanel2 = new JPanel();
        jMainLabel = new JLabel();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jRiceButton = new JButton();
        jAuthorLabel = new JLabel();
        jViandButton = new JButton();
        jBeverageButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel.setText("Add New Item");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jRiceButton.setBackground(new java.awt.Color(255, 135, 49));
        jRiceButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jRiceButton.setForeground(new java.awt.Color(81, 35, 20));
        jRiceButton.setText("Rice");
        jRiceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(81, 35, 20));
        jAuthorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel.setText("Select category of the item to add:");

        jViandButton.setBackground(new java.awt.Color(255, 135, 49));
        jViandButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jViandButton.setForeground(new java.awt.Color(81, 35, 20));
        jViandButton.setText("Viand");
        jViandButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jBeverageButton.setBackground(new java.awt.Color(255, 135, 49));
        jBeverageButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jBeverageButton.setForeground(new java.awt.Color(81, 35, 20));
        jBeverageButton.setText("Beverage");
        jBeverageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jAuthorLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jBeverageButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRiceButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViandButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuthorLabel)
                .addGap(18, 18, 18)
                .addComponent(jViandButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRiceButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBeverageButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    
    /**
     * Sets an ActionListener for the Rice button.
     *
     * @param jActionListener The ActionListener to be set for the Rice button.
     */
    public void setRiceButtonListener(ActionListener jActionListener) {
        this.jRiceButton.addActionListener(jActionListener);
    }

    /**
     * Sets an ActionListener for the Viand button.
     *
     * @param jActionListener The ActionListener to be set for the Viand button.
     */
    public void setViandButtonListener(ActionListener jActionListener) {
        this.jViandButton.addActionListener(jActionListener);
    }

    /**
     * Sets an ActionListener for the Beverage button.
     *
     * @param jActionListener The ActionListener to be set for the Beverage button.
     */
    public void setBeverageButtonListener(ActionListener jActionListener) {
        this.jBeverageButton.addActionListener(jActionListener);
    }

}

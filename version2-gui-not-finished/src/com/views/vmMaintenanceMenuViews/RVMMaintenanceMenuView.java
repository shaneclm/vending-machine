package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The VMMaintenanceMenuView class represents the graphical user interface for the Vending Machine Maintenance Menu.
 * It allows the user to perform maintenance actions on the vending machine, such as restocking, collecting payments, etc.
 */
public class RVMMaintenanceMenuView extends JFrame {
    private JLabel jAuthorLabel;
    private JLabel jAuthorLabel1;
    private JLabel jAuthorLabel2;
    private JLabel jAuthorLabel3;
    private JLabel jAuthorLabel4;
    private JLabel jAuthorLabel5;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jCollectButton;
    private JButton jExitButton;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton jReplenishButton;
    private JButton jRestockButton;
    private JSeparator jSeparator1;
    private JButton jStockButton;
    private JButton jTransacButton;


     /**
     * Creates a new instance of the VMMaintenanceMenuView class.
     * This method initializes the GUI components.
     */
    public RVMMaintenanceMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jPanel2 = new JPanel();
        jMainLabel = new JLabel();
        jAuthorLabel = new JLabel();
        jRestockButton = new JButton();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jStockButton = new JButton();
        jAuthorLabel1 = new JLabel();
        jCollectButton = new JButton();
        jAuthorLabel2 = new JLabel();
        jReplenishButton = new JButton();
        jAuthorLabel3 = new JLabel();
        jAuthorLabel4 = new JLabel();
        jTransacButton = new JButton();
        jSeparator1 = new JSeparator();
        jAuthorLabel5 = new JLabel();
        jExitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Maintenance");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel.setText("Maintenance Menu");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel.setText("Add or remove items");

        jRestockButton.setBackground(new java.awt.Color(255, 255, 247));
        jRestockButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jRestockButton.setForeground(new java.awt.Color(81, 35, 20));
        jRestockButton.setText("Restock Items");
        jRestockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jStockButton.setBackground(new java.awt.Color(255, 255, 247));
        jStockButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jStockButton.setForeground(new java.awt.Color(81, 35, 20));
        jStockButton.setText("Stock Items");
        jStockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jAuthorLabel1.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel1.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel1.setText("Restock item quantity");

        jCollectButton.setBackground(new java.awt.Color(255, 255, 247));
        jCollectButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jCollectButton.setForeground(new java.awt.Color(81, 35, 20));
        jCollectButton.setText("Collect Payment");
        jCollectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel2.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel2.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel2.setText("Collect vending machine's revenue");

        jReplenishButton.setBackground(new java.awt.Color(255, 255, 247));
        jReplenishButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jReplenishButton.setForeground(new java.awt.Color(81, 35, 20));
        jReplenishButton.setText("Replenish Denominations");
        jReplenishButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel3.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel3.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel3.setText("Add bills or coins into the machine");

        jAuthorLabel4.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel4.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel4.setText("Displays inventory status and transaction history");

        jTransacButton.setBackground(new java.awt.Color(255, 255, 247));
        jTransacButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jTransacButton.setForeground(new java.awt.Color(81, 35, 20));
        jTransacButton.setText("Transaction Summary");
        jTransacButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jSeparator1.setOrientation(SwingConstants.VERTICAL);

        jAuthorLabel5.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel5.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel5.setText("Return to vending machine menu");

        jExitButton.setBackground(new java.awt.Color(255, 255, 247));
        jExitButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jExitButton.setForeground(new java.awt.Color(81, 35, 20));
        jExitButton.setText("Exit");
        jExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jCollectButton, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jAuthorLabel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAuthorLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAuthorLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jRestockButton, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jStockButton, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)))
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jAuthorLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAuthorLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAuthorLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jReplenishButton, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jExitButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))))
                    .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTransacButton, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jAuthorLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jStockButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jAuthorLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jReplenishButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jAuthorLabel1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRestockButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jAuthorLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCollectButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jAuthorLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTransacButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jAuthorLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jExitButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }
    
    /**
     * Sets a listener for the Stock Items button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setStockButtonListener(ActionListener jActionListener) {
        this.jStockButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Restock Items button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setRestockButtonListener(ActionListener jActionListener) {
        this.jRestockButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Collect Payment button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setCollectButtonListener(ActionListener jActionListener) {
        this.jCollectButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Replenish Denominations button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setReplenishButtonListener(ActionListener jActionListener) {
        this.jReplenishButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Transaction Summary button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setTransacButtonListener(ActionListener jActionListener) {
        this.jTransacButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Exit button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setExitButtonListener(ActionListener jActionListener) {
        this.jExitButton.addActionListener(jActionListener);
    }

}

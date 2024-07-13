package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SVMMaintenanceMenuView extends javax.swing.JFrame {

    /**
     * Creates new form VMMaintenanceMenu
     */
    public SVMMaintenanceMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMainLabel = new javax.swing.JLabel();
        jAuthorLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBottomLabel = new javax.swing.JLabel();
        jRestockButton = new javax.swing.JButton();
        jCollectButton = new javax.swing.JButton();
        jAuthorLabel2 = new javax.swing.JLabel();
        jReplenishButton = new javax.swing.JButton();
        jAuthorLabel3 = new javax.swing.JLabel();
        jAuthorLabel4 = new javax.swing.JLabel();
        jTransacButton = new javax.swing.JButton();
        jAuthorLabel5 = new javax.swing.JLabel();
        jExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Maintenance");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel.setText("Maintenance Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel.setText("Restock or remove items");

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jRestockButton.setBackground(new java.awt.Color(255, 255, 247));
        jRestockButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jRestockButton.setForeground(new java.awt.Color(81, 35, 20));
        jRestockButton.setText("Restock Items");
        jRestockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    
        jCollectButton.setBackground(new java.awt.Color(255, 255, 247));
        jCollectButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jCollectButton.setForeground(new java.awt.Color(81, 35, 20));
        jCollectButton.setText("Collect Payment");
        jCollectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel2.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel2.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel2.setText("Collect vending machine's revenue");

        jReplenishButton.setBackground(new java.awt.Color(255, 255, 247));
        jReplenishButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        jReplenishButton.setForeground(new java.awt.Color(81, 35, 20));
        jReplenishButton.setText("Replenish Denominations");
        jReplenishButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel3.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel3.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel3.setText("Add bills or coins into the machine");

        jAuthorLabel4.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel4.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel4.setText("Displays inventory status and transaction history");

        jTransacButton.setBackground(new java.awt.Color(255, 255, 247));
        jTransacButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jTransacButton.setForeground(new java.awt.Color(81, 35, 20));
        jTransacButton.setText("Transaction Summary");
        jTransacButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jAuthorLabel5.setFont(new java.awt.Font("Montserrat Medium", 2, 10)); // NOI18N
        jAuthorLabel5.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel5.setText("Return to vending machine menu");

        jExitButton.setBackground(new java.awt.Color(255, 255, 247));
        jExitButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jExitButton.setForeground(new java.awt.Color(81, 35, 20));
        jExitButton.setText("Exit");
        jExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        javax.swing.GroupLayout jBGPanelLayout = new javax.swing.GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAuthorLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jCollectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jAuthorLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jBGPanelLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jRestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jBGPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTransacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jBGPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jAuthorLabel4))
                                    .addGroup(jBGPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jReplenishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jBGPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAuthorLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addComponent(jAuthorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addComponent(jAuthorLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jReplenishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAuthorLabel2)
                    .addComponent(jAuthorLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCollectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTransacButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jAuthorLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setRestockButtonListener(ActionListener jActionListener) {
        this.jRestockButton.addActionListener(jActionListener);
    }
    
    public void setCollectButtonListener(ActionListener jActionListener) {
        this.jCollectButton.addActionListener(jActionListener);
    }

    public void setReplenishButtonListener(ActionListener jActionListener) {
        this.jReplenishButton.addActionListener(jActionListener);
    }

    public void setTransacButtonListener(ActionListener jActionListener) {
        this.jTransacButton.addActionListener(jActionListener);
    }

    public void setExitButtonListener(ActionListener jActionListener) {
        this.jExitButton.addActionListener(jActionListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAuthorLabel;
    private javax.swing.JLabel jAuthorLabel2;
    private javax.swing.JLabel jAuthorLabel3;
    private javax.swing.JLabel jAuthorLabel4;
    private javax.swing.JLabel jAuthorLabel5;
    private javax.swing.JPanel jBGPanel;
    private javax.swing.JLabel jBottomLabel;
    private javax.swing.JButton jCollectButton;
    private javax.swing.JButton jExitButton;
    private javax.swing.JLabel jMainLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jReplenishButton;
    private javax.swing.JButton jRestockButton;
    private javax.swing.JButton jTransacButton;
    // End of variables declaration//GEN-END:variables
}

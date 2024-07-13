package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

public class SVMRestockMenuView extends JFrame {

    /**
     * Creates new form StockMenu
     */
    public SVMRestockMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBottomLabel1 = new javax.swing.JLabel();
        jBGPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMainLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBottomLabel = new javax.swing.JLabel();
        jRestockButton = new javax.swing.JButton();
        jRemoveButton = new javax.swing.JButton();
        jFinishButton = new javax.swing.JButton();
        jPromptField = new javax.swing.JTextField();

        jBottomLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel1.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Stock Menu");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel.setText("Restock Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
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
        jRestockButton.setText("Restock Item");
        jRestockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jRemoveButton.setBackground(new java.awt.Color(255, 255, 247));
        jRemoveButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jRemoveButton.setForeground(new java.awt.Color(81, 35, 20));
        jRemoveButton.setText("Remove Item");
        jRemoveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jFinishButton.setBackground(new java.awt.Color(255, 255, 247));
        jFinishButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jFinishButton.setForeground(new java.awt.Color(81, 35, 20));
        jFinishButton.setText("Finish");
        jFinishButton.setToolTipText("");
        jFinishButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        javax.swing.GroupLayout jBGPanelLayout = new javax.swing.GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    
    public void setRestockButtonListener(ActionListener jActionListener) {
        this.jRestockButton.addActionListener(jActionListener);
    }

    public void setRemoveButtonListener(ActionListener jActionListener) {
        this.jRemoveButton.addActionListener(jActionListener);
    }

    public void setFinishButtonListener(ActionListener jActionListener) {
        this.jFinishButton.addActionListener(jActionListener);
    }

    /**
     * Sets the prompt message in the Prompt field.
     *
     * @param strMessage The message to be displayed in the Prompt field.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBGPanel;
    private javax.swing.JLabel jBottomLabel;
    private javax.swing.JLabel jBottomLabel1;
    private javax.swing.JButton jFinishButton;
    private javax.swing.JLabel jMainLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPromptField;
    private javax.swing.JButton jRemoveButton;
    private javax.swing.JButton jRestockButton;
    // End of variables declaration//GEN-END:variables
}

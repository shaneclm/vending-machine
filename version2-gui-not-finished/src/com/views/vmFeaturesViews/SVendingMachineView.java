package com.views.vmFeaturesViews;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SVendingMachineView extends JFrame {
    private javax.swing.JTextField j1000PesoField;
    private javax.swing.JLabel j1000PesoLabel;
    private javax.swing.JSpinner j1000PesoSpinner;
    private javax.swing.JTextField j100PesoField;
    private javax.swing.JLabel j100PesoLabel;
    private javax.swing.JSpinner j100PesoSpinner;
    private javax.swing.JTextField j10PesoField;
    private javax.swing.JLabel j10PesoLabel;
    private javax.swing.JSpinner j10PesoSpinner;
    private javax.swing.JTextField j1PesoField;
    private javax.swing.JLabel j1PesoLabel;
    private javax.swing.JSpinner j1PesoSpinner;
    private javax.swing.JTextField j200PesoField;
    private javax.swing.JLabel j200PesoLabel;
    private javax.swing.JSpinner j200PesoSpinner;
    private javax.swing.JTextField j20PesoField;
    private javax.swing.JLabel j20PesoLabel;
    private javax.swing.JSpinner j20PesoSpinner;
    private javax.swing.JTextField j500PesoField;
    private javax.swing.JLabel j500PesoLabel;
    private javax.swing.JSpinner j500PesoSpinner;
    private javax.swing.JTextField j50PesoField;
    private javax.swing.JLabel j50PesoLabel;
    private javax.swing.JSpinner j50PesoSpinner;
    private javax.swing.JTextField j5PesoField;
    private javax.swing.JLabel j5PesoLabel;
    private javax.swing.JSpinner j5PesoSpinner;
    private javax.swing.JPanel jA1Panel;
    private javax.swing.JTextField jA1QTYTextField;
    private javax.swing.JPanel jA2Panel;
    private javax.swing.JTextField jA2QTYTextField;
    private javax.swing.JPanel jA3Panel;
    private javax.swing.JTextField jA3QTYTextField;
    private javax.swing.JPanel jA4Panel;
    private javax.swing.JTextField jA4QTYTextField;
    private javax.swing.JPanel jA5Panel;
    private javax.swing.JTextField jA5QTYTextField;
    private javax.swing.JLabel jAuthorLabel;
    private javax.swing.JPanel jB1Panel;
    private javax.swing.JTextField jB1QTYTextField;
    private javax.swing.JPanel jB2Panel;
    private javax.swing.JTextField jB2QTYTextField;
    private javax.swing.JTextField jBillsAvailField;
    private javax.swing.JPanel jC1Panel;
    private javax.swing.JTextField jC1QTYTextField;
    private javax.swing.JTextField jC2QTYTextField;
    private javax.swing.JTextField jC3QTYTextField;
    private javax.swing.JPanel jC2Panel;
    private javax.swing.JPanel jC3Panel;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JTextField jCoinsAvailField;
    private javax.swing.JButton jCustomizeButton;
    private javax.swing.JTextField jDenominationsInputTextField;
    private javax.swing.JButton jEndVMTestButton;
    private javax.swing.JPanel jFirstRowPanel;
    private javax.swing.JPanel jIEnterSlotPanel;
    private javax.swing.JPanel jInsertPaymentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLoadButton;
    private javax.swing.JLabel jMainLabel1;
    private javax.swing.JLabel jMainLabel2;
    private javax.swing.JLabel jMainLabel3;
    private javax.swing.JLabel jMainLabel4;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jPromptField;
    private javax.swing.JPanel jReceiptPanel;
    private javax.swing.JButton jProceedButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jSecondRowPanel;
    private javax.swing.JPanel jSecondRowPanel1;
    private javax.swing.JTextArea jReceiptTextArea;
    private javax.swing.JTextField jEnterSlotField;
    private javax.swing.JPanel jThirdRowPanel;
    /**
     * Creates new form SVMAdjustedMain
     */
    public SVendingMachineView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jMainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFirstRowPanel = new javax.swing.JPanel();
        jA1Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jA1QTYTextField = new javax.swing.JTextField();
        jA2Panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jA2QTYTextField = new javax.swing.JTextField();
        jA3Panel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jA3QTYTextField = new javax.swing.JTextField();
        jSecondRowPanel = new javax.swing.JPanel();
        jA4Panel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jA4QTYTextField = new javax.swing.JTextField();
        jA5Panel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jA5QTYTextField = new javax.swing.JTextField();
        jB1Panel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jB1QTYTextField = new javax.swing.JTextField();
        jThirdRowPanel = new javax.swing.JPanel();
        jB2Panel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jB2QTYTextField = new javax.swing.JTextField();
        jC1Panel = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jC1QTYTextField = new javax.swing.JTextField();
        jC2Panel = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jC2QTYTextField = new javax.swing.JTextField();
        jInsertPaymentPanel = new javax.swing.JPanel();
        jCancelButton = new javax.swing.JButton();
        jLoadButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        j1PesoSpinner = new javax.swing.JSpinner();
        j1PesoLabel = new javax.swing.JLabel();
        j1PesoField = new javax.swing.JTextField();
        j5PesoLabel = new javax.swing.JLabel();
        j5PesoField = new javax.swing.JTextField();
        j5PesoSpinner = new javax.swing.JSpinner();
        j10PesoLabel = new javax.swing.JLabel();
        j10PesoField = new javax.swing.JTextField();
        j10PesoSpinner = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        j20PesoLabel = new javax.swing.JLabel();
        j20PesoField = new javax.swing.JTextField();
        j20PesoSpinner = new javax.swing.JSpinner();
        j50PesoField = new javax.swing.JTextField();
        j50PesoSpinner = new javax.swing.JSpinner();
        j50PesoLabel = new javax.swing.JLabel();
        j100PesoLabel = new javax.swing.JLabel();
        j100PesoField = new javax.swing.JTextField();
        j100PesoSpinner = new javax.swing.JSpinner();
        j200PesoSpinner = new javax.swing.JSpinner();
        j200PesoLabel = new javax.swing.JLabel();
        j200PesoField = new javax.swing.JTextField();
        j500PesoSpinner = new javax.swing.JSpinner();
        j500PesoLabel = new javax.swing.JLabel();
        j500PesoField = new javax.swing.JTextField();
        j1000PesoLabel = new javax.swing.JLabel();
        j1000PesoField = new javax.swing.JTextField();
        j1000PesoSpinner = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jMainLabel1 = new javax.swing.JLabel();
        jBillsAvailField = new javax.swing.JTextField();
        jCoinsAvailField = new javax.swing.JTextField();
        jMainLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jDenominationsInputTextField = new javax.swing.JTextField();
        jIEnterSlotPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMainLabel2 = new javax.swing.JLabel();
        jEnterSlotField = new javax.swing.JTextField();
        jProceedButton = new javax.swing.JButton();
        jPromptField = new javax.swing.JTextField();
        jReceiptPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jReceiptTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jMainLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jEndVMTestButton = new javax.swing.JButton();
        jSecondRowPanel1 = new javax.swing.JPanel();
        jC3Panel = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jC3QTYTextField = new javax.swing.JTextField();
        jCustomizeButton = new javax.swing.JButton();
        jAuthorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 226, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 3));

        jMainPanel.setBackground(new java.awt.Color(3, 80, 149));
        jMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));

        jLabel1.setBackground(new java.awt.Color(217, 22, 4));
        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 235, 220));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Special Vending Machine");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jFirstRowPanel.setBackground(new java.awt.Color(255, 170, 1));
        jFirstRowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 35, 20));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Beef Tapa");

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\beef tapa - icon.png")); // NOI18N
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 135, 49));
        jLabel4.setText("A1");

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 35, 20));
        jLabel5.setText("₱ 82.00");

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 35, 20));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("180 kcal");

        jA1QTYTextField.setEditable(false);
        jA1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jA1PanelLayout = new javax.swing.GroupLayout(jA1Panel);
        jA1Panel.setLayout(jA1PanelLayout);
        jA1PanelLayout.setHorizontalGroup(
            jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1PanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1PanelLayout.createSequentialGroup()
                        .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1PanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1PanelLayout.createSequentialGroup()
                        .addComponent(jA1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1PanelLayout.setVerticalGroup(
            jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jA1QTYTextField))
                .addContainerGap())
        );

        jA2Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(81, 35, 20));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bacon");

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\bacon - icon.png")); // NOI18N
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 135, 49));
        jLabel14.setText("A2");

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(81, 35, 20));
        jLabel15.setText("₱ 65.00");

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(81, 35, 20));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("161 kcal");

        jA2QTYTextField.setEditable(false);
        jA2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jA2PanelLayout = new javax.swing.GroupLayout(jA2Panel);
        jA2Panel.setLayout(jA2PanelLayout);
        jA2PanelLayout.setHorizontalGroup(
            jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA2PanelLayout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jA2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA2PanelLayout.createSequentialGroup()
                        .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA2PanelLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jA2PanelLayout.createSequentialGroup()
                        .addComponent(jA2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA2PanelLayout.setVerticalGroup(
            jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA2PanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jA2QTYTextField))
                .addContainerGap())
        );

        jA3Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel17.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(81, 35, 20));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Hotdog");

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\hotdog - icon.png")); // NOI18N
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 135, 49));
        jLabel19.setText("A3");

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(81, 35, 20));
        jLabel20.setText("₱ 59.00");

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(81, 35, 20));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("160 kcal");

        jA3QTYTextField.setEditable(false);
        jA3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jA3PanelLayout = new javax.swing.GroupLayout(jA3Panel);
        jA3Panel.setLayout(jA3PanelLayout);
        jA3PanelLayout.setHorizontalGroup(
            jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA3PanelLayout.createSequentialGroup()
                        .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA3PanelLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jA3PanelLayout.createSequentialGroup()
                        .addComponent(jA3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA3PanelLayout.setVerticalGroup(
            jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jA3QTYTextField))
                .addContainerGap())
        );

        javax.swing.GroupLayout jFirstRowPanelLayout = new javax.swing.GroupLayout(jFirstRowPanel);
        jFirstRowPanel.setLayout(jFirstRowPanelLayout);
        jFirstRowPanelLayout.setHorizontalGroup(
            jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jA3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFirstRowPanelLayout.setVerticalGroup(
            jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                .addGroup(jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jA2Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jA3Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSecondRowPanel.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA4Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel23.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\longganisa - icon.png")); // NOI18N
        jLabel23.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 135, 49));
        jLabel24.setText("A4");

        jLabel25.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(81, 35, 20));
        jLabel25.setText("₱72.00");

        jLabel26.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(81, 35, 20));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("160 kcal");

        jLabel22.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(81, 35, 20));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Longganisa");

        jA4QTYTextField.setEditable(false);
        jA4QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA4QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA4QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA4QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jA4PanelLayout = new javax.swing.GroupLayout(jA4Panel);
        jA4Panel.setLayout(jA4PanelLayout);
        jA4PanelLayout.setHorizontalGroup(
            jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jA4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA4PanelLayout.createSequentialGroup()
                        .addGroup(jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA4PanelLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jA4PanelLayout.createSequentialGroup()
                        .addComponent(jA4QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA4PanelLayout.setVerticalGroup(
            jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA4PanelLayout.createSequentialGroup()
                .addGroup(jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA4PanelLayout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jA4PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jA4QTYTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        jA5Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel37.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(81, 35, 20));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Bangus");

        jLabel38.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\bangus - icon.png")); // NOI18N
        jLabel38.setToolTipText("");

        jLabel39.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 135, 49));
        jLabel39.setText("A5");

        jLabel40.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(81, 35, 20));
        jLabel40.setText("₱89.00");

        jLabel41.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(81, 35, 20));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel41.setText("407 kcal");

        jA5QTYTextField.setEditable(false);
        jA5QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA5QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA5QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA5QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jA5PanelLayout = new javax.swing.GroupLayout(jA5Panel);
        jA5Panel.setLayout(jA5PanelLayout);
        jA5PanelLayout.setHorizontalGroup(
            jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA5PanelLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jA5PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA5PanelLayout.createSequentialGroup()
                        .addGroup(jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA5PanelLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jA5PanelLayout.createSequentialGroup()
                        .addComponent(jA5QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA5PanelLayout.setVerticalGroup(
            jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA5PanelLayout.createSequentialGroup()
                .addGroup(jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA5PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jA5PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jA5QTYTextField))
                .addContainerGap())
        );

        jB1Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel42.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(81, 35, 20));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Plain Rice");

        jLabel43.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\rice - icon.png")); // NOI18N
        jLabel43.setToolTipText("");

        jLabel45.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(81, 35, 20));
        jLabel45.setText("₱20.00");

        jLabel46.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(81, 35, 20));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel46.setText("205 kcal");

        jLabel47.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 135, 49));
        jLabel47.setText("B1");

        jB1QTYTextField.setEditable(false);
        jB1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jB1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jB1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jB1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jB1PanelLayout = new javax.swing.GroupLayout(jB1Panel);
        jB1Panel.setLayout(jB1PanelLayout);
        jB1PanelLayout.setHorizontalGroup(
            jB1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jB1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jB1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jB1PanelLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jB1PanelLayout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jB1PanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jB1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jB1PanelLayout.setVerticalGroup(
            jB1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jB1PanelLayout.createSequentialGroup()
                .addGroup(jB1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jB1PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jB1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jB1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jB1QTYTextField))
                .addContainerGap())
        );

        javax.swing.GroupLayout jSecondRowPanelLayout = new javax.swing.GroupLayout(jSecondRowPanel);
        jSecondRowPanel.setLayout(jSecondRowPanelLayout);
        jSecondRowPanelLayout.setHorizontalGroup(
            jSecondRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jSecondRowPanelLayout.setVerticalGroup(
            jSecondRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA4Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA5Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jB1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jThirdRowPanel.setBackground(new java.awt.Color(255, 170, 1));
        jThirdRowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jB2Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel44.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\sinangag - icon.png")); // NOI18N
        jLabel44.setToolTipText("");

        jLabel48.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 135, 49));
        jLabel48.setText("B2");

        jLabel49.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(81, 35, 20));
        jLabel49.setText("₱25.00");

        jLabel50.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(81, 35, 20));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel50.setText("279 kcal");

        jLabel51.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(81, 35, 20));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Sinangag");

        jB2QTYTextField.setEditable(false);
        jB2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jB2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jB2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jB2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        

        javax.swing.GroupLayout jB2PanelLayout = new javax.swing.GroupLayout(jB2Panel);
        jB2Panel.setLayout(jB2PanelLayout);
        jB2PanelLayout.setHorizontalGroup(
            jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jB2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jB2PanelLayout.createSequentialGroup()
                        .addGroup(jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jB2PanelLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jB2PanelLayout.createSequentialGroup()
                        .addComponent(jB2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jB2PanelLayout.setVerticalGroup(
            jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jB2PanelLayout.createSequentialGroup()
                .addGroup(jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jB2PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jB2PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jB2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jB2QTYTextField))
                .addContainerGap())
        );

        jC1Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel52.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(81, 35, 20));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Water");

        jLabel53.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\water - icon.png")); // NOI18N
        jLabel53.setToolTipText("");

        jLabel54.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 135, 49));
        jLabel54.setText("C1");

        jLabel55.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(81, 35, 20));
        jLabel55.setText("₱15.00");

        jLabel56.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(81, 35, 20));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel56.setText("0 kcal");

        jC1QTYTextField.setEditable(false);
        jC1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jC1PanelLayout = new javax.swing.GroupLayout(jC1Panel);
        jC1Panel.setLayout(jC1PanelLayout);
        jC1PanelLayout.setHorizontalGroup(
            jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC1PanelLayout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jC1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jC1PanelLayout.createSequentialGroup()
                        .addGroup(jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jC1PanelLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jC1PanelLayout.createSequentialGroup()
                        .addComponent(jC1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jC1PanelLayout.setVerticalGroup(
            jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC1PanelLayout.createSequentialGroup()
                .addGroup(jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jC1PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jC1PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jC1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jC1QTYTextField))
                .addContainerGap())
        );

        jC2Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel57.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(81, 35, 20));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Coffee");

        jLabel58.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\coffee - icon.png")); // NOI18N
        jLabel58.setToolTipText("");

        jLabel59.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(81, 35, 20));
        jLabel59.setText("₱20.00");

        jLabel60.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(81, 35, 20));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel60.setText("8 kcal");

        jLabel61.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 135, 49));
        jLabel61.setText("C2");

        jC2QTYTextField.setEditable(false);
        jC2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        javax.swing.GroupLayout jC2PanelLayout = new javax.swing.GroupLayout(jC2Panel);
        jC2Panel.setLayout(jC2PanelLayout);
        jC2PanelLayout.setHorizontalGroup(
            jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jC2PanelLayout.createSequentialGroup()
                        .addGroup(jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jC2PanelLayout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jC2PanelLayout.createSequentialGroup()
                        .addComponent(jC2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jC2PanelLayout.setVerticalGroup(
            jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addGroup(jC2PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel58)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jC2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addContainerGap())
        );

        javax.swing.GroupLayout jThirdRowPanelLayout = new javax.swing.GroupLayout(jThirdRowPanel);
        jThirdRowPanel.setLayout(jThirdRowPanelLayout);
        jThirdRowPanelLayout.setHorizontalGroup(
            jThirdRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jThirdRowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jC1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jC2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jThirdRowPanelLayout.setVerticalGroup(
            jThirdRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jB2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jC1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jC2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInsertPaymentPanel.setBackground(new java.awt.Color(245, 235, 220));
        jInsertPaymentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

        jCancelButton.setBackground(new java.awt.Color(217, 22, 4));
        jCancelButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        jCancelButton.setText("Cancel");
        jCancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        jLoadButton.setBackground(new java.awt.Color(26, 135, 56));
        jLoadButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLoadButton.setForeground(new java.awt.Color(255, 255, 255));
        jLoadButton.setText("Load");
        jLoadButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        j1PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j1PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j1PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j1PesoLabel.setText("1 PESO");

        j1PesoField.setEditable(false);
        j1PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j1PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j1PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j1PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j5PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j5PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j5PesoLabel.setText("5 PESO");

        j5PesoField.setEditable(false);
        j5PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j5PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j5PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j5PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j5PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j5PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j10PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 9)); // NOI18N
        j10PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j10PesoLabel.setText("10 PESO");

        j10PesoField.setEditable(false);
        j10PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j10PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j10PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j10PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j10PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j10PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j10PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(j1PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(j5PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j5PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(j10PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j10PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1PesoLabel)
                    .addComponent(j1PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j5PesoLabel)
                    .addComponent(j5PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j5PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j10PesoLabel)
                    .addComponent(j10PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j10PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        j20PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j20PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j20PesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        j20PesoLabel.setText("20 PESO");

        j20PesoField.setEditable(false);
        j20PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j20PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j20PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j20PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        j20PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j20PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j50PesoField.setEditable(false);
        j50PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j50PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j50PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j50PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j50PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j50PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j50PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j50PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j50PesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        j50PesoLabel.setText("50 PESO");

        j100PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j100PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j100PesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        j100PesoLabel.setText("100 PESO");

        j100PesoField.setEditable(false);
        j100PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j100PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j100PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j100PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j100PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j100PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j200PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j200PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j200PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j200PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j200PesoLabel.setText("200 PESO");

        j200PesoField.setEditable(false);
        j200PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j200PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j200PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j200PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j500PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j500PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j500PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j500PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j500PesoLabel.setText("500 PESO");

        j500PesoField.setEditable(false);
        j500PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j500PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j500PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j500PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j1000PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 9)); // NOI18N
        j1000PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j1000PesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        j1000PesoLabel.setText("1000 PESO");

        j1000PesoField.setEditable(false);
        j1000PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j1000PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j1000PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j1000PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        j1000PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1000PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(j20PesoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(j20PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j50PesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j50PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j20PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j100PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j200PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j500PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1000PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j100PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j100PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j200PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j200PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(j1000PesoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j1000PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(j500PesoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j500PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(j50PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j20PesoLabel)
                    .addComponent(j20PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j20PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j50PesoLabel)
                    .addComponent(j50PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j50PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j100PesoLabel)
                    .addComponent(j100PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j100PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j200PesoLabel)
                    .addComponent(j200PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j200PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j500PesoLabel)
                    .addComponent(j500PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j500PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1000PesoLabel)
                    .addComponent(j1000PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1000PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(3, 80, 149));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel1.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel1.setForeground(new java.awt.Color(245, 235, 220));
        jMainLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel1.setText("INSERT PAYMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBillsAvailField.setEditable(false);
        jBillsAvailField.setBackground(new java.awt.Color(255, 170, 1));
        jBillsAvailField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jBillsAvailField.setForeground(new java.awt.Color(255, 255, 255));
        jBillsAvailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jBillsAvailField.setText("Bills");
        jBillsAvailField.setToolTipText("");
        jBillsAvailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));
        jBillsAvailField.setOpaque(true);
        jBillsAvailField.setPreferredSize(new java.awt.Dimension(121, 24));
        
        jCoinsAvailField.setEditable(false);
        jCoinsAvailField.setBackground(new java.awt.Color(255, 170, 1));
        jCoinsAvailField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jCoinsAvailField.setForeground(new java.awt.Color(255, 255, 255));
        jCoinsAvailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCoinsAvailField.setText("Coins");
        jCoinsAvailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));
        jCoinsAvailField.setOpaque(true);
       
        jMainLabel4.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel4.setForeground(new java.awt.Color(26, 135, 56));
        jMainLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel4.setText("Amount Inserted");

        jPanel12.setBackground(new java.awt.Color(46, 24, 16));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(245, 235, 220)));
        jPanel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N

        jDenominationsInputTextField.setEditable(false);
        jDenominationsInputTextField.setBackground(new java.awt.Color(81, 35, 20));
        jDenominationsInputTextField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jDenominationsInputTextField.setForeground(new java.awt.Color(245, 235, 220));
        jDenominationsInputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDenominationsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDenominationsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInsertPaymentPanelLayout = new javax.swing.GroupLayout(jInsertPaymentPanel);
        jInsertPaymentPanel.setLayout(jInsertPaymentPanelLayout);
        jInsertPaymentPanelLayout.setHorizontalGroup(
            jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInsertPaymentPanelLayout.createSequentialGroup()
                        .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jCoinsAvailField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBillsAvailField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jMainLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInsertPaymentPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInsertPaymentPanelLayout.setVerticalGroup(
            jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBillsAvailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCoinsAvailField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jMainLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jIEnterSlotPanel.setBackground(new java.awt.Color(245, 235, 220));
        jIEnterSlotPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

        jPanel3.setBackground(new java.awt.Color(3, 80, 149));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel2.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel2.setForeground(new java.awt.Color(245, 235, 220));
        jMainLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel2.setText("ENTER ITEM SLOT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMainLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jEnterSlotField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jEnterSlotField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        jProceedButton.setBackground(new java.awt.Color(26, 135, 56));
        jProceedButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jProceedButton.setForeground(new java.awt.Color(255, 255, 255));
        jProceedButton.setText("Proceed");
        jProceedButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        javax.swing.GroupLayout jIEnterSlotPanelLayout = new javax.swing.GroupLayout(jIEnterSlotPanel);
        jIEnterSlotPanel.setLayout(jIEnterSlotPanelLayout);
        jIEnterSlotPanelLayout.setHorizontalGroup(
            jIEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jIEnterSlotPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jIEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEnterSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jIEnterSlotPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jIEnterSlotPanelLayout.setVerticalGroup(
            jIEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jIEnterSlotPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEnterSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jReceiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jReceiptTextArea.setEditable(false);
        jReceiptTextArea.setBackground(new java.awt.Color(245, 235, 220));
        jReceiptTextArea.setColumns(20);
        jReceiptTextArea.setRows(5);
        jScrollPane2.setViewportView(jReceiptTextArea);

        jPanel6.setBackground(new java.awt.Color(3, 80, 149));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel3.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jMainLabel3.setForeground(new java.awt.Color(245, 235, 220));
        jMainLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel3.setText("RECEIPT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jReceiptPanelLayout = new javax.swing.GroupLayout(jReceiptPanel);
        jReceiptPanel.setLayout(jReceiptPanelLayout);
        jReceiptPanelLayout.setHorizontalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jReceiptPanelLayout.setVerticalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceiptPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel11.setBackground(new java.awt.Color(46, 24, 16));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(3, 80, 149));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 226, 207));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Collect your Item below:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jEndVMTestButton.setBackground(new java.awt.Color(217, 22, 4));
        jEndVMTestButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jEndVMTestButton.setForeground(new java.awt.Color(255, 255, 255));
        jEndVMTestButton.setText("End VM Test");
        jEndVMTestButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        jSecondRowPanel1.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jC3Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel62.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(81, 35, 20));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Orange Juice");

        jLabel63.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\orange - icon.png")); // NOI18N
        jLabel63.setToolTipText("");

        jLabel64.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(81, 35, 20));
        jLabel64.setText("₱26.00");

        jLabel65.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(81, 35, 20));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel65.setText("112 kcal");

        jLabel66.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 135, 49));
        jLabel66.setText("C3");

        jC3QTYTextField.setEditable(false);
        jC3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jC3PanelLayout = new javax.swing.GroupLayout(jC3Panel);
        jC3Panel.setLayout(jC3PanelLayout);
        jC3PanelLayout.setHorizontalGroup(
            jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC3PanelLayout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jC3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jC3PanelLayout.createSequentialGroup()
                        .addComponent(jC3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jC3PanelLayout.createSequentialGroup()
                        .addGroup(jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jC3PanelLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jC3PanelLayout.setVerticalGroup(
            jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jC3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jC3PanelLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jLabel63))
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jC3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jC3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jCustomizeButton.setBackground(new java.awt.Color(26, 135, 56));
        jCustomizeButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jCustomizeButton.setForeground(new java.awt.Color(245, 235, 220));
        jCustomizeButton.setText("Customize");
        jCustomizeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));
        
        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 3, 10)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel.setText("Customize your own silog!");

        javax.swing.GroupLayout jSecondRowPanel1Layout = new javax.swing.GroupLayout(jSecondRowPanel1);
        jSecondRowPanel1.setLayout(jSecondRowPanel1Layout);
        jSecondRowPanel1Layout.setHorizontalGroup(
            jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jC3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCustomizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jAuthorLabel)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
        );
        jSecondRowPanel1Layout.setVerticalGroup(
            jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jC3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jCustomizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jThirdRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSecondRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFirstRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSecondRowPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jIEnterSlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jEndVMTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFirstRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSecondRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jThirdRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIEnterSlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSecondRowPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEndVMTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }
    
    public int get1PesoSpinnerValue() {
        return (int) j1PesoSpinner.getValue();
    }

    public void set1PesoField(String strMessage) {
        this.j1PesoField.setText(strMessage);
    }

    public int get5PesoSpinnerValue() {
        return Integer.valueOf(j5PesoSpinner.getValue().toString());
    }

    public void set5PesoField(String strMessage) {
        this.j5PesoField.setText(strMessage);
    }

    public int get10PesoSpinnerValue() {
        return Integer.valueOf(j10PesoSpinner.getValue().toString());
    }

    public void set10PesoField(String strMessage) {
        this.j10PesoField.setText(strMessage);
    }

    public int get20PesoSpinnerValue() {
        return Integer.valueOf(j20PesoSpinner.getValue().toString());
    }

    public void set20PesoField(String strMessage) {
        this.j20PesoField.setText(strMessage);
    }

    public int get50PesoSpinnerValue() {
        return Integer.valueOf(j50PesoSpinner.getValue().toString());
    }

    public void set50PesoField(String strMessage) {
        this.j50PesoField.setText(strMessage);
    }

    public int get100PesoSpinnerValue() {
        return Integer.valueOf(j100PesoSpinner.getValue().toString());
    }

    public void set100PesoField(String strMessage) {
        this.j100PesoField.setText(strMessage);
    }

    public int get200PesoSpinnerValue() {
        return Integer.valueOf(j200PesoSpinner.getValue().toString());
    }

    public void set200PesoField(String strMessage) {
        this.j200PesoField.setText(strMessage);
    }

    public int get500PesoSpinnerValue() {
        return Integer.valueOf(j500PesoSpinner.getValue().toString());
    }

    public void set500PesoField(String strMessage) {
        this.j500PesoField.setText(strMessage);
    }

    public int get1000PesoSpinnerValue() {
        return Integer.valueOf(j1000PesoSpinner.getValue().toString());
    }

    public void set1000PesoField(String strMessage) {
        this.j1000PesoField.setText(strMessage);
    }

    public void setLoadButtonListener(ActionListener jActionListener) {
        this.jLoadButton.addActionListener(jActionListener);
    }

    public void setProceedButtonListener(ActionListener jActionListener) {
        this.jProceedButton.addActionListener(jActionListener);
    }

    public void setDenomInputTextField(String strMessage) {
        this.jDenominationsInputTextField.setText(strMessage);
    }

    public void clearDenomInputTextField() {
        this.jDenominationsInputTextField.setText("");
    }
    
    public void setCancelButtonListener(ActionListener jActionListener) {
        this.jCancelButton.addActionListener(jActionListener);
    }

    public String getSlotEntered() {
        return jEnterSlotField.getText();
    }

    public void clearSlotEntered() {
        jEnterSlotField.setText("");
    }

    public void cancelPurchase() {
        this.j1PesoField.setText("");
        this.j5PesoField.setText("");
        this.j10PesoField.setText("");
        this.j20PesoField.setText("");
        this.j50PesoField.setText("");
        this.j100PesoField.setText("");
        this.j200PesoField.setText("");
        this.j500PesoField.setText("");
        this.j1000PesoField.setText("");
    }

    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

    public void setEndVMTestButtonListener(ActionListener jActionListener) {
        this.jEndVMTestButton.addActionListener(jActionListener);
    }

    public void clearDenomSpinnerValues() {
        this.j1PesoSpinner.setValue(0);
        this.j5PesoSpinner.setValue(0);
        this.j10PesoSpinner.setValue(0);
        this.j20PesoSpinner.setValue(0);
        this.j50PesoSpinner.setValue(0);
        this.j100PesoSpinner.setValue(0);
        this.j200PesoSpinner.setValue(0);
        this.j500PesoSpinner.setValue(0);
        this.j1000PesoSpinner.setValue(0);
    }

    public void updateReceiptTextArea(ArrayList<String> arrItems) {
        StringBuilder sb = new StringBuilder();
        for (String strItem : arrItems) {
            sb.append(strItem).append("\n");
        }
        jReceiptTextArea.setText(sb.toString());
    }

    public void clearReceiptTextArea() {
        jReceiptTextArea.setText("");
    }

    public void setA1QTYTextField(String strMessage) {
        this.jA1QTYTextField.setText(strMessage);
    }

    public void setA2QTYTextField(String strMessage) {
        this.jA2QTYTextField.setText(strMessage);
    }

    public void setA3QTYTextField(String strMessage) {
        this.jA3QTYTextField.setText(strMessage);
    }

    public void setA4QTYTextField(String strMessage) {
        this.jA4QTYTextField.setText(strMessage);
    }

    public void setA5QTYTextField(String strMessage) {
        this.jA5QTYTextField.setText(strMessage);
    }

    public void setB1QTYTextField(String strMessage) {
        this.jB1QTYTextField.setText(strMessage);
    }

    public void setB2QTYTextField(String strMessage) {
        this.jB2QTYTextField.setText(strMessage);
    }

    public void setC1QTYTextField(String strMessage) {
        this.jC1QTYTextField.setText(strMessage);
    }

    public void setC2QTYTextField(String strMessage) {
        this.jC2QTYTextField.setText(strMessage);
    }

    public void setC3QTYTextField(String strMessage) {
        this.jC3QTYTextField.setText(strMessage);
    }

    public void setCustomizeButtonListener(ActionListener jActionListener) {
        this.jCustomizeButton.addActionListener(jActionListener);
    }

}

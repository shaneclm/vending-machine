package com.views.vmFeaturesViews;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SVMCustomizeView extends JFrame {
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
    private javax.swing.JLabel jA1Label;
    private javax.swing.JPanel jA1Panel;
    private javax.swing.JPanel jA1Panel1;
    private javax.swing.JPanel jA1Panel10;
    private javax.swing.JPanel jA1Panel11;
    private javax.swing.JPanel jA1Panel12;
    private javax.swing.JPanel jA1Panel13;
    private javax.swing.JPanel jA1Panel14;
    private javax.swing.JPanel jA1Panel15;
    private javax.swing.JPanel jA1Panel2;
    private javax.swing.JPanel jA1Panel3;
    private javax.swing.JPanel jA1Panel4;
    private javax.swing.JPanel jA1Panel5;
    private javax.swing.JPanel jA1Panel6;
    private javax.swing.JPanel jA1Panel7;
    private javax.swing.JPanel jA1Panel8;
    private javax.swing.JPanel jA1Panel9;
    private javax.swing.JTextField jA1QTYTextField;
    private javax.swing.JPanel jA2Panel;
    private javax.swing.JTextField jA2QTYTextField;
    private javax.swing.JPanel jA3Panel;
    private javax.swing.JTextField jA3QTYTextField;
    private javax.swing.JTextField jA4QTYTextField;
    private javax.swing.JTextField jA5QTYTextField;
    private javax.swing.JTextArea jArrCartTextArea;
    private javax.swing.JTextField jB1QTYTextField;
    private javax.swing.JTextField jB2QTYTextField;
    private javax.swing.JLabel jBeefTapaLabel;
    private javax.swing.JButton jBeverageAddToCartButton;
    private javax.swing.JTextField jBeveragePromptField;
    private javax.swing.JTextField jBeverageSelectionField;
    private javax.swing.JTextField jBillsAvailField;
    private javax.swing.JTextField jC1QTYTextField;
    private javax.swing.JTextField jC2QTYTextField;
    private javax.swing.JTextField jC3QTYTextField;
    private javax.swing.JTextField jCaloriesTextField;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JPanel jCheckOutPanel;
    private javax.swing.JButton jCheckoutButton;
    private javax.swing.JTextField jCoinsAvailField;
    private javax.swing.JButton jCollectSilogButton;
    private javax.swing.JButton jCondimentAddToCartButton;
    private javax.swing.JTextField jCondimentSelectionField;
    private javax.swing.JTextField jD1QTYTextField;
    private javax.swing.JTextField jD2QTYTextField;
    private javax.swing.JTextField jDenominationsInputTextField;
    private javax.swing.JTextField jE1QTYTextField;
    private javax.swing.JTextField jE2QTYTextField;
    private javax.swing.JTextField jE3QTYTextField;
    private javax.swing.JButton jEggAddToCartButton;
    private javax.swing.JTextField jEggPromptField;
    private javax.swing.JTextField jEggSelectionField;
    private javax.swing.JTextField jF1QTYTextField;
    private javax.swing.JTextField jF2QTYTextField;
    private javax.swing.JTextField jF3QTYTextField;
    private javax.swing.JPanel jFirstRowPanel;
    private javax.swing.JPanel jInsertPaymentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JButton jLoadButton;
    private javax.swing.JLabel jMainLabel1;
    private javax.swing.JLabel jMainLabel10;
    private javax.swing.JLabel jMainLabel13;
    private javax.swing.JLabel jMainLabel14;
    private javax.swing.JLabel jMainLabel3;
    private javax.swing.JLabel jMainLabel4;
    private javax.swing.JLabel jMainLabel5;
    private javax.swing.JLabel jMainLabel6;
    private javax.swing.JLabel jMainLabel9;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPreparationPanel;
    private javax.swing.JTextField jPromptField11;
    private javax.swing.JPanel jReceiptPanel;
    private javax.swing.JButton jRiceAddToCartButton;
    private javax.swing.JTextField jRicePromptField;
    private javax.swing.JTextField jRiceSelectionField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jSecondRowPanel1;
    private javax.swing.JPanel jSecondRowPanel2;
    private javax.swing.JPanel jSecondRowPanel3;
    private javax.swing.JPanel jSecondRowPanel4;
    private javax.swing.JPanel jSecondRowPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jSideAddToCartButton;
    private javax.swing.JTextField jSideDishSelectionField;
    private javax.swing.JTextField jSidePromptField;
    private javax.swing.JLabel jTotalLabel;
    private javax.swing.JLabel jTotalLabel1;
    private javax.swing.JTextField jTotalTextField;
    private javax.swing.JButton jViandAddToCardButton;
    private javax.swing.JPanel jViandPanel;
    private javax.swing.JTextField jViandPromptField;
    private javax.swing.JTextField jViandSelectionTextField;
    private javax.swing.JTextArea jReceiptTextArea;
    private javax.swing.JScrollPane jScrollPane3;
    
    /**
     * Creates new form SVendingMachineCustom
     */
    public SVMCustomizeView() {
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
        jCheckOutPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jArrCartTextArea = new javax.swing.JTextArea();
        jCheckoutButton = new javax.swing.JButton();
        jTotalLabel = new javax.swing.JLabel();
        jTotalTextField = new javax.swing.JTextField();
        jTotalLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jCaloriesTextField = new javax.swing.JTextField();
        jFirstRowPanel = new javax.swing.JPanel();
        jA1Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jBeefTapaLabel = new javax.swing.JLabel();
        jA1Label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jA1QTYTextField = new javax.swing.JTextField();
        jA2Panel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jReceiptTextArea = new javax.swing.JTextArea();
        jA2QTYTextField = new javax.swing.JTextField();
        jA3Panel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jA3QTYTextField = new javax.swing.JTextField();
        jA1Panel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jA4QTYTextField = new javax.swing.JTextField();
        jA1Panel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jA5QTYTextField = new javax.swing.JTextField();
        jMainLabel4 = new javax.swing.JLabel();
        jViandSelectionTextField = new javax.swing.JTextField();
        jViandAddToCardButton = new javax.swing.JButton();
        jViandPromptField = new javax.swing.JTextField();
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
        jPanel12 = new javax.swing.JPanel();
        jDenominationsInputTextField = new javax.swing.JTextField();
        jMainLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPreparationPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jViandPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jReceiptPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMainLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSecondRowPanel1 = new javax.swing.JPanel();
        jMainLabel6 = new javax.swing.JLabel();
        jRiceAddToCartButton = new javax.swing.JButton();
        jRicePromptField = new javax.swing.JTextField();
        jA1Panel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jB1QTYTextField = new javax.swing.JTextField();
        jA1Panel4 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jB2QTYTextField = new javax.swing.JTextField();
        jRiceSelectionField = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jSecondRowPanel3 = new javax.swing.JPanel();
        jA1Panel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jD1QTYTextField = new javax.swing.JTextField();
        jA1Panel9 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jD2QTYTextField = new javax.swing.JTextField();
        jMainLabel10 = new javax.swing.JLabel();
        jEggAddToCartButton = new javax.swing.JButton();
        jEggPromptField = new javax.swing.JTextField();
        jEggSelectionField = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jSecondRowPanel4 = new javax.swing.JPanel();
        jA1Panel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jE1QTYTextField = new javax.swing.JTextField();
        jA1Panel11 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jE2QTYTextField = new javax.swing.JTextField();
        jA1Panel12 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jE3QTYTextField = new javax.swing.JTextField();
        jMainLabel13 = new javax.swing.JLabel();
        jSidePromptField = new javax.swing.JTextField();
        jSideAddToCartButton = new javax.swing.JButton();
        jSideDishSelectionField = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jSecondRowPanel5 = new javax.swing.JPanel();
        jA1Panel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jF1QTYTextField = new javax.swing.JTextField();
        jA1Panel14 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jF2QTYTextField = new javax.swing.JTextField();
        jA1Panel15 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jF3QTYTextField = new javax.swing.JTextField();
        jMainLabel14 = new javax.swing.JLabel();
        jCondimentAddToCartButton = new javax.swing.JButton();
        jPromptField11 = new javax.swing.JTextField();
        jCondimentSelectionField = new javax.swing.JTextField();
        jSecondRowPanel2 = new javax.swing.JPanel();
        jA1Panel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jC1QTYTextField = new javax.swing.JTextField();
        jA1Panel6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jC2QTYTextField = new javax.swing.JTextField();
        jA1Panel7 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jC3QTYTextField = new javax.swing.JTextField();
        jMainLabel9 = new javax.swing.JLabel();
        jBeverageAddToCartButton = new javax.swing.JButton();
        jBeveragePromptField = new javax.swing.JTextField();
        jBeverageSelectionField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCollectSilogButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 226, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 3));

        jMainPanel.setBackground(new java.awt.Color(3, 80, 149));
        jMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));

        jLabel1.setBackground(new java.awt.Color(217, 22, 4));
        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 235, 220));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customize Your Silog!");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jCheckOutPanel.setBackground(new java.awt.Color(245, 235, 220));
        jCheckOutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jScrollPane2.setBackground(new java.awt.Color(245, 235, 220));
        jScrollPane2.setBorder(null);

        jArrCartTextArea.setEditable(false);
        jArrCartTextArea.setBackground(new java.awt.Color(245, 235, 220));
        jArrCartTextArea.setColumns(20);
        jArrCartTextArea.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jArrCartTextArea.setForeground(new java.awt.Color(81, 35, 20));
        jArrCartTextArea.setRows(5);
        jArrCartTextArea.setBorder(null);
        jScrollPane2.setViewportView(jArrCartTextArea);

        jCheckoutButton.setBackground(new java.awt.Color(26, 135, 56));
        jCheckoutButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 11)); // NOI18N
        jCheckoutButton.setForeground(new java.awt.Color(245, 235, 220));
        jCheckoutButton.setText("Checkout");
        jCheckoutButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckoutButtonActionPerformed(evt);
            }
        });

        jTotalLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jTotalLabel.setForeground(new java.awt.Color(81, 35, 20));
        jTotalLabel.setText("Subtotal");

        jTotalTextField.setEditable(false);
        jTotalTextField.setBackground(new java.awt.Color(245, 235, 220));
        jTotalTextField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jTotalTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTotalTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalTextFieldActionPerformed(evt);
            }
        });

        jTotalLabel1.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jTotalLabel1.setForeground(new java.awt.Color(81, 35, 20));
        jTotalLabel1.setText("Total Calories");

        jCaloriesTextField.setEditable(false);
        jCaloriesTextField.setBackground(new java.awt.Color(245, 235, 220));
        jCaloriesTextField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jCaloriesTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jCaloriesTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCaloriesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaloriesTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCheckOutPanelLayout = new javax.swing.GroupLayout(jCheckOutPanel);
        jCheckOutPanel.setLayout(jCheckOutPanelLayout);
        jCheckOutPanelLayout.setHorizontalGroup(
            jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCheckOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCheckOutPanelLayout.createSequentialGroup()
                        .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jCheckOutPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jCheckOutPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTotalLabel)
                                    .addComponent(jTotalLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTotalTextField)
                                    .addComponent(jCaloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                .addContainerGap())
        );
        jCheckOutPanelLayout.setVerticalGroup(
            jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCheckOutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jCheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotalLabel1)
                    .addComponent(jCaloriesTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        jFirstRowPanel.setBackground(new java.awt.Color(255, 170, 1));
        jFirstRowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 35, 20));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Beef Tapa");

        jBeefTapaLabel.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\beef tapa - icon.png")); // NOI18N
        jBeefTapaLabel.setToolTipText("");

        jA1Label.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jA1Label.setForeground(new java.awt.Color(255, 135, 49));
        jA1Label.setText("A1");

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 35, 20));
        jLabel5.setText("₱ 82.00");

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 35, 20));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("180 kcal");

        jA1QTYTextField.setEditable(false);
        jA1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jA1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA1QTYTextFieldActionPerformed(evt);
            }
        });

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
                                .addComponent(jA1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBeefTapaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1PanelLayout.createSequentialGroup()
                        .addComponent(jA1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1PanelLayout.setVerticalGroup(
            jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jA1Label)
                    .addComponent(jBeefTapaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jA1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA2Panel.setBackground(new java.awt.Color(245, 235, 220));

        jLabel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(81, 35, 20));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Bacon");

        jLabel13.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\bacon - icon.png")); // NOI18N
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 135, 49));
        jLabel14.setText("A2");

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(81, 35, 20));
        jLabel15.setText("₱ 65.00");

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(81, 35, 20));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("161 kcal");

        jA2QTYTextField.setEditable(false);
        jA2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jA2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA2PanelLayout = new javax.swing.GroupLayout(jA2Panel);
        jA2Panel.setLayout(jA2PanelLayout);
        jA2PanelLayout.setHorizontalGroup(
            jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jA2PanelLayout.createSequentialGroup()
                        .addComponent(jA2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jA2PanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jA2PanelLayout.setVerticalGroup(
            jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jA2QTYTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA3Panel.setBackground(new java.awt.Color(245, 235, 220));
        jA3Panel.setPreferredSize(new java.awt.Dimension(136, 141));

        jLabel17.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(81, 35, 20));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Hotdog");

        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\hotdog - icon.png")); // NOI18N
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 135, 49));
        jLabel19.setText("A3");

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(81, 35, 20));
        jLabel20.setText("₱ 59.00");

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(81, 35, 20));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel21.setText("160 kcal");

        jA3QTYTextField.setEditable(false);
        jA3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jA3QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA3QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA3PanelLayout = new javax.swing.GroupLayout(jA3Panel);
        jA3Panel.setLayout(jA3PanelLayout);
        jA3PanelLayout.setHorizontalGroup(
            jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA3PanelLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jA3PanelLayout.createSequentialGroup()
                        .addComponent(jA3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jA3PanelLayout.setVerticalGroup(
            jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jA3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel1.setBackground(new java.awt.Color(245, 235, 220));

        jLabel11.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(81, 35, 20));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Longganisa");

        jLabel29.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\beef tapa - icon.png")); // NOI18N
        jLabel29.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 135, 49));
        jLabel30.setText("A4");

        jLabel31.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(81, 35, 20));
        jLabel31.setText("₱ 72.00");

        jLabel32.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(81, 35, 20));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel32.setText("190 kcal");

        jA4QTYTextField.setEditable(false);
        jA4QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA4QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA4QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA4QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jA4QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA4QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel1Layout = new javax.swing.GroupLayout(jA1Panel1);
        jA1Panel1.setLayout(jA1Panel1Layout);
        jA1Panel1Layout.setHorizontalGroup(
            jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel1Layout.createSequentialGroup()
                        .addGroup(jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel1Layout.createSequentialGroup()
                        .addComponent(jA4QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel1Layout.setVerticalGroup(
            jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jA4QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel2.setBackground(new java.awt.Color(245, 235, 220));

        jLabel33.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(81, 35, 20));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Bangus");

        jLabel34.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\bangus - icon.png")); // NOI18N
        jLabel34.setToolTipText("");

        jLabel35.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 135, 49));
        jLabel35.setText("A5");

        jLabel36.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(81, 35, 20));
        jLabel36.setText("₱ 89.00");

        jLabel42.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(81, 35, 20));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel42.setText("407 kcal");

        jA5QTYTextField.setEditable(false);
        jA5QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jA5QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jA5QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jA5QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jA5QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jA5QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel2Layout = new javax.swing.GroupLayout(jA1Panel2);
        jA1Panel2.setLayout(jA1Panel2Layout);
        jA1Panel2Layout.setHorizontalGroup(
            jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel2Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel2Layout.createSequentialGroup()
                        .addGroup(jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel2Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel2Layout.createSequentialGroup()
                        .addComponent(jA5QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel2Layout.setVerticalGroup(
            jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jA5QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainLabel4.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel4.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel4.setText("ENTER ITEM SLOT");

        jViandSelectionTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jViandSelectionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jViandSelectionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViandSelectionTextFieldActionPerformed(evt);
            }
        });

        jViandAddToCardButton.setBackground(new java.awt.Color(26, 135, 56));
        jViandAddToCardButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jViandAddToCardButton.setForeground(new java.awt.Color(255, 255, 255));
        jViandAddToCardButton.setText("Add to Cart");
        jViandAddToCardButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jViandAddToCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViandAddToCardButtonActionPerformed(evt);
            }
        });

        jViandPromptField.setEditable(false);
        jViandPromptField.setBackground(new java.awt.Color(204, 204, 204));
        jViandPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jViandPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jViandPromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jViandPromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViandPromptFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFirstRowPanelLayout = new javax.swing.GroupLayout(jFirstRowPanel);
        jFirstRowPanel.setLayout(jFirstRowPanelLayout);
        jFirstRowPanelLayout.setHorizontalGroup(
            jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMainLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                        .addGroup(jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jViandAddToCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jViandSelectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jViandPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jFirstRowPanelLayout.setVerticalGroup(
            jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA3Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                .addGroup(jFirstRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jA1Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jA1Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jFirstRowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jViandSelectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jViandAddToCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jViandPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInsertPaymentPanel.setBackground(new java.awt.Color(245, 235, 220));
        jInsertPaymentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jCancelButton.setBackground(new java.awt.Color(217, 22, 4));
        jCancelButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        jCancelButton.setText("Cancel");
        jCancelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelButtonActionPerformed(evt);
            }
        });

        jLoadButton.setBackground(new java.awt.Color(26, 135, 56));
        jLoadButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLoadButton.setForeground(new java.awt.Color(255, 255, 255));
        jLoadButton.setText("Load");
        jLoadButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoadButtonActionPerformed(evt);
            }
        });

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
        j1PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1PesoFieldActionPerformed(evt);
            }
        });

        j5PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 10)); // NOI18N
        j5PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j5PesoLabel.setText("5 PESO");

        j5PesoField.setEditable(false);
        j5PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j5PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j5PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j5PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j5PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5PesoFieldActionPerformed(evt);
            }
        });

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
        j10PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10PesoFieldActionPerformed(evt);
            }
        });

        j10PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j10PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j10PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j5PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j1PesoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j1PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j5PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j5PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j10PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j10PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
        j20PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j20PesoFieldActionPerformed(evt);
            }
        });

        j20PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j20PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        j50PesoField.setEditable(false);
        j50PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j50PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j50PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j50PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j50PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j50PesoFieldActionPerformed(evt);
            }
        });

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
        j100PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j100PesoFieldActionPerformed(evt);
            }
        });

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
        j200PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j200PesoFieldActionPerformed(evt);
            }
        });

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
        j500PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j500PesoFieldActionPerformed(evt);
            }
        });

        j1000PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 9)); // NOI18N
        j1000PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j1000PesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        j1000PesoLabel.setText("1000 PESO");

        j1000PesoField.setEditable(false);
        j1000PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j1000PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 8)); // NOI18N
        j1000PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j1000PesoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j1000PesoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1000PesoFieldActionPerformed(evt);
            }
        });

        j1000PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1000PesoSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
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
        jBillsAvailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBillsAvailFieldActionPerformed(evt);
            }
        });

        jCoinsAvailField.setEditable(false);
        jCoinsAvailField.setBackground(new java.awt.Color(255, 170, 1));
        jCoinsAvailField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 10)); // NOI18N
        jCoinsAvailField.setForeground(new java.awt.Color(255, 255, 255));
        jCoinsAvailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCoinsAvailField.setText("Coins");
        jCoinsAvailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));
        jCoinsAvailField.setOpaque(true);
        jCoinsAvailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCoinsAvailFieldActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(46, 24, 16));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(245, 235, 220)));
        jPanel12.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N

        jDenominationsInputTextField.setEditable(false);
        jDenominationsInputTextField.setBackground(new java.awt.Color(81, 35, 20));
        jDenominationsInputTextField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jDenominationsInputTextField.setForeground(new java.awt.Color(245, 235, 220));
        jDenominationsInputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDenominationsInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDenominationsInputTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDenominationsInputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDenominationsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jMainLabel5.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel5.setForeground(new java.awt.Color(26, 135, 56));
        jMainLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel5.setText("Amount Inserted");

        javax.swing.GroupLayout jInsertPaymentPanelLayout = new javax.swing.GroupLayout(jInsertPaymentPanel);
        jInsertPaymentPanel.setLayout(jInsertPaymentPanelLayout);
        jInsertPaymentPanelLayout.setHorizontalGroup(
            jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCoinsAvailField)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMainLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBillsAvailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMainLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPreparationPanel.setBackground(new java.awt.Color(46, 24, 16));

        javax.swing.GroupLayout jPreparationPanelLayout = new javax.swing.GroupLayout(jPreparationPanel);
        jPreparationPanel.setLayout(jPreparationPanelLayout);
        jPreparationPanelLayout.setHorizontalGroup(
            jPreparationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPreparationPanelLayout.setVerticalGroup(
            jPreparationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPreparationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPreparationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(3, 80, 149));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 226, 207));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Collect your customized silog below:");

        jPanel9.setBackground(new java.awt.Color(81, 35, 20));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        jViandPanel.setBackground(new java.awt.Color(81, 35, 20));
        jViandPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setBackground(new java.awt.Color(217, 22, 4));
        jLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(245, 235, 220));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("> VIAND");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.setName(""); // NOI18N

        javax.swing.GroupLayout jViandPanelLayout = new javax.swing.GroupLayout(jViandPanel);
        jViandPanel.setLayout(jViandPanelLayout);
        jViandPanelLayout.setHorizontalGroup(
            jViandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jViandPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jViandPanelLayout.setVerticalGroup(
            jViandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jReceiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

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

        jReceiptTextArea.setEditable(false);
        jReceiptTextArea.setBackground(new java.awt.Color(239, 226, 207));
        jReceiptTextArea.setColumns(20);
        jReceiptTextArea.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jReceiptTextArea.setRows(5);
        jScrollPane3.setViewportView(jReceiptTextArea);

        javax.swing.GroupLayout jReceiptPanelLayout = new javax.swing.GroupLayout(jReceiptPanel);
        jReceiptPanel.setLayout(jReceiptPanelLayout);
        jReceiptPanelLayout.setHorizontalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jReceiptPanelLayout.setVerticalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceiptPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(81, 35, 20));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setBackground(new java.awt.Color(217, 22, 4));
        jLabel27.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(245, 235, 220));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("> RICE");
        jLabel27.setToolTipText("");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel27.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(81, 35, 20));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setBackground(new java.awt.Color(217, 22, 4));
        jLabel28.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(245, 235, 220));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("> BEVERAGE");
        jLabel28.setToolTipText("");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel28.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSecondRowPanel1.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel6.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel6.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel6.setText("ENTER ITEM SLOT");

        jRiceAddToCartButton.setBackground(new java.awt.Color(26, 135, 56));
        jRiceAddToCartButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jRiceAddToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        jRiceAddToCartButton.setText("Add to Cart");
        jRiceAddToCartButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRiceAddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRiceAddToCartButtonActionPerformed(evt);
            }
        });

        jRicePromptField.setEditable(false);
        jRicePromptField.setBackground(new java.awt.Color(204, 204, 204));
        jRicePromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jRicePromptField.setForeground(new java.awt.Color(217, 22, 4));
        jRicePromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jRicePromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRicePromptFieldActionPerformed(evt);
            }
        });

        jA1Panel3.setBackground(new java.awt.Color(245, 235, 220));

        jLabel22.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(81, 35, 20));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Plain Rice");

        jLabel37.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\rice - icon.png")); // NOI18N
        jLabel37.setToolTipText("");

        jLabel38.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 135, 49));
        jLabel38.setText("B1");

        jLabel39.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(81, 35, 20));
        jLabel39.setText("₱ 20.00");

        jLabel40.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(81, 35, 20));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel40.setText("205 kcal");

        jB1QTYTextField.setEditable(false);
        jB1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jB1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jB1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jB1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jB1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel3Layout = new javax.swing.GroupLayout(jA1Panel3);
        jA1Panel3.setLayout(jA1Panel3Layout);
        jA1Panel3Layout.setHorizontalGroup(
            jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel3Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel3Layout.createSequentialGroup()
                        .addGroup(jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel3Layout.createSequentialGroup()
                        .addComponent(jB1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel3Layout.setVerticalGroup(
            jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jB1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel4.setBackground(new java.awt.Color(245, 235, 220));

        jLabel41.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(81, 35, 20));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Sinangag");

        jLabel43.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\sinangag - icon.png")); // NOI18N
        jLabel43.setToolTipText("");

        jLabel45.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 135, 49));
        jLabel45.setText("B2");

        jLabel46.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(81, 35, 20));
        jLabel46.setText("₱ 25.00");

        jLabel56.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(81, 35, 20));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel56.setText("279 kcal");

        jB2QTYTextField.setEditable(false);
        jB2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jB2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jB2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jB2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jB2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel4Layout = new javax.swing.GroupLayout(jA1Panel4);
        jA1Panel4.setLayout(jA1Panel4Layout);
        jA1Panel4Layout.setHorizontalGroup(
            jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel4Layout.createSequentialGroup()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel4Layout.createSequentialGroup()
                        .addGroup(jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel4Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel4Layout.createSequentialGroup()
                        .addComponent(jB2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel4Layout.setVerticalGroup(
            jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jB2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRiceSelectionField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jRiceSelectionField.setForeground(new java.awt.Color(81, 35, 20));
        jRiceSelectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jRiceSelectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRiceSelectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSecondRowPanel1Layout = new javax.swing.GroupLayout(jSecondRowPanel1);
        jSecondRowPanel1.setLayout(jSecondRowPanel1Layout);
        jSecondRowPanel1Layout.setHorizontalGroup(
            jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jA1Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRicePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMainLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jRiceAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jRiceSelectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jSecondRowPanel1Layout.setVerticalGroup(
            jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jSecondRowPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jMainLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRiceSelectionField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRiceAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRicePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jSecondRowPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jA1Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jA1Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(81, 35, 20));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel61.setBackground(new java.awt.Color(217, 22, 4));
        jLabel61.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(245, 235, 220));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("> Egg");
        jLabel61.setToolTipText("");
        jLabel61.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel61.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSecondRowPanel3.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel8.setBackground(new java.awt.Color(245, 235, 220));

        jLabel24.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(81, 35, 20));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Fried Egg");

        jLabel62.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\fried egg - icon.png")); // NOI18N
        jLabel62.setToolTipText("");

        jLabel63.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 135, 49));
        jLabel63.setText("D1");

        jLabel64.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(81, 35, 20));
        jLabel64.setText("₱ 15.00");

        jLabel65.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(81, 35, 20));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel65.setText("90 kcal");

        jD1QTYTextField.setEditable(false);
        jD1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jD1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jD1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jD1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jD1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jD1QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel8Layout = new javax.swing.GroupLayout(jA1Panel8);
        jA1Panel8.setLayout(jA1Panel8Layout);
        jA1Panel8Layout.setHorizontalGroup(
            jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel8Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel8Layout.createSequentialGroup()
                        .addGroup(jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel8Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel8Layout.createSequentialGroup()
                        .addComponent(jD1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel8Layout.setVerticalGroup(
            jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jD1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel9.setBackground(new java.awt.Color(245, 235, 220));

        jLabel66.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(81, 35, 20));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Scrambled Egg");

        jLabel67.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\scrambled egg - icon.png")); // NOI18N
        jLabel67.setToolTipText("");

        jLabel68.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 135, 49));
        jLabel68.setText("D2");

        jLabel69.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(81, 35, 20));
        jLabel69.setText("₱ 15.00");

        jLabel70.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(81, 35, 20));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel70.setText("91 kcal");

        jD2QTYTextField.setEditable(false);
        jD2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jD2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jD2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jD2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jD2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jD2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel9Layout = new javax.swing.GroupLayout(jA1Panel9);
        jA1Panel9.setLayout(jA1Panel9Layout);
        jA1Panel9Layout.setHorizontalGroup(
            jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel9Layout.createSequentialGroup()
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel9Layout.createSequentialGroup()
                        .addGroup(jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel9Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel9Layout.createSequentialGroup()
                        .addComponent(jD2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel9Layout.setVerticalGroup(
            jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jD2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainLabel10.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel10.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel10.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel10.setText("ENTER ITEM SLOT");

        jEggAddToCartButton.setBackground(new java.awt.Color(26, 135, 56));
        jEggAddToCartButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jEggAddToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        jEggAddToCartButton.setText("Add to Cart");
        jEggAddToCartButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jEggAddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEggAddToCartButtonActionPerformed(evt);
            }
        });

        jEggPromptField.setEditable(false);
        jEggPromptField.setBackground(new java.awt.Color(204, 204, 204));
        jEggPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jEggPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jEggPromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEggPromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEggPromptFieldActionPerformed(evt);
            }
        });

        jEggSelectionField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jEggSelectionField.setForeground(new java.awt.Color(81, 35, 20));
        jEggSelectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEggSelectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEggSelectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSecondRowPanel3Layout = new javax.swing.GroupLayout(jSecondRowPanel3);
        jSecondRowPanel3.setLayout(jSecondRowPanel3Layout);
        jSecondRowPanel3Layout.setHorizontalGroup(
            jSecondRowPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jSecondRowPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSecondRowPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSecondRowPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEggPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSecondRowPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jEggAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMainLabel10)))
                    .addGroup(jSecondRowPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jEggSelectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jSecondRowPanel3Layout.setVerticalGroup(
            jSecondRowPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSecondRowPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jMainLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jEggSelectionField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEggAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEggPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(81, 35, 20));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel76.setBackground(new java.awt.Color(217, 22, 4));
        jLabel76.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(245, 235, 220));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel76.setText("> Side Dish");
        jLabel76.setToolTipText("");
        jLabel76.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel76.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSecondRowPanel4.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel10.setBackground(new java.awt.Color(245, 235, 220));

        jLabel25.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(81, 35, 20));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tomato Slices");

        jLabel71.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\tomato - icon.png")); // NOI18N
        jLabel71.setToolTipText("");

        jLabel72.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 135, 49));
        jLabel72.setText("E1");

        jLabel73.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(81, 35, 20));
        jLabel73.setText("₱ 10.00");

        jLabel74.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(81, 35, 20));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel74.setText("22 kcal");

        jE1QTYTextField.setEditable(false);
        jE1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jE1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jE1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jE1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jE1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jE1QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel10Layout = new javax.swing.GroupLayout(jA1Panel10);
        jA1Panel10.setLayout(jA1Panel10Layout);
        jA1Panel10Layout.setHorizontalGroup(
            jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel10Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel10Layout.createSequentialGroup()
                        .addGroup(jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel10Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel10Layout.createSequentialGroup()
                        .addComponent(jE1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel10Layout.setVerticalGroup(
            jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jE1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel11.setBackground(new java.awt.Color(245, 235, 220));

        jLabel75.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(81, 35, 20));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Cucumber Slices");

        jLabel77.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\cucumber - icon.png")); // NOI18N
        jLabel77.setToolTipText("");

        jLabel78.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 135, 49));
        jLabel78.setText("E2");

        jLabel79.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(81, 35, 20));
        jLabel79.setText("₱ 10.00");

        jLabel80.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(81, 35, 20));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel80.setText("7.5 kcal");

        jE2QTYTextField.setEditable(false);
        jE2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jE2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jE2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jE2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jE2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jE2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel11Layout = new javax.swing.GroupLayout(jA1Panel11);
        jA1Panel11.setLayout(jA1Panel11Layout);
        jA1Panel11Layout.setHorizontalGroup(
            jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel11Layout.createSequentialGroup()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel11Layout.createSequentialGroup()
                        .addGroup(jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel11Layout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel11Layout.createSequentialGroup()
                        .addComponent(jE2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel11Layout.setVerticalGroup(
            jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jE2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel12.setBackground(new java.awt.Color(245, 235, 220));

        jLabel81.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(81, 35, 20));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Atchara");

        jLabel82.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\atchara - icon.png")); // NOI18N
        jLabel82.setToolTipText("");

        jLabel83.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 135, 49));
        jLabel83.setText("E3");

        jLabel84.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(81, 35, 20));
        jLabel84.setText("₱ 15.00");

        jLabel85.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(81, 35, 20));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel85.setText("28 kcal");

        jE3QTYTextField.setEditable(false);
        jE3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jE3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jE3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jE3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jE3QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jE3QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel12Layout = new javax.swing.GroupLayout(jA1Panel12);
        jA1Panel12.setLayout(jA1Panel12Layout);
        jA1Panel12Layout.setHorizontalGroup(
            jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel12Layout.createSequentialGroup()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jA1Panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel12Layout.createSequentialGroup()
                        .addGroup(jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel12Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel12Layout.createSequentialGroup()
                        .addComponent(jE3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel12Layout.setVerticalGroup(
            jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jE3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainLabel13.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel13.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel13.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel13.setText("ENTER ITEM SLOT");

        jSidePromptField.setEditable(false);
        jSidePromptField.setBackground(new java.awt.Color(204, 204, 204));
        jSidePromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jSidePromptField.setForeground(new java.awt.Color(217, 22, 4));
        jSidePromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jSidePromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSidePromptFieldActionPerformed(evt);
            }
        });

        jSideAddToCartButton.setBackground(new java.awt.Color(26, 135, 56));
        jSideAddToCartButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jSideAddToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        jSideAddToCartButton.setText("Add to Cart");
        jSideAddToCartButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSideAddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSideAddToCartButtonActionPerformed(evt);
            }
        });

        jSideDishSelectionField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jSideDishSelectionField.setForeground(new java.awt.Color(81, 35, 20));
        jSideDishSelectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jSideDishSelectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSideDishSelectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSecondRowPanel4Layout = new javax.swing.GroupLayout(jSecondRowPanel4);
        jSecondRowPanel4.setLayout(jSecondRowPanel4Layout);
        jSecondRowPanel4Layout.setHorizontalGroup(
            jSecondRowPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jSecondRowPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSecondRowPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jSecondRowPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSidePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSecondRowPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jSideAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMainLabel13))
                        .addContainerGap())
                    .addGroup(jSecondRowPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jSideDishSelectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jSecondRowPanel4Layout.setVerticalGroup(
            jSecondRowPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jSecondRowPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSideDishSelectionField)
                .addGap(13, 13, 13)
                .addComponent(jSideAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSidePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel18.setBackground(new java.awt.Color(81, 35, 20));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel86.setBackground(new java.awt.Color(217, 22, 4));
        jLabel86.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(245, 235, 220));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel86.setText("> Condiment");
        jLabel86.setToolTipText("");
        jLabel86.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel86.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSecondRowPanel5.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel13.setBackground(new java.awt.Color(245, 235, 220));

        jLabel26.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(81, 35, 20));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ketchup");

        jLabel87.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\ketchup - icon.png")); // NOI18N
        jLabel87.setToolTipText("");

        jLabel88.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 135, 49));
        jLabel88.setText("F1");

        jLabel89.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(81, 35, 20));
        jLabel89.setText("₱ 8.00");

        jLabel90.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(81, 35, 20));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel90.setText("17 kcal");

        jF1QTYTextField.setEditable(false);
        jF1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jF1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jF1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jF1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jF1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jF1QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel13Layout = new javax.swing.GroupLayout(jA1Panel13);
        jA1Panel13.setLayout(jA1Panel13Layout);
        jA1Panel13Layout.setHorizontalGroup(
            jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel13Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel13Layout.createSequentialGroup()
                        .addComponent(jF1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jA1Panel13Layout.createSequentialGroup()
                        .addGroup(jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jA1Panel13Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jA1Panel13Layout.setVerticalGroup(
            jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88)
                    .addComponent(jLabel87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(jF1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel14.setBackground(new java.awt.Color(245, 235, 220));

        jLabel91.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(81, 35, 20));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Soy Sauce");

        jLabel92.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\soy sauce - icon.png")); // NOI18N
        jLabel92.setToolTipText("");

        jLabel93.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 135, 49));
        jLabel93.setText("F2");

        jLabel94.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(81, 35, 20));
        jLabel94.setText("₱ 8.00");

        jLabel95.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(81, 35, 20));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel95.setText("8.5 kcal");

        jF2QTYTextField.setEditable(false);
        jF2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jF2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jF2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jF2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jF2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jF2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel14Layout = new javax.swing.GroupLayout(jA1Panel14);
        jA1Panel14.setLayout(jA1Panel14Layout);
        jA1Panel14Layout.setHorizontalGroup(
            jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel14Layout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel14Layout.createSequentialGroup()
                        .addGroup(jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel14Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel14Layout.createSequentialGroup()
                        .addComponent(jF2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel14Layout.setVerticalGroup(
            jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jF2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel15.setBackground(new java.awt.Color(245, 235, 220));

        jLabel96.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(81, 35, 20));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Vinegar");

        jLabel97.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\vinegar - icon.png")); // NOI18N
        jLabel97.setToolTipText("");

        jLabel98.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 135, 49));
        jLabel98.setText("F3");

        jLabel99.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(81, 35, 20));
        jLabel99.setText("₱ 8.00");

        jLabel100.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(81, 35, 20));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel100.setText("2.7 kcal");

        jF3QTYTextField.setEditable(false);
        jF3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jF3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jF3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jF3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jF3QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jF3QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel15Layout = new javax.swing.GroupLayout(jA1Panel15);
        jA1Panel15.setLayout(jA1Panel15Layout);
        jA1Panel15Layout.setHorizontalGroup(
            jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel15Layout.createSequentialGroup()
                        .addComponent(jF3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jA1Panel15Layout.createSequentialGroup()
                        .addGroup(jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jA1Panel15Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jA1Panel15Layout.setVerticalGroup(
            jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jF3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainLabel14.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel14.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel14.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel14.setText("ENTER ITEM SLOT");

        jCondimentAddToCartButton.setBackground(new java.awt.Color(26, 135, 56));
        jCondimentAddToCartButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jCondimentAddToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        jCondimentAddToCartButton.setText("Add to Cart");
        jCondimentAddToCartButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jCondimentAddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCondimentAddToCartButtonActionPerformed(evt);
            }
        });

        jPromptField11.setEditable(false);
        jPromptField11.setBackground(new java.awt.Color(204, 204, 204));
        jPromptField11.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField11.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPromptField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPromptField11ActionPerformed(evt);
            }
        });

        jCondimentSelectionField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jCondimentSelectionField.setForeground(new java.awt.Color(81, 35, 20));
        jCondimentSelectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCondimentSelectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCondimentSelectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSecondRowPanel5Layout = new javax.swing.GroupLayout(jSecondRowPanel5);
        jSecondRowPanel5.setLayout(jSecondRowPanel5Layout);
        jSecondRowPanel5Layout.setHorizontalGroup(
            jSecondRowPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jSecondRowPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSecondRowPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSecondRowPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPromptField11, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSecondRowPanel5Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jCondimentAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMainLabel14)))
                    .addGroup(jSecondRowPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jCondimentSelectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jSecondRowPanel5Layout.setVerticalGroup(
            jSecondRowPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSecondRowPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jCondimentSelectionField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCondimentAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPromptField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSecondRowPanel2.setBackground(new java.awt.Color(255, 170, 1));
        jSecondRowPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jA1Panel5.setBackground(new java.awt.Color(245, 235, 220));

        jLabel23.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(81, 35, 20));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Water");

        jLabel44.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\water - icon.png")); // NOI18N
        jLabel44.setToolTipText("");

        jLabel47.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 135, 49));
        jLabel47.setText("C1");

        jLabel48.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(81, 35, 20));
        jLabel48.setText("₱ 15.00");

        jLabel49.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(81, 35, 20));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel49.setText("205 kcal");

        jC1QTYTextField.setEditable(false);
        jC1QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC1QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC1QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC1QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jC1QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC1QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel5Layout = new javax.swing.GroupLayout(jA1Panel5);
        jA1Panel5.setLayout(jA1Panel5Layout);
        jA1Panel5Layout.setHorizontalGroup(
            jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel5Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel5Layout.createSequentialGroup()
                        .addGroup(jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel5Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel5Layout.createSequentialGroup()
                        .addComponent(jC1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel5Layout.setVerticalGroup(
            jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jC1QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jA1Panel6.setBackground(new java.awt.Color(245, 235, 220));

        jLabel50.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(81, 35, 20));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Coffee");

        jLabel51.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\coffee - icon.png")); // NOI18N
        jLabel51.setToolTipText("");

        jLabel52.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 135, 49));
        jLabel52.setText("C2");

        jLabel53.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(81, 35, 20));
        jLabel53.setText("₱ 20.00");

        jLabel57.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(81, 35, 20));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel57.setText("8 kcal");

        jC2QTYTextField.setEditable(false);
        jC2QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC2QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC2QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC2QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jC2QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC2QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel6Layout = new javax.swing.GroupLayout(jA1Panel6);
        jA1Panel6.setLayout(jA1Panel6Layout);
        jA1Panel6Layout.setHorizontalGroup(
            jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel6Layout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel6Layout.createSequentialGroup()
                        .addGroup(jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel6Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel6Layout.createSequentialGroup()
                        .addComponent(jC2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel6Layout.setVerticalGroup(
            jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jC2QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jA1Panel7.setBackground(new java.awt.Color(245, 235, 220));

        jLabel54.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(81, 35, 20));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Orange Juice");

        jLabel55.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\orange - icon.png")); // NOI18N
        jLabel55.setToolTipText("");

        jLabel58.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 20)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 135, 49));
        jLabel58.setText("C3");

        jLabel59.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(81, 35, 20));
        jLabel59.setText("₱ 26.00");

        jLabel60.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(81, 35, 20));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel60.setText("112 kcal");

        jC3QTYTextField.setEditable(false);
        jC3QTYTextField.setBackground(new java.awt.Color(232, 225, 214));
        jC3QTYTextField.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jC3QTYTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jC3QTYTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jC3QTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC3QTYTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jA1Panel7Layout = new javax.swing.GroupLayout(jA1Panel7);
        jA1Panel7.setLayout(jA1Panel7Layout);
        jA1Panel7Layout.setHorizontalGroup(
            jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel7Layout.createSequentialGroup()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jA1Panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jA1Panel7Layout.createSequentialGroup()
                        .addGroup(jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jA1Panel7Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jA1Panel7Layout.createSequentialGroup()
                        .addComponent(jC3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jA1Panel7Layout.setVerticalGroup(
            jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jA1Panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jA1Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jC3QTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMainLabel9.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel9.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel9.setText("ENTER ITEM SLOT");

        jBeverageAddToCartButton.setBackground(new java.awt.Color(26, 135, 56));
        jBeverageAddToCartButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jBeverageAddToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        jBeverageAddToCartButton.setText("Add to Cart");
        jBeverageAddToCartButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBeverageAddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeverageAddToCartButtonActionPerformed(evt);
            }
        });

        jBeveragePromptField.setEditable(false);
        jBeveragePromptField.setBackground(new java.awt.Color(204, 204, 204));
        jBeveragePromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jBeveragePromptField.setForeground(new java.awt.Color(217, 22, 4));
        jBeveragePromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jBeveragePromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeveragePromptFieldActionPerformed(evt);
            }
        });

        jBeverageSelectionField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jBeverageSelectionField.setForeground(new java.awt.Color(81, 35, 20));
        jBeverageSelectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jBeverageSelectionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeverageSelectionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSecondRowPanel2Layout = new javax.swing.GroupLayout(jSecondRowPanel2);
        jSecondRowPanel2.setLayout(jSecondRowPanel2Layout);
        jSecondRowPanel2Layout.setHorizontalGroup(
            jSecondRowPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSecondRowPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jA1Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jA1Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jSecondRowPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSecondRowPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jSecondRowPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBeveragePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jSecondRowPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBeverageAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jMainLabel9)))
                    .addGroup(jSecondRowPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBeverageSelectionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jSecondRowPanel2Layout.setVerticalGroup(
            jSecondRowPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jA1Panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jA1Panel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jSecondRowPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jMainLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jBeverageSelectionField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBeverageAddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBeveragePromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\arrow down.png")); // NOI18N

        jCollectSilogButton.setBackground(new java.awt.Color(26, 135, 56));
        jCollectSilogButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        jCollectSilogButton.setForeground(new java.awt.Color(255, 255, 255));
        jCollectSilogButton.setText("Collect silog");
        jCollectSilogButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSecondRowPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSecondRowPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jFirstRowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jViandPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSecondRowPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel8))
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jCollectSilogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSecondRowPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSecondRowPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jReceiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jViandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFirstRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSecondRowPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSecondRowPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSecondRowPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSecondRowPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSecondRowPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCollectSilogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBeverageSelectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeverageSelectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeverageSelectionFieldActionPerformed

    private void jBeveragePromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeveragePromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeveragePromptFieldActionPerformed

    private void jBeverageAddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeverageAddToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeverageAddToCartButtonActionPerformed

    private void jC3QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC3QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC3QTYTextFieldActionPerformed

    private void jC2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC2QTYTextFieldActionPerformed

    private void jC1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC1QTYTextFieldActionPerformed

    private void jCondimentSelectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCondimentSelectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCondimentSelectionFieldActionPerformed

    private void jPromptField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPromptField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPromptField11ActionPerformed

    private void jCondimentAddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCondimentAddToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCondimentAddToCartButtonActionPerformed

    private void jF3QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jF3QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jF3QTYTextFieldActionPerformed

    private void jF2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jF2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jF2QTYTextFieldActionPerformed

    private void jF1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jF1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jF1QTYTextFieldActionPerformed

    private void jSideDishSelectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSideDishSelectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSideDishSelectionFieldActionPerformed

    private void jSideAddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSideAddToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSideAddToCartButtonActionPerformed

    private void jSidePromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSidePromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSidePromptFieldActionPerformed

    private void jE3QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jE3QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jE3QTYTextFieldActionPerformed

    private void jE2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jE2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jE2QTYTextFieldActionPerformed

    private void jE1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jE1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jE1QTYTextFieldActionPerformed

    private void jEggSelectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEggSelectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEggSelectionFieldActionPerformed

    private void jEggPromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEggPromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEggPromptFieldActionPerformed

    private void jEggAddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEggAddToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEggAddToCartButtonActionPerformed

    private void jD2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jD2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jD2QTYTextFieldActionPerformed

    private void jD1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jD1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jD1QTYTextFieldActionPerformed

    private void jRiceSelectionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRiceSelectionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRiceSelectionFieldActionPerformed

    private void jB2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB2QTYTextFieldActionPerformed

    private void jB1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB1QTYTextFieldActionPerformed

    private void jRicePromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRicePromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRicePromptFieldActionPerformed

    private void jRiceAddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRiceAddToCartButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRiceAddToCartButtonActionPerformed

    private void jCoinsAvailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCoinsAvailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCoinsAvailFieldActionPerformed

    private void jBillsAvailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBillsAvailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBillsAvailFieldActionPerformed

    private void j1000PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1000PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1000PesoFieldActionPerformed

    private void j500PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j500PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j500PesoFieldActionPerformed

    private void j200PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j200PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j200PesoFieldActionPerformed

    private void j100PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j100PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j100PesoFieldActionPerformed

    private void j50PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j50PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j50PesoFieldActionPerformed

    private void j20PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j20PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j20PesoFieldActionPerformed

    private void j10PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j10PesoFieldActionPerformed

    private void j5PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j5PesoFieldActionPerformed

    private void j1PesoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1PesoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1PesoFieldActionPerformed

    private void jLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoadButtonActionPerformed

    private void jCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelButtonActionPerformed

    private void jViandPromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViandPromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViandPromptFieldActionPerformed

    private void jViandAddToCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViandAddToCardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViandAddToCardButtonActionPerformed

    private void jViandSelectionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViandSelectionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jViandSelectionTextFieldActionPerformed

    private void jA5QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA5QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jA5QTYTextFieldActionPerformed

    private void jA4QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA4QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jA4QTYTextFieldActionPerformed

    private void jA3QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA3QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jA3QTYTextFieldActionPerformed

    private void jA2QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA2QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jA2QTYTextFieldActionPerformed

    private void jA1QTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jA1QTYTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jA1QTYTextFieldActionPerformed

    private void jCaloriesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaloriesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaloriesTextFieldActionPerformed

    private void jTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalTextFieldActionPerformed

    private void jCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckoutButtonActionPerformed

    private void jDenominationsInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDenominationsInputTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDenominationsInputTextFieldActionPerformed

    

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

    // public void setProceedButtonListener(ActionListener jActionListener) {
    //     this.jProceedButton.addActionListener(jActionListener);
    // }

    public void setDenomInputTextField(String strMessage) {
        this.jDenominationsInputTextField.setText(strMessage);
    }

    public void clearDenomInputTextField() {
        this.jDenominationsInputTextField.setText("");
    }
    
    public void setCancelButtonListener(ActionListener jActionListener) {
        this.jCancelButton.addActionListener(jActionListener);
    }

    // public String getSlotEntered() {
    //     return jEnterSlotField.getText();
    // }

    // public void clearSlotEntered() {
    //     jEnterSlotField.setText("");
    // }

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

    // public void setPrompt(String strMessage) {
    //     this.jPromptField.setText(strMessage);
    // }

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

    public void setD1QTYTextField(String strMessage) {
        this.jD1QTYTextField.setText(strMessage);
    }

    public void setD2QTYTextField(String strMessage) {
        this.jD2QTYTextField.setText(strMessage);
    }

    public void setE1QTYTextField(String strMessage) {
        this.jE1QTYTextField.setText(strMessage);
    }

    public void setE2QTYTextField(String strMessage) {
        this.jE2QTYTextField.setText(strMessage);
    }

    public void setE3QTYTextField(String strMessage) {
        this.jE3QTYTextField.setText(strMessage);
    }

    public void setF1QTYTextField(String strMessage) {
        this.jF1QTYTextField.setText(strMessage);
    }

    public void setF2QTYTextField(String strMessage) {
        this.jF2QTYTextField.setText(strMessage);
    }

    public void setF3QTYTextField(String strMessage) {
        this.jF3QTYTextField.setText(strMessage);
    }
}

package com.views.vmFeaturesViews;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RVendingMachineView extends JFrame {
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
    private javax.swing.JTextField jBillsAvailField;
    private javax.swing.JButton jCancelButton;
    private javax.swing.JTextField jCoinsAvailField;
    private javax.swing.JTextField jDenominationsInputTextField;
    private javax.swing.JButton jEndVMTestButton;
    private javax.swing.JPanel jEnterSlotPanel;
    private javax.swing.JPanel jInsertPaymentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLoadButton;
    private javax.swing.JLabel jMainLabel1;
    private javax.swing.JLabel jMainLabel3;
    private javax.swing.JLabel jMainLabel4;
    private javax.swing.JLabel jMainLabel5;
    private javax.swing.JLabel jMainLabel6;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jPromptField;
    private javax.swing.JPanel jReceiptPanel;
    private javax.swing.JButton jProceedButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jReceiptTextArea;
    private javax.swing.JTextArea jItemsTextArea;
    private javax.swing.JTextField jEnterSlotField;
    private javax.swing.JPanel jThirdRowPanel;

    /**
     * Creates new form RVendingMachine
     */
    public RVendingMachineView() {
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
        jThirdRowPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jItemsTextArea = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jMainLabel4 = new javax.swing.JLabel();
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
        jMainLabel6 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jDenominationsInputTextField = new javax.swing.JTextField();
        jEnterSlotPanel = new javax.swing.JPanel();
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
        jLabel8 = new javax.swing.JLabel();
        jEndVMTestButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMainLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 226, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 3));

        jMainPanel.setBackground(new java.awt.Color(3, 80, 149));
        jMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 2));

        jLabel1.setBackground(new java.awt.Color(217, 22, 4));
        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 235, 220));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Regular Vending Machine");

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jThirdRowPanel.setBackground(new java.awt.Color(255, 170, 1));
        jThirdRowPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        jScrollPane3.setBackground(new java.awt.Color(245, 235, 220));

        jItemsTextArea.setEditable(false);
        jItemsTextArea.setBackground(new java.awt.Color(245, 235, 220));
        jItemsTextArea.setColumns(20);
        jItemsTextArea.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jItemsTextArea.setRows(5);
        jScrollPane3.setViewportView(jItemsTextArea);

        jPanel9.setBackground(new java.awt.Color(255, 135, 49));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel4.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel4.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        jMainLabel4.setForeground(new java.awt.Color(245, 235, 220));
        jMainLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel4.setText("SELECT AN ITEM");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jThirdRowPanelLayout = new javax.swing.GroupLayout(jThirdRowPanel);
        jThirdRowPanel.setLayout(jThirdRowPanelLayout);
        jThirdRowPanelLayout.setHorizontalGroup(
            jThirdRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jThirdRowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );
        jThirdRowPanelLayout.setVerticalGroup(
            jThirdRowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jThirdRowPanelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(12, 12, 12)
                        .addComponent(j10PesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j10PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(j5PesoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j5PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(j1PesoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j1PesoField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(255, 135, 49));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel1.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel1.setForeground(new java.awt.Color(81, 35, 20));
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
        
        jMainLabel6.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jMainLabel6.setForeground(new java.awt.Color(26, 135, 56));
        jMainLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel6.setText("Amount Inserted");

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
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDenominationsInputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
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
                                .addContainerGap()
                                .addComponent(jMainLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jInsertPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(jInsertPaymentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jMainLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jEnterSlotPanel.setBackground(new java.awt.Color(245, 235, 220));
        jEnterSlotPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(102, 102, 102)));

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
        
        javax.swing.GroupLayout jEnterSlotPanelLayout = new javax.swing.GroupLayout(jEnterSlotPanel);
        jEnterSlotPanel.setLayout(jEnterSlotPanelLayout);
        jEnterSlotPanelLayout.setHorizontalGroup(
            jEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterSlotPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jEnterSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterSlotPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jEnterSlotPanelLayout.setVerticalGroup(
            jEnterSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterSlotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEnterSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProceedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jReceiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jReceiptTextArea.setEditable(false);
        jReceiptTextArea.setBackground(new java.awt.Color(245, 235, 220));
        jReceiptTextArea.setColumns(20);
        jReceiptTextArea.setRows(5);
        jScrollPane2.setViewportView(jReceiptTextArea);

        jPanel6.setBackground(new java.awt.Color(255, 135, 49));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel3.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel3.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jMainLabel3.setForeground(new java.awt.Color(81, 35, 20));
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
                .addComponent(jMainLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jReceiptPanelLayout = new javax.swing.GroupLayout(jReceiptPanel);
        jReceiptPanel.setLayout(jReceiptPanelLayout);
        jReceiptPanelLayout.setHorizontalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
        jReceiptPanelLayout.setVerticalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceiptPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel11.setBackground(new java.awt.Color(46, 24, 16));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons\\arrow down.png")); // NOI18N

        jEndVMTestButton.setBackground(new java.awt.Color(217, 22, 4));
        jEndVMTestButton.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jEndVMTestButton.setForeground(new java.awt.Color(255, 255, 255));
        jEndVMTestButton.setText("End VM Test");
        jEndVMTestButton.setBorder(new javax.swing.border.MatteBorder(null));
        
        jPanel3.setBackground(new java.awt.Color(255, 135, 49));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMainLabel5.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jMainLabel5.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel5.setText("ENTER ITEM SLOT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jThirdRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEndVMTestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEnterSlotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jThirdRowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInsertPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEnterSlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEndVMTestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * Updates the items text area with the provided list of items.
     *
     * @param arrItems The ArrayList of strings representing the list of items to be displayed.
     */
    public void updateItemTextArea(ArrayList<String> arrItems) {
        StringBuilder sb = new StringBuilder();
        for (String strItem : arrItems) {
            sb.append(strItem).append("\n");
        }
        jItemsTextArea.setText(sb.toString());
    }

    /**
     * Gets the value of the 1 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get1PesoSpinnerValue() {
        return (int) j1PesoSpinner.getValue();
    }

    /**
     * Sets the message to be displayed in the 1 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set1PesoField(String strMessage) {
        this.j1PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 5 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get5PesoSpinnerValue() {
        return Integer.valueOf(j5PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 5 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set5PesoField(String strMessage) {
        this.j5PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 10 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get10PesoSpinnerValue() {
        return Integer.valueOf(j10PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 10 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set10PesoField(String strMessage) {
        this.j10PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 20 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get20PesoSpinnerValue() {
        return Integer.valueOf(j20PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 20 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set20PesoField(String strMessage) {
        this.j20PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 50 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get50PesoSpinnerValue() {
        return Integer.valueOf(j50PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 50 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set50PesoField(String strMessage) {
        this.j50PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 100 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get100PesoSpinnerValue() {
        return Integer.valueOf(j100PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 100 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set100PesoField(String strMessage) {
        this.j100PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 200 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get200PesoSpinnerValue() {
        return Integer.valueOf(j200PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 200 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set200PesoField(String strMessage) {
        this.j200PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 500 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get500PesoSpinnerValue() {
        return Integer.valueOf(j500PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 500 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set500PesoField(String strMessage) {
        this.j500PesoField.setText(strMessage);
    }

    /**
     * Gets the value of the 1000 peso spinner.
     *
     * @return The integer value of the 1 peso spinner.
     */
    public int get1000PesoSpinnerValue() {
        return Integer.valueOf(j1000PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message to be displayed in the 100 peso field.
     *
     * @param strMessage The message to be displayed in the 1 peso field.
     */
    public void set1000PesoField(String strMessage) {
        this.j1000PesoField.setText(strMessage);
    }

    /**
     * Sets the load button listener with the provided action listener.
     *
     * @param jActionListener The action listener to be set for the load button.
     */
    public void setLoadButtonListener(ActionListener jActionListener) {
        this.jLoadButton.addActionListener(jActionListener);
    }

    /**
     * Sets the proceed button listener with the provided action listener.
     *
     * @param jActionListener The action listener to be set for the proceed button.
     */
    public void setProceedButtonListener(ActionListener jActionListener) {
        this.jProceedButton.addActionListener(jActionListener);
    }

    /**
     * Sets the denominations input text field with the provided message.
     *
     * @param strMessage The message to be set in the denominations input text field.
     */
    public void setDenomInputTextField(String strMessage) {
        this.jDenominationsInputTextField.setText(strMessage);
    }

    /**
     * Clears the denominations input text field.
     */
    public void clearDenomInputTextField() {
        this.jDenominationsInputTextField.setText("");
    }
    
    public void setCancelButtonListener(ActionListener jActionListener) {
        this.jCancelButton.addActionListener(jActionListener);
    }

    /**
     * Gets the text entered in the slot field.
     *
     * @return The string value entered in the slot field.
     */
    public String getSlotEntered() {
        return jEnterSlotField.getText();
    }

    /**
     * Clears the slot field.
     */
    public void clearSlotEntered() {
        jEnterSlotField.setText("");
    }

    /**
     * Cancels the ongoing purchase by resetting the payment fields.
     */
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

    /**
     * Sets the prompt field with the provided message.
     *
     * @param strMessage The message to be set in the prompt field.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

    /**
     * Sets the end VM test button listener with the provided action listener.
     *
     * @param jActionListener The action listener to be set for the end VM test button.
     */
    public void setEndVMTestButtonListener(ActionListener jActionListener) {
        this.jEndVMTestButton.addActionListener(jActionListener);
    }

    /**
     * Clears the denominations spinner values by setting them to zero.
     */
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

    /**
     * Updates the receipt text area with the provided list of items.
     *
     * @param arrItems The ArrayList of strings representing the list of items for the receipt.
     */
    public void updateReceiptTextArea(ArrayList<String> arrItems) {
        StringBuilder sb = new StringBuilder();
        for (String strItem : arrItems) {
            sb.append(strItem).append("\n");
        }
        jReceiptTextArea.setText(sb.toString());
    }

    /**
     * Clears the receipt text area.
     */
    public void clearReceiptTextArea() {
        jReceiptTextArea.setText("");
    }
    
}

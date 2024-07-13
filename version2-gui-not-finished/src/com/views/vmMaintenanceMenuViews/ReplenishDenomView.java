package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ReplenishDenomView extends JFrame {
      private JTextField j1000PesoField;
    private JLabel j1000PesoLabel;
    private JSpinner j1000PesoSpinner;
    private JTextField j100PesoField;
    private JLabel j100PesoLabel;
    private JSpinner j100PesoSpinner;
    private JTextField j10PesoField;
    private JLabel j10PesoLabel;
    private JSpinner j10PesoSpinner;
    private JLabel j1PesoLabel;
    private JSpinner j1PesoSpinner;
    private JTextField j1PesoField;
    private JTextField j200PesoField;
    private JLabel j200PesoLabel;
    private JSpinner j200PesoSpinner;
    private JTextField j20PesoField;
    private JLabel j20PesoLabel;
    private JSpinner j20PesoSpinner;
    private JTextField j500PesoField;
    private JLabel j500PesoLabel;
    private JSpinner j500PesoSpinner;
    private JTextField j50PesoField;
    private JLabel j50PesoLabel;
    private JSpinner j50PesoSpinner;
    private JTextField j5PesoField;
    private JLabel j5PesoLabel;
    private JSpinner j5PesoSpinner;
    private JPanel jBGPanel;
    private JTextField jBillsAvailField;
    private JLabel jBottomLabel;
    private JLabel jBottomLabel1;
    private JTextField jCoinsAvailField;
    private JLabel jMainLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JButton jSaveButton;

    /**
     * Creates new form ReplenishDenominations
     */
    public ReplenishDenomView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jPanel2 = new JPanel();
        jMainLabel1 = new JLabel();
        jBGPanel = new JPanel();
        jSaveButton = new JButton();
        jPanel6 = new JPanel();
        jCoinsAvailField = new JTextField();
        jBillsAvailField = new JTextField();
        jPanel4 = new JPanel();
        j1PesoSpinner = new JSpinner();
        j1PesoLabel = new JLabel();
        j1PesoField = new JTextField();
        j5PesoLabel = new JLabel();
        j5PesoField = new JTextField();
        j5PesoSpinner = new JSpinner();
        j10PesoLabel = new JLabel();
        j10PesoField = new JTextField();
        j10PesoSpinner = new JSpinner();
        jPanel7 = new JPanel();
        j20PesoLabel = new JLabel();
        j20PesoField = new JTextField();
        j20PesoSpinner = new JSpinner();
        j50PesoLabel = new JLabel();
        j50PesoField = new JTextField();
        j50PesoSpinner = new JSpinner();
        j100PesoLabel = new JLabel();
        j100PesoField = new JTextField();
        j100PesoSpinner = new JSpinner();
        j200PesoLabel = new JLabel();
        j200PesoField = new JTextField();
        j200PesoSpinner = new JSpinner();
        j500PesoSpinner = new JSpinner();
        j500PesoField = new JTextField();
        j500PesoLabel = new JLabel();
        j1000PesoSpinner = new JSpinner();
        j1000PesoField = new JTextField();
        j1000PesoLabel = new JLabel();
        jBottomLabel = new JLabel();
        jPanel1 = new JPanel();
        jBottomLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Replenish Denominations");

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel1.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel1.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel1.setText("Denominations");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));

        jSaveButton.setBackground(new java.awt.Color(255, 170, 1));
        jSaveButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jSaveButton.setForeground(new java.awt.Color(81, 35, 20));
        jSaveButton.setText("Save");
        
        jPanel6.setBorder(BorderFactory.createEtchedBorder());

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jCoinsAvailField.setEditable(false);
        jCoinsAvailField.setBackground(new java.awt.Color(26, 135, 56));
        jCoinsAvailField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jCoinsAvailField.setForeground(new java.awt.Color(255, 255, 255));
        jCoinsAvailField.setHorizontalAlignment(JTextField.CENTER);
        jCoinsAvailField.setText("Coins Available");
        jCoinsAvailField.setBorder(BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 3));
        jCoinsAvailField.setOpaque(true);
        
        jBillsAvailField.setEditable(false);
        jBillsAvailField.setBackground(new java.awt.Color(26, 135, 56));
        jBillsAvailField.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jBillsAvailField.setForeground(new java.awt.Color(255, 255, 255));
        jBillsAvailField.setHorizontalAlignment(JTextField.CENTER);
        jBillsAvailField.setText("Bills Available");
        jBillsAvailField.setBorder(BorderFactory.createLineBorder(new java.awt.Color(81, 35, 20), 3));
        jBillsAvailField.setOpaque(true);
        jBillsAvailField.setPreferredSize(new java.awt.Dimension(121, 24));
        
        jPanel4.setBorder(BorderFactory.createEtchedBorder());

        j1PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j1PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j1PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j1PesoLabel.setText("1 PESO");

        j1PesoField.setEditable(false);
        j1PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j1PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j1PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j5PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j5PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j5PesoLabel.setText("5 PESO");

        j5PesoField.setEditable(false);
        j5PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j5PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j5PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j5PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j5PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j5PesoSpinner.setModel(new SpinnerNumberModel());

        j10PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j10PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j10PesoLabel.setText("10 PESO");

        j10PesoField.setEditable(false);
        j10PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j10PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j10PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j10PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j10PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j10PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j10PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j10PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j10PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j5PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j5PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j5PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(j1PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j1PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j1PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j1PesoLabel)
                    .addComponent(j1PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j5PesoLabel)
                    .addComponent(j5PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j5PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j10PesoLabel)
                    .addComponent(j10PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j10PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(BorderFactory.createEtchedBorder());

        j20PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j20PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j20PesoLabel.setText("20 PESO");

        j20PesoField.setEditable(false);
        j20PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j20PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j20PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j20PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j20PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j20PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j50PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j50PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j50PesoLabel.setText("50 PESO");

        j50PesoField.setEditable(false);
        j50PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j50PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j50PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j50PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j50PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j50PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j100PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j100PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j100PesoLabel.setText("100 PESO");

        j100PesoField.setEditable(false);
        j100PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j100PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j100PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j100PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j100PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j100PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j200PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j200PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j200PesoLabel.setText("200 PESO");

        j200PesoField.setEditable(false);
        j200PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j200PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j200PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j200PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j200PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j200PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j500PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j500PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j500PesoField.setEditable(false);
        j500PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j500PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j500PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j500PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j500PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j500PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j500PesoLabel.setText("500 PESO");

        j1000PesoSpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1000PesoSpinner.setModel(new SpinnerNumberModel(0, 0, null, 1));

        j1000PesoField.setEditable(false);
        j1000PesoField.setBackground(new java.awt.Color(204, 204, 204));
        j1000PesoField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        j1000PesoField.setForeground(new java.awt.Color(217, 22, 4));
        j1000PesoField.setHorizontalAlignment(JTextField.CENTER);
        
        j1000PesoLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        j1000PesoLabel.setForeground(new java.awt.Color(81, 35, 20));
        j1000PesoLabel.setText("1000 PESO");

        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j1000PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j1000PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j1000PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j500PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j500PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j500PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j200PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j200PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j200PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j100PesoLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j100PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j100PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j50PesoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(j50PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j50PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(j20PesoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(j20PesoField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                    .addComponent(j20PesoSpinner, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j20PesoLabel)
                    .addComponent(j20PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j20PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j50PesoLabel)
                    .addComponent(j50PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j50PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j100PesoLabel)
                    .addComponent(j100PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j100PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j200PesoLabel)
                    .addComponent(j200PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j200PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j500PesoLabel)
                    .addComponent(j500PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j500PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(j1000PesoLabel)
                    .addComponent(j1000PesoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j1000PesoSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
        jBottomLabel1.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jBottomLabel1)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBottomLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jSaveButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCoinsAvailField)
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBillsAvailField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(1020, 1020, 1020)
                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jCoinsAvailField)
                            .addComponent(jBillsAvailField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSaveButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBGPanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    /**
     * Retrieves the value of the 1 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get1PesoSpinnerValue() {
        return Integer.valueOf(j1PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 1 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set1PesoField(String strMessage) {
        this.j1PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 5 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get5PesoSpinnerValue() {
        return Integer.valueOf(j5PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 5 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set5PesoField(String strMessage) {
        this.j5PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 10 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get10PesoSpinnerValue() {
        return Integer.valueOf(j10PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 10 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set10PesoField(String strMessage) {
        this.j10PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 20 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get20PesoSpinnerValue() {
        return Integer.valueOf(j20PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 20 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set20PesoField(String strMessage) {
        this.j20PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 50 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get50PesoSpinnerValue() {
        return Integer.valueOf(j50PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 50 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set50PesoField(String strMessage) {
        this.j50PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 100 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get100PesoSpinnerValue() {
        return Integer.valueOf(j100PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 100 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set100PesoField(String strMessage) {
        this.j100PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 200 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get200PesoSpinnerValue() {
        return Integer.valueOf(j200PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 200 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set200PesoField(String strMessage) {
        this.j200PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 500 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get500PesoSpinnerValue() {
        return Integer.valueOf(j500PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 500 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set500PesoField(String strMessage) {
        this.j500PesoField.setText(strMessage);
    }

    /**
     * Retrieves the value of the 1000 Peso spinner.
     *
     * @return The integer value of the 1 Peso spinner.
     */
    public int get1000PesoSpinnerValue() {
        return Integer.valueOf(j1000PesoSpinner.getValue().toString());
    }

    /**
     * Sets the message for the 1000 Peso field.
     *
     * @param strMessage The message to be set in the 1 Peso field.
     */
    public void set1000PesoField(String strMessage) {
        this.j1000PesoField.setText(strMessage);
    }

    /**
     * Sets a listener for the Save button.
     *
     * @param jActionListener The ActionListener to be set for the Save button.
     */
    public void setSaveButtonListener(ActionListener jActionListener) {
        this.jSaveButton.addActionListener(jActionListener);
    }

    /**
     * Clears all text fields by resetting the spinner values to zero.
     */
    public void clearTextFields(){
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
    
}


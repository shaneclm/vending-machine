package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TransacSummaryView extends JFrame {
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jExitButton;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JButton jLoadEndButton;
    private JButton jLoadItemsSoldButton;
    private JButton jLoadStartButton;
    private JLabel jMainLabel;
    private JLabel jMainLabel2;
    private JLabel jMainLabel3;
    private JLabel jMainLabel4;
    private JLabel jMainLabel5;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JTextArea jPromptTextArea;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator2;

    /**
     * Creates new form TransacSummary
     */
    public TransacSummaryView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jPanel7 = new JPanel();
        jMainLabel = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jPanel8 = new JPanel();
        jMainLabel5 = new JLabel();
        jSeparator2 = new JSeparator();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jPromptTextArea = new JTextArea();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jLoadStartButton = new JButton();
        jLoadEndButton = new JButton();
        jLabel3 = new JLabel();
        jExitButton = new JButton();
        jLoadItemsSoldButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Transaction Summary");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(245, 235, 220));
        jPanel7.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(251, 250, 237));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setText("Transaction Summary");

        jPanel8.setBackground(new java.awt.Color(26, 135, 56));
        jPanel8.setBorder(BorderFactory.createTitledBorder(""));

        jMainLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jMainLabel5.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        jMainLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jMainLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel5.setText("INVENTORY");

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 235, 220));
        jLabel6.setText("ITEM");

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 235, 220));
        jLabel7.setText("QTY");

        jScrollPane1.setBorder(BorderFactory.createEtchedBorder());

        jPromptTextArea.setEditable(false);
        jPromptTextArea.setColumns(20);
        jPromptTextArea.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jPromptTextArea.setRows(5);
        jScrollPane1.setViewportView(jPromptTextArea);

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jLoadStartButton.setBackground(new java.awt.Color(217, 22, 4));
        jLoadStartButton.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jLoadStartButton.setForeground(new java.awt.Color(255, 255, 255));
        jLoadStartButton.setText("Load Starting Inventory");
        
        jLoadEndButton.setBackground(new java.awt.Color(217, 22, 4));
        jLoadEndButton.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jLoadEndButton.setForeground(new java.awt.Color(255, 255, 255));
        jLoadEndButton.setText("Load Ending Inventory");
        
        jLabel3.setIcon(new ImageIcon("D:\\Downloads\\1.png")); // NOI18N
        jLabel3.setToolTipText("");

        jExitButton.setBackground(new java.awt.Color(217, 22, 4));
        jExitButton.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jExitButton.setForeground(new java.awt.Color(255, 255, 255));
        jExitButton.setText("Exit");
        
        jLoadItemsSoldButton.setBackground(new java.awt.Color(217, 22, 4));
        jLoadItemsSoldButton.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jLoadItemsSoldButton.setForeground(new java.awt.Color(255, 255, 255));
        jLoadItemsSoldButton.setText("Load Items Sold");
        
        GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jMainLabel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLoadStartButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLoadEndButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExitButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLoadItemsSoldButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jMainLabel))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLoadStartButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLoadEndButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLoadItemsSoldButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExitButton)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, 566, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Sets a listener for the Load Start button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setLoadStartButtonListener(ActionListener jActionListener) {
        this.jLoadStartButton.addActionListener(jActionListener);
    }
    
    /**
     * Sets a listener for the Load End button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setLoadEndButtonListener(ActionListener jActionListener) {
        this.jLoadEndButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Load Items Sold button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setLoadItemSoldButtonListener(ActionListener jActionListener) {
        this.jLoadItemsSoldButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Exit button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setExitButtonListener(ActionListener jActionListener) {
        this.jExitButton.addActionListener(jActionListener);
    }

    /**
     * Sets the prompt field with the content of the inventory.
     *
     * @param arrInventory An ArrayList of strings representing the inventory items.
     */
    public void setPromptField(ArrayList<String> arrInventory) {
        StringBuilder sb = new StringBuilder();
        for (String strItem : arrInventory) {
            sb.append(strItem).append("\n");
        }
        jPromptTextArea.setText(sb.toString());
    }

}


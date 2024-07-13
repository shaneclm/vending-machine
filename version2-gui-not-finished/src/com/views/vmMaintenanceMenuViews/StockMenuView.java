package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The StockMenuView class represents the graphical user interface for the stock management menu in the Vending Machine.
 * It allows the user to add new items, remove items, and finish stock management.
 */
public class StockMenuView extends JFrame {
    private JButton jAddButton;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jFinishButton;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField jPromptField;
    private JButton jRemoveButton;

    /**
     * Creates a new instance of the StockMenuView class.
     * This method initializes the GUI components.
     */
    public StockMenuView() {
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
        jAddButton = new JButton();
        jRemoveButton = new JButton();
        jFinishButton = new JButton();
        jPromptField = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Stock Menu");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel.setText("Stock Menu");

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
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jAddButton.setBackground(new java.awt.Color(255, 255, 247));
        jAddButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jAddButton.setForeground(new java.awt.Color(81, 35, 20));
        jAddButton.setText("Add New Item");
        jAddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jPromptField.setHorizontalAlignment(JTextField.CENTER);

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jFinishButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRemoveButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAddButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRemoveButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFinishButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
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
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }
    
    /**
     * Sets a listener for the Add button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setAddButtonListener(ActionListener jActionListener) {
        this.jAddButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Remove button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setRemoveButtonListener(ActionListener jActionListener) {
        this.jRemoveButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Finish button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setFinishButtonListener(ActionListener jActionListener) {
        this.jFinishButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Prompt field.
     *
     * @param jActionListener The ActionListener to be set for the field.
     */
    public void setPromptFieldListener(ActionListener jActionListener) {
        this.jPromptField.addActionListener(jActionListener);
    }

    /**
     * Sets the prompt message in the Prompt field.
     *
     * @param strMessage The message to be displayed in the Prompt field.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

}

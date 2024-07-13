package com.views;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The VMMenuView class represents the graphical user interface for the Vending Machine menu.
 * It displays options for testing vending features and accessing maintenance features.
 */

public class VMMenuView extends JFrame {
    private JLabel jAuthorLabel;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jExitVMButton;
    private JLabel jMainLabel;
    private JButton jMaintenanceButton;
    private JPanel jPanel1;
    private JTextField jPromptField;
    private JButton jTestVMButton;


    /**
     * Creates a new instance of the VMMenuView class.
     * This method initializes the GUI components.
     */
    public VMMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * It sets up the layout and adds components to the panel.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jMainLabel = new JLabel();
        jAuthorLabel = new JLabel();
        jMaintenanceButton = new JButton();
        jTestVMButton = new JButton();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jExitVMButton = new JButton();
        jPromptField = new JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Menu");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));

        jMainLabel.setBackground(new java.awt.Color(255, 255, 255));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainLabel.setText("Vending Machine Menu");

        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(81, 35, 20));
        jAuthorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAuthorLabel.setText("Select an option");

        jMaintenanceButton.setBackground(new java.awt.Color(255, 255, 247));
        jMaintenanceButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jMaintenanceButton.setForeground(new java.awt.Color(81, 35, 20));
        jMaintenanceButton.setText("Maintenance Features");

        jTestVMButton.setBackground(new java.awt.Color(255, 255, 247));
        jTestVMButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jTestVMButton.setForeground(new java.awt.Color(81, 35, 20));
        jTestVMButton.setText("Test Vending Features");

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jExitVMButton.setBackground(new java.awt.Color(255, 255, 247));
        jExitVMButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jExitVMButton.setForeground(new java.awt.Color(81, 35, 20));
        jExitVMButton.setText("Exit");

        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jMainLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jAuthorLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                        .addGroup(jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMaintenanceButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jExitVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTestVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                        .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jMainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuthorLabel)
                .addGap(18, 18, 18)
                .addComponent(jTestVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMaintenanceButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
    /**
     * Sets a listener for the Test Vending Features button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setTestVMButtonListener(ActionListener jActionListener) {
        this.jTestVMButton.addActionListener(jActionListener);
    }
   
    /**
     * Sets a listener for the Maintenance Features button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setMaintenanceButtonListener(ActionListener jActionListener) {
        this.jMaintenanceButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Exit button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setExitButtonListener(ActionListener jActionListener) {
        this.jExitVMButton.addActionListener(jActionListener);
    }

    /**
     * Sets the prompt message displayed in the prompt field.
     *
     * @param strMessage The message to be set as the prompt.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

    /**
     * Sets a listener for the Prompt Field.
     *
     * @param jActionListener The ActionListener to be set for the Prompt Field.
     */
    // public void setPromptFieldActionPerformed(ActionListener jActionListener) {
    //     this.jPromptField.addActionListener(jActionListener);
    // }

}

    


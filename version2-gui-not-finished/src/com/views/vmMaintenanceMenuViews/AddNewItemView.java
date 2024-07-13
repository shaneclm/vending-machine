package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The AddNewItemView class represents the graphical user interface for adding a new item to the Remote Vending Machine system.
 * It allows the user to input details of the new item, such as name, quantity, price, and calories.
 */
public class AddNewItemView extends JFrame {
    private JButton jAddButton;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JLabel jCaloriesLabel;
    private JTextField jItemCaloriesField;
    private JTextField jItemNameField;
    private JLabel jItemNameLabel;
    private JTextField jItemPriceField;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JTextField jPromptField;
    private JLabel jQuantityLabel;
    private JLabel jQuantityLabel1;
    private JSpinner jQuantitySpinner;

    /**
     * Creates a new instance of the AddNewItemView class.
     * This method initializes the GUI components.
     */
    public AddNewItemView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jPanel2 = new JPanel();
        jMainLabel = new JLabel();
        jItemNameLabel = new JLabel();
        jItemPriceField = new JTextField();
        jQuantityLabel = new JLabel();
        jQuantitySpinner = new JSpinner();
        jQuantityLabel1 = new JLabel();
        jItemNameField = new JTextField();
        jCaloriesLabel = new JLabel();
        jItemCaloriesField = new JTextField();
        jPromptField = new JTextField();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jAddButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel.setBorder(BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(254, 254, 237));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel.setText("Add New Item");

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

        jItemNameLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jItemNameLabel.setForeground(new java.awt.Color(81, 35, 20));
        jItemNameLabel.setText(" Enter Item Name:");

        jItemPriceField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jItemPriceField.setForeground(new java.awt.Color(81, 35, 20));
        
        jQuantityLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jQuantityLabel.setForeground(new java.awt.Color(81, 35, 20));
        jQuantityLabel.setText("Enter Item Quantity:");

        jQuantitySpinner.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jQuantitySpinner.setModel(new SpinnerNumberModel(10, 0, 20, 1));

        jQuantityLabel1.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jQuantityLabel1.setForeground(new java.awt.Color(81, 35, 20));
        jQuantityLabel1.setText("Enter Item Price:");

        jItemNameField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jItemNameField.setForeground(new java.awt.Color(81, 35, 20));
        
        jCaloriesLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jCaloriesLabel.setForeground(new java.awt.Color(81, 35, 20));
        jCaloriesLabel.setText("Enter Item Calories:");

        jItemCaloriesField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jItemCaloriesField.setForeground(new java.awt.Color(81, 35, 20));
        
        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(JTextField.CENTER);
        
        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jAddButton.setBackground(new java.awt.Color(217, 22, 4));
        jAddButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jAddButton.setForeground(new java.awt.Color(245, 235, 220));
        jAddButton.setText("Add Item");
        
        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jItemNameField)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jQuantityLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jQuantitySpinner))
                        .addGap(18, 18, 18)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jQuantityLabel1, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jItemPriceField))
                        .addGap(18, 18, 18)
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jItemCaloriesField)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jCaloriesLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jItemNameLabel)
                            .addGroup(jBGPanelLayout.createSequentialGroup()
                                .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jAddButton)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jItemNameLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jItemNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jQuantityLabel)
                    .addComponent(jQuantityLabel1)
                    .addComponent(jCaloriesLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jQuantitySpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jItemPriceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jItemCaloriesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
    
    /**
     * Gets the item name entered by the user.
     *
     * @return The item name as a String.
     */
    public String getItemName() {
        return jItemNameField.getText();
    }

    /**
     * Gets the value selected in the quantity spinner.
     *
     * @return The selected quantity as an integer.
     */
    public int getSpinnerValue() {
        return Integer.valueOf(jQuantitySpinner.getValue().toString());
    }

    /**
     * Gets the item price entered by the user.
     *
     * @return The item price as a float.
     */
    public float getItemPrice() {
        return Float.parseFloat(jItemPriceField.getText());
    }

    /**
     * Gets the item calories entered by the user.
     *
     * @return The item calories as a float.
     */
    public float getItemCalories() {
        return Float.parseFloat(jItemCaloriesField.getText()); // Or you can handle the error gracefully based on your requirements
    }

    /**
     * Sets the prompt field with the provided message.
     *
     * @param strMessage The message to be displayed in the prompt field.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

    /**
     * Sets an ActionListener for the Add button.
     *
     * @param jActionListener The ActionListener to be set for the Add button.
     */
    public void setAddButtonListener(ActionListener jActionListener) {
        this.jAddButton.addActionListener(jActionListener);
    }

    /**
     * Clears all the text fields in the view.
     */
    public void clearTextFields() {
        this.jItemNameField.setText("");
        this.jQuantitySpinner.setValue(10);
        this.jItemPriceField.setText("");
        this.jItemCaloriesField.setText("");
    }

}

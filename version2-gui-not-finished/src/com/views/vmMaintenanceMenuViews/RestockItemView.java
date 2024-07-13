package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The RestockItemView class represents the graphical user interface for restocking a specific item in the vending machine
 * for the Remote Vending Machine system.
 * It allows the user to enter the name and quantity of the item to be restocked and provides buttons for searching,
 * updating the current quantity, and finishing the restocking process.
 */
public class RestockItemView extends JFrame {
    private JPanel jBGPanel2;
    private JLabel jBottomLabel;
    private JTextField jCurrentQTYField;
    private JButton jDoneButton;
    private JTextField jEnterQTYField;
    private JTextField jItemNameField;
    private JLabel jItemNameLabel;
    private JLabel jItemNameLabel1;
    private JLabel jItemNameLabel2;
    private JLabel jMainLabel2;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JTextField jPromptField;
    private JButton jSearchButton;

    /**
     * Creates a new instance of the RestockItemView class.
     * This method initializes the GUI components.
     */
    public RestockItemView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel2 = new JPanel();
        jPanel4 = new JPanel();
        jMainLabel2 = new JLabel();
        jItemNameLabel = new JLabel();
        jItemNameField = new JTextField();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jItemNameLabel1 = new JLabel();
        jEnterQTYField = new JTextField();
        jCurrentQTYField = new JTextField();
        jPromptField = new JTextField();
        jItemNameLabel2 = new JLabel();
        jDoneButton = new JButton();
        jSearchButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Restock Item");

        jBGPanel2.setBackground(new java.awt.Color(245, 235, 220));
        jBGPanel2.setBorder(BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(254, 254, 237));
        jPanel4.setBorder(BorderFactory.createEtchedBorder());

        jMainLabel2.setBackground(new java.awt.Color(81, 35, 20));
        jMainLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel2.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jMainLabel2.setText("Restock Item");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel2, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jItemNameLabel.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jItemNameLabel.setForeground(new java.awt.Color(81, 35, 20));
        jItemNameLabel.setText(" Enter the name of the item you want to restock:");

        jItemNameField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jItemNameField.setForeground(new java.awt.Color(81, 35, 20));
        
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

        jItemNameLabel1.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jItemNameLabel1.setForeground(new java.awt.Color(81, 35, 20));
        jItemNameLabel1.setText("Enter the quantity to add:");

        jEnterQTYField.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jEnterQTYField.setForeground(new java.awt.Color(81, 35, 20));
        
        jCurrentQTYField.setEditable(false);
        jCurrentQTYField.setBackground(new java.awt.Color(243, 243, 243));
        jCurrentQTYField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jCurrentQTYField.setForeground(new java.awt.Color(217, 22, 4));
        jCurrentQTYField.setHorizontalAlignment(JTextField.CENTER);
        
        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(JTextField.CENTER);
        
        jItemNameLabel2.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        jItemNameLabel2.setForeground(new java.awt.Color(81, 35, 20));
        jItemNameLabel2.setText("Current QTY:");

        jDoneButton.setBackground(new java.awt.Color(217, 22, 4));
        jDoneButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jDoneButton.setForeground(new java.awt.Color(245, 235, 220));
        jDoneButton.setText("Done");
        
        jSearchButton.setBackground(new java.awt.Color(217, 22, 4));
        jSearchButton.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jSearchButton.setForeground(new java.awt.Color(245, 235, 220));
        jSearchButton.setText("Search");
        
        GroupLayout jBGPanel2Layout = new GroupLayout(jBGPanel2);
        jBGPanel2.setLayout(jBGPanel2Layout);
        jBGPanel2Layout.setHorizontalGroup(
            jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jPromptField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.LEADING, jBGPanel2Layout.createSequentialGroup()
                        .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jItemNameLabel1)
                            .addComponent(jEnterQTYField, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jItemNameLabel2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jBGPanel2Layout.createSequentialGroup()
                                .addComponent(jCurrentQTYField, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jDoneButton, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GroupLayout.Alignment.LEADING, jBGPanel2Layout.createSequentialGroup()
                        .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jItemNameField, GroupLayout.Alignment.LEADING)
                            .addComponent(jItemNameLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSearchButton)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBGPanel2Layout.setVerticalGroup(
            jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jItemNameLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jItemNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearchButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jItemNameLabel1)
                    .addComponent(jItemNameLabel2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jEnterQTYField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.TRAILING, jBGPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jCurrentQTYField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDoneButton)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jBGPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
    
    /**
     * Sets an ActionListener for the item name text field.
     *
     * @param jActionListener The ActionListener to be set for the item name text field.
     */
    public void setItemNameFieldListener(ActionListener jActionListener) {
        this.jItemNameField.addActionListener(jActionListener);
    }

    /**
     * Retrieves the entered item name from the text field.
     *
     * @return The entered item name as a String.
     */
    public String getItemName() {
        return jItemNameField.getText();
    }

    /**
     * Sets an ActionListener for the quantity text field.
     *
     * @param jActionListener The ActionListener to be set for the quantity text field.
     */
    public void setEnterQTYFieldListener(ActionListener jActionListener) {
        this.jEnterQTYField.addActionListener(jActionListener);
    }

    /**
     * Retrieves the entered quantity from the text field.
     *
     * @return The entered quantity as a String.
     */
    public String getEnterQTY() {
        return jEnterQTYField.getText();
    }

    /**
     * Sets an ActionListener for the current quantity text field.
     *
     * @param jActionListener The ActionListener to be set for the current quantity text field.
     */
    public void setCurrentQTYFieldListener(ActionListener jActionListener) {
        this.jCurrentQTYField.addActionListener(jActionListener);
    }

    /**
     * Updates the current quantity displayed in the text field.
     *
     * @param nCurrentQTY The new current quantity value to be displayed.
     */
    public void updateCurrentQTY(int nCurrentQTY) {
        this.jCurrentQTYField.setText(String.valueOf(nCurrentQTY));
    }

     /**
     * Sets the prompt message to be displayed in the GUI.
     *
     * @param strMessage The prompt message to be displayed.
     */
    public void setPrompt(String strMessage) {
        this.jPromptField.setText(strMessage);
    }

    /**
     * Sets an ActionListener for the Done button.
     *
     * @param jActionListener The ActionListener to be set for the Done button.
     */
    public void setDoneButtonListener(ActionListener jActionListener) {
        this.jDoneButton.addActionListener(jActionListener);
    }

    /**
     * Sets an ActionListener for the Search button.
     *
     * @param jActionListener The ActionListener to be set for the Search button.
     */
    public void setSearchButtonListener(ActionListener jActionListener) {
        this.jSearchButton.addActionListener(jActionListener);
    }

    /**
     * Clears the text fields used for item name, current quantity, and quantity to be restocked.
     */
    public void clearTextFields() {
        this.jItemNameField.setText("");
        this.jCurrentQTYField.setText("");
        this.jEnterQTYField.setText("");
    }    

}



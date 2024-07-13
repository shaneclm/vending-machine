package com.views;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

/**
 * The CreateVMView class represents the graphical user interface for creating a new Vending Machine.
 * It allows the user to choose between creating a Regular Vending Machine or a Special Vending Machine.
 */
public class CreateVMView extends JFrame {
    private JLabel jAuthorLabel;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jRegularVMButton;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JButton jSpecialVMButton;
    
    /**
     * Creates a new instance of the CreateVMView class.
     * This method initializes the GUI components.
     */
    public CreateVMView() {
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
        jSpecialVMButton = new JButton();
        jRegularVMButton = new JButton();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jBGPanel.setBackground(new Color(245, 235, 220));

        jMainLabel.setBackground(new Color(255, 255, 255));
        jMainLabel.setFont(new Font("Montserrat ExtraBold", Font.PLAIN, 18));
        jMainLabel.setForeground(new Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(JLabel.CENTER);
        jMainLabel.setText("Create Vending Machine");

        jAuthorLabel.setFont(new Font("Montserrat Medium", Font.PLAIN, 10));
        jAuthorLabel.setForeground(new Color(81, 35, 20));
        jAuthorLabel.setHorizontalAlignment(JLabel.CENTER);
        jAuthorLabel.setText("Choose your vending machine to be created");

        jSpecialVMButton.setBackground(new Color(255, 255, 247));
        jSpecialVMButton.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 16));
        jSpecialVMButton.setForeground(new Color(81, 35, 20));
        jSpecialVMButton.setText("Special Vending Machine");

        jRegularVMButton.setBackground(new Color(255, 255, 247));
        jRegularVMButton.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 16));
        jRegularVMButton.setForeground(new Color(81, 35, 20));
        jRegularVMButton.setText("Regular Vending Machine");

        jPanel1.setBackground(new Color(26, 135, 56));

        jBottomLabel.setFont(new Font("Montserrat Medium", Font.PLAIN, 10));
        jBottomLabel.setForeground(Color.WHITE);
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap()
        ));
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
        ));

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jMainLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jAuthorLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jSpecialVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRegularVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jMainLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuthorLabel)
                .addGap(38, 38, 38)
                .addComponent(jRegularVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpecialVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * Sets a listener for the Regular Vending Machine button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setRegularVMButtonListener(ActionListener jActionListener) {
        this.jRegularVMButton.addActionListener(jActionListener);
    }

    /**
     * Sets a listener for the Special Vending Machine button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setSpecialVMButtonListener(ActionListener jActionListener) {
        this.jSpecialVMButton.addActionListener(jActionListener);
    }
}

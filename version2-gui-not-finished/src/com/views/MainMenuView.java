package com.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * The MainMenuView class represents the graphical user interface for the main menu of the Vending Machine Factory Simulator.
 * It displays options for creating a vending machine, testing the vending machine, and exiting the application.
 */
public class MainMenuView extends JFrame {
    private JLabel jMainLabel;
    private JLabel jAuthorLabel;
    private JButton jTestVMButton;
    private JButton jCreateVMButton;
    private JButton jExitVMButton;
    private JLabel jBottomLabel;

    /**
     * Creates a new instance of the MainMenuView class.
     * This method initializes the GUI components.
     */
    public MainMenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * It sets up the layout and adds components to the panel.
     */
    private void initComponents() {
        JPanel jBGPanel = new JPanel();

        jMainLabel = new JLabel();
        jAuthorLabel = new JLabel();
        jTestVMButton = new JButton();
        jCreateVMButton = new JButton();
        jExitVMButton = new JButton();
        JPanel jPanel1 = new JPanel();
        jBottomLabel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine Factory");
        setAlwaysOnTop(true);
        setBackground(Color.darkGray);
        setForeground(Color.cyan);

        jBGPanel.setBackground(new Color(245, 235, 220));

        jMainLabel.setBackground(new Color(255, 255, 255));
        jMainLabel.setFont(new Font("Montserrat ExtraBold", Font.PLAIN, 18));
        jMainLabel.setForeground(new Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(JLabel.CENTER);
        jMainLabel.setText("Welcome to Vending Machine Factory Simulator!");

        jAuthorLabel.setFont(new Font("Montserrat Medium", Font.PLAIN, 10));
        jAuthorLabel.setForeground(new Color(81, 35, 20));
        jAuthorLabel.setText("• program created by Shania Cloma and Hannah Vinuya as their final requirement for CCPROG3");

        jTestVMButton.setBackground(new Color(255, 255, 247));
        jTestVMButton.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 16));
        jTestVMButton.setForeground(new Color(81, 35, 20));
        jTestVMButton.setText("Test Vending Machine");

        jCreateVMButton.setBackground(new Color(255, 255, 247));
        jCreateVMButton.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 16));
        jCreateVMButton.setForeground(new Color(81, 35, 20));
        jCreateVMButton.setText("Create Vending Machine");

        jExitVMButton.setBackground(new Color(255, 255, 247));
        jExitVMButton.setFont(new Font("Montserrat SemiBold", Font.PLAIN, 16));
        jExitVMButton.setForeground(new Color(81, 35, 20));
        jExitVMButton.setText("Exit");

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
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jMainLabel, GroupLayout.PREFERRED_SIZE, 510, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jBGPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jAuthorLabel)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jExitVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTestVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCreateVMButton, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jMainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAuthorLabel, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jCreateVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTestVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExitVMButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jMainLabel.getAccessibleContext().setAccessibleParent(null);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

     /**
     * Sets a listener for the Create Vending Machine button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setCreateVMButtonListener(ActionListener jActionListener) {
        this.jCreateVMButton.addActionListener(jActionListener);
    }
    
    /**
     * Sets a listener for the Test Vending Machine button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setTestVMButtonListener(ActionListener jActionListener) {
        this.jTestVMButton.addActionListener(jActionListener);
    }
    
    /**
     * Sets a listener for the Exit button.
     *
     * @param jActionListener The ActionListener to be set for the button.
     */
    public void setExitVMButtonListener(ActionListener jActionListener) {
        this.jExitVMButton.addActionListener(jActionListener);
    }

}

package com.views.vmMaintenanceMenuViews;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The CollectPaymentView class represents the graphical user interface for displaying the total amount collected in the payment slot
 * for the Remote Vending Machine system.
 * It allows the user to view the total amount collected and provides a button to confirm the collection process.
 */
public class CollectPaymentView extends JFrame {
    private JLabel jAuthorLabel;
    private JLabel jAuthorLabel1;
    private JPanel jBGPanel;
    private JLabel jBottomLabel;
    private JButton jDoneButton;
    private JLabel jMainLabel;
    private JPanel jPanel1;
    private JTextField jPromptField;

    /**
     * Creates a new instance of the CollectPaymentView class.
     * This method initializes the GUI components.
     */
    public CollectPaymentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jBGPanel = new JPanel();
        jMainLabel = new JLabel();
        jAuthorLabel = new JLabel();
        jPanel1 = new JPanel();
        jBottomLabel = new JLabel();
        jDoneButton = new JButton();
        jPromptField = new JTextField();
        jAuthorLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine: Collect Payment");

        jBGPanel.setBackground(new java.awt.Color(245, 235, 220));

        jMainLabel.setBackground(new java.awt.Color(255, 255, 255));
        jMainLabel.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(81, 35, 20));
        jMainLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jMainLabel.setText("Collect Payment");

        jAuthorLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jAuthorLabel.setForeground(new java.awt.Color(217, 22, 4));
        jAuthorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jAuthorLabel.setText("Total Amount Collected:");

        jPanel1.setBackground(new java.awt.Color(26, 135, 56));

        jBottomLabel.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jBottomLabel.setForeground(new java.awt.Color(255, 255, 255));
        jBottomLabel.setText("DE LA SALLE UNIVERSITY MANILA •  Taft Ave, Malate, Manila");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBottomLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBottomLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        );

        jDoneButton.setBackground(new java.awt.Color(255, 255, 247));
        jDoneButton.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jDoneButton.setForeground(new java.awt.Color(81, 35, 20));
        jDoneButton.setText("Done");
        
        jPromptField.setEditable(false);
        jPromptField.setBackground(new java.awt.Color(243, 243, 243));
        jPromptField.setFont(new java.awt.Font("Montserrat Medium", 2, 12)); // NOI18N
        jPromptField.setForeground(new java.awt.Color(217, 22, 4));
        jPromptField.setHorizontalAlignment(JTextField.CENTER);
        
        jAuthorLabel1.setFont(new java.awt.Font("Montserrat Medium", 3, 12)); // NOI18N
        jAuthorLabel1.setForeground(new java.awt.Color(81, 35, 20));
        jAuthorLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jAuthorLabel1.setText("Calculating total amount inside payment slot...");

        GroupLayout jBGPanelLayout = new GroupLayout(jBGPanel);
        jBGPanel.setLayout(jBGPanelLayout);
        jBGPanelLayout.setHorizontalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jMainLabel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jBGPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPromptField, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAuthorLabel, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDoneButton, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jBGPanelLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jAuthorLabel1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );
        jBGPanelLayout.setVerticalGroup(
            jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jBGPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jMainLabel)
                .addGap(56, 56, 56)
                .addComponent(jAuthorLabel, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPromptField, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(jDoneButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(jBGPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jBGPanelLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jAuthorLabel1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jBGPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    /**
     * Sets an ActionListener for the prompt field.
     *
     * @param jActionListener The ActionListener to be set for the prompt field.
     */
    public void setPromptFieldListener(ActionListener jActionListener) {
        this.jPromptField.addActionListener(jActionListener);
    }

    /**
     * Sets the displayed prompt with the total payment amount.
     *
     * @param fTotalPayment The total payment amount to be displayed.
     */
    public void setPrompt(float fTotalPayment) {
        this.jPromptField.setText(String.valueOf(fTotalPayment));
    }

    /**
     * Sets an ActionListener for the Done button.
     *
     * @param jActionListener The ActionListener to be set for the Done button.
     */
    public void setDoneButtonListener(ActionListener jActionListener) {
        this.jDoneButton.addActionListener(jActionListener);
    }

}

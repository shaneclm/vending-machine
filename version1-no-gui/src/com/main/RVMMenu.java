package com.main;

import java.util.Scanner;

import com.denominations.Denominations;
import com.vendingMachine.RVendingMachine;
import com.inventory.Inventory;

public class RVMMenu {

    RVMFeatures    CRVMFeatures    = new RVMFeatures();
    RVMMaintenance CRVMMaintenance = new RVMMaintenance();
    Denominations  CPaymentSlot    = new Denominations();
    Inventory      CTransacSummary = new Inventory();

    public RVendingMachine createVendingMachine(Scanner sc) {
        System.out.println("\n\t[1] Regular Vending Machine");
        System.out.println("\t[2] Special Vending Machine (not yet available)");
        System.out.print("\nChoice: ");

        int vmChoice = sc.nextInt();

        if (vmChoice == 1) {
            System.out.println("Vending machine successfully created!");
            return new RVendingMachine();
        } else {
            System.out.println("Special Vending Machine is still in progress.");
            return null;
        }
    }

    public void testVendingMachine(RVendingMachine RVM, Scanner sc) {
        int nTestChoice = 0;

        if (RVM == null) {
            System.out.println("No vending machine created yet. Please create a vending machine first.");
            return;
        }

        do {
            System.out.println("\n\t[1] Test Vending Features");
            System.out.println("\t[2] Maintenance Features");
            System.out.println("\t[3] Exit");
            System.out.print("\nChoice: ");
            nTestChoice = sc.nextInt();

            switch (nTestChoice) {
                case 1:
                    if (RVM.getItems().size() < 1) {
                        System.out.println("Vending machine cannot be tested. There must be at least 1 item/s in the machine.");
                    } else if (RVM.getDenominations().getTotalAmount() == 0) {
                        System.out.println("Vending machine cannot be tested. The machine's change slot is empty.");
                    } else {
                        testVendingFeatures(RVM, sc);
                    }
                    break;
                case 2:
                    //CTransacSummary.setEndingInventoryMap(RVM.getItems());
                    displayMaintenanceMenu(RVM, sc);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (nTestChoice != 3);
    }

    public void displayMaintenanceMenu(RVendingMachine RVM, Scanner sc) {
        int nChoice = 0;

        do {
            System.out.println();
            System.out.println("\t[1] Stock Items");
            System.out.println("\t[2] Restock Items");
            System.out.println("\t[3] Collect Payment");
            System.out.println("\t[4] Replenish Denominations");
            System.out.println("\t[5] Display Transaction Summary");
            System.out.println("\t[6] Exit");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();

            switch (nChoice) {
                case 1:
                    displayStockMenu(RVM, sc);                    
                    break;
                case 2:
                    CTransacSummary.resetInventory();
                    displayRestockMenu(RVM, sc);
                    break;
                case 3:
                    System.out.println("Calculating total money inside payment slot...");
                    System.out.println("Total amount collected: " + CPaymentSlot.getTotalAmount());
                    CPaymentSlot.resetDenominations();
                    break;
                case 4:
                    CRVMMaintenance.replenishDenom(RVM, sc);
                    break;
                case 5:
                    CTransacSummary.setEndingInventoryMap(RVM.getItems());
                    CTransacSummary.setItemsSoldMap(RVM.getItemsSold());
                    CTransacSummary.displayTransactionSummary();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (nChoice != 6);
    }

    public void testVendingFeatures(RVendingMachine RVM, Scanner sc) {
        int nChoice = 0;
        boolean bFlag = true;

        do {
            System.out.println();
            System.out.println("\t[1] Start Test");
            System.out.println("\t[2] End Test");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();
            do {
                switch(nChoice) {
                    case 1:
                        CRVMFeatures.displayAllItems(RVM);
                        bFlag = CRVMFeatures.buyItem(RVM, sc, CPaymentSlot);
                        break;
                    case 2:
                        System.out.println("Ending VM Testing...");
                        break;
                    default: 
                        System.out.println("Invalid choice.");
                        break;
                }

            } while (!bFlag);

        } while (nChoice != 2);
    }

    public void displayStockMenu(RVendingMachine RVM, Scanner sc) {
        int nChoice = 0;

        do {
            System.out.println();
            System.out.println("\t[1] Add New Item");
            System.out.println("\t[2] Finish Adding Items");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();

            switch(nChoice) {
                case 1:
                    sc.nextLine();
                    CRVMMaintenance.addNewItem(RVM, sc);
                    break;
                case 2:
                    CTransacSummary.setStartingInventoryMap(RVM.getItems());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (nChoice != 2);
    }

    public void displayRestockMenu(RVendingMachine RVM, Scanner sc) {
        int nChoice = 0;

        do {
            System.out.println();
            System.out.println("\t[1] Restock a Specific Item");
            System.out.println("\t[2] Finish Restocking Items");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();

            switch(nChoice) {
                case 1:
                    sc.nextLine();
                    CRVMMaintenance.restockItem(RVM, sc);
                    break;
                case 2:
                    CTransacSummary.setStartingInventoryMap(RVM.getItems());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (nChoice != 2);
    }

}

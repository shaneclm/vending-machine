package com.main;

import java.util.HashMap;
import java.util.Scanner;

import com.denominations.Denominations;
import com.items.Item;
import com.vendingMachine.RVendingMachine;

public class RVMMaintenance {
    private Denominations replenishedDMN = new Denominations();
    private HashMap<String, Integer> categoryMap = new HashMap<>();

    public void addNewItem(RVendingMachine RVM, Scanner sc) {

        if (RVM.getItems().size() == 5) { // RVM slots -- min: 8 | max: 10
            System.out.println("All 10 vending machine slots are occupied. No additional items can be added.");
        } else {
            System.out.print("\nEnter item name: ");
            String strName = sc.nextLine();
            System.out.println("\nAvailable Categories: [Viand], [Rice], [Beverage]");
            System.out.print("Enter item category: ");
            String strCateg = sc.nextLine();

            int nQuantity = 0;
            do {
                System.out.print("Enter item quantity: ");
                nQuantity = sc.nextInt();
                if (nQuantity < 10 || nQuantity > 20) {
                    System.out.println("Invalid quantity. Item slot can only hold 10 to 20 items.\n");
                }
            } while (nQuantity < 10 || nQuantity > 20); // RVM quantity per item/slot -- min: 10 | max: 20

            System.out.print("Enter item price: ");
            float fPrice = sc.nextFloat();
            System.out.print("Enter item calories: ");
            float fCalories = sc.nextFloat();

            Item CNewItem = new Item(strName, strCateg, nQuantity, fPrice, fCalories, categoryMap);

            RVM.addItem(CNewItem);
            System.out.println("\nItem successfully added!");
        }
    }

    public void restockItem(RVendingMachine RVM, Scanner sc) {
        int nAddQuantity = 0;
        int nCheckQuantity = 0;
        boolean bItemFound = false;

        System.out.print("Enter the name of the item you want to restock: ");
        String strName = sc.nextLine();

        for (Item CItem : RVM.getItems()) {
            if (CItem.getName().equalsIgnoreCase(strName)) {
                bItemFound = true;
                System.out.println("\nCurrent quantity: " + CItem.getQuantity());

                do {
                    System.out.print("Enter the quantity to add: ");
                    nAddQuantity = sc.nextInt();
                    nCheckQuantity = CItem.getQuantity() + nAddQuantity;
                    if (nCheckQuantity < 10 || nCheckQuantity > 20) {
                        System.out.println("Invalid quantity. Item slot can only hold 10 to 20 items.\n");
                    }
                } while (nCheckQuantity < 10 || nCheckQuantity > 20);

                int nUpdatedQuantity = CItem.getQuantity() + nAddQuantity;
                CItem.setQuantity(nUpdatedQuantity);
                System.out.println("\nRestock successful!");
            }
        }

        if (!bItemFound) {
            System.out.println("Item does not exist.");
        }
    }

    public void replenishDenom(RVendingMachine RVM, Scanner sc) {
        int nChoice;

        do {
            System.out.println();
            RVM.displayCoins();
            RVM.displayBills();
            System.out.println();
            System.out.println("\t[1] Add Coins");
            System.out.println("\t[2] Add Bills");
            System.out.println("\t[3] Exit");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();

            switch (nChoice) {
                case 1:
                    addCoins(RVM, replenishedDMN, sc);
                    RVM.addDenomination(replenishedDMN);
                    break;
                case 2:
                    addBills(RVM, replenishedDMN, sc);
                    RVM.addDenomination(replenishedDMN);
                    break;
                default:
                    break;
            }

        } while (nChoice != 3);

    }

    private void addCoins(RVendingMachine RVM, Denominations replenishedDMN, Scanner sc) {
        System.out.println("\nEnter the quantity of coins you want to add:");
        System.out.print("1 Peso Coin : ");
        int n1Coin = sc.nextInt();
        System.out.print("5 Peso Coin : ");
        int n5Coin = sc.nextInt();
        System.out.print("10 Peso Coin: ");
        int n10Coin = sc.nextInt();

        replenishedDMN.set1Coins(replenishedDMN.get1Coins() + n1Coin);
        replenishedDMN.set5Coins(replenishedDMN.get5Coins() + n5Coin);
        replenishedDMN.set10Coins(replenishedDMN.get10Coins() + n10Coin);

    }

    private void addBills(RVendingMachine RVM, Denominations replenishedDMN, Scanner sc) {
        System.out.println("\nEnter the quantity of bills you want to add:");
        System.out.print("20 Peso Bill  : ");
        int n20Bill = sc.nextInt();
        System.out.print("50 Peso Bill  : ");
        int n50Bill = sc.nextInt();
        System.out.print("100 Peso Bill : ");
        int n100Bill = sc.nextInt();
        System.out.print("200 Peso Bill : ");
        int n200Bill = sc.nextInt();
        System.out.print("500 Peso Bill : ");
        int n500Bill = sc.nextInt();
        System.out.print("1000 Peso Bill: ");
        int n1000Bill = sc.nextInt();

        replenishedDMN.set20Bills(replenishedDMN.get20Bills() + n20Bill);
        replenishedDMN.set50Bills(replenishedDMN.get50Bills() + n50Bill);
        replenishedDMN.set100Bills(replenishedDMN.get100Bills() + n100Bill);
        replenishedDMN.set200Bills(replenishedDMN.get200Bills() + n200Bill);
        replenishedDMN.set500Bills(replenishedDMN.get500Bills() + n500Bill);
        replenishedDMN.set1000Bills(replenishedDMN.get1000Bills() + n1000Bill);

    }


}

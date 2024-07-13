package com.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.items.Item;
import com.payment.Payment;
import com.denominations.Denominations;
import com.vendingMachine.RVendingMachine;

public class RVMFeatures {

    public void displayAllItems(RVendingMachine RVM) {
        // bwct na border (ง •̀_•́)ง grrr
        System.out.println("\n\t| " + String.format("%-4s", "SLOT") + " | " + String.format("%-15s", "ITEM") + " | "
                                    + String.format("%8s", "CALORIES") + " | " + String.format("%6s", " PRICE ") + " | "
                                    + String.format("%3s", "QTY") + " |");

                                   
        ArrayList<Item> arrTemp = RVM.getItems();
        Collections.sort(arrTemp, Comparator.comparing(Item::getSlot));

        for (Item CItem : arrTemp) {
            System.out.println("\t| " + String.format("%-4s", CItem.getSlot()) + " | "
                                      + String.format("%-15s", CItem.getName()) + " | " + String.format("%8s", CItem.getCalories())
                                      + " | " + String.format("%7s", CItem.getPrice()) + " | " + String.format("%3s", CItem.getQuantity()) + " |");
        }
    }

    public boolean buyItem(RVendingMachine RVM, Scanner sc, Denominations CPaymentSlot) {

        int     nChoice           = 0;
        int     nPurchaseChoice   = 0;
        boolean bValidSlot        = false;
        boolean bSuccess          = false;

        Denominations CTempPayment = new Denominations();
        Payment       CPayment     = new Payment();

        do {

            System.out.println();
            System.out.println("Please choose the payment method:");
            System.out.println("[1] Insert Bill");
            System.out.println("[2] Insert Coin");
            System.out.println("[3] Proceed to item selection");
            System.out.println("[4] Exit");
            System.out.print("\nChoice: ");

            nChoice = sc.nextInt();

            switch(nChoice) {
                case 1: // bill
                    System.out.println();
                    System.out.println("Please choose the bill amount:");
                    System.out.println("[1] 20 Pesos");
                    System.out.println("[2] 50 Pesos");
                    System.out.println("[3] 100 Pesos");
                    System.out.println("[4] 200 Pesos");
                    System.out.println("[5] 500 Pesos");
                    System.out.println("[6] 1000 Pesos");
                    System.out.print("\nChoice: ");

                    int nBillChoice = sc.nextInt();

                    CPayment.updateUserBillDenom(nBillChoice, CTempPayment);
                    System.out.println("\nAmount inserted: " + CTempPayment.getTotalAmount());

                    break;
                case 2: // coin
                    System.out.println();
                    System.out.println("Please choose the coin amount:");
                    System.out.println("[1] 1 Peso");
                    System.out.println("[2] 5 Pesos");
                    System.out.println("[3] 10 Pesos");
                    System.out.print("\nChoice: ");

                    int nCoinChoice = sc.nextInt();

                    CPayment.updateUserCoinDenom(nCoinChoice, CTempPayment);
                    System.out.println("\nAmount inserted: " + CTempPayment.getTotalAmount());

                    break;
                case 3:
                    displayAllItems(RVM);
                    break;
                case 4: 
                    if (CTempPayment.getTotalAmount() > 0) {
                        System.out.println("\nPurchase cancelled. Returning inserted payment...");
                        CPayment.returnPayment(CTempPayment);
                    }
                    break;
                default: 
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (nChoice != 3 && nChoice != 4);

        if (nChoice == 3){
            do {
                System.out.println();
                System.out.println("Purchase Confirmation");
                System.out.println("[1] Proceed to item selection");
                System.out.println("[2] Cancel purchase");
                System.out.print("\nChoice: ");

                nPurchaseChoice = sc.nextInt();
                sc.nextLine();

                switch(nPurchaseChoice) {
                    case 1:
                        System.out.print("\nEnter the item slot you want to purchase: ");
                        String strSlot = sc.nextLine();

                        bValidSlot = RVM.isSlotValid(strSlot);
                        if (bValidSlot) {   // if true
                            Item CSelectedItem = RVM.getItemBySlot(strSlot);
                            
                            if (CSelectedItem != null) {
                                System.out.println();
                                System.out.println("Selected item   : " + CSelectedItem.getName());
                                System.out.println("Purchase amount : " + CSelectedItem.getPrice());
                                CPayment.setTotalAmount(CSelectedItem.getPrice());
                                
                                // payment process + produce change
                                float fChange = CPayment.calculateChange(RVM, CTempPayment);

                                if (fChange < 0) {
                                    CPayment.returnPayment(CTempPayment);
                                    buyItem(RVM, sc, CPaymentSlot);

                                } else if (fChange == 0) { // exact amount inserted
                                    System.out.println("\nDispensing item...");

                                    System.out.println("\nChange: " + fChange);
                                    RVM.updateQtyOfItemSold(CSelectedItem.getName(), CSelectedItem.getPrice()); 
                                    CSelectedItem.setQuantity(CSelectedItem.getQuantity() - 1);
                                    CPaymentSlot.addDenomination(CTempPayment);
                                    System.out.println("\nTransaction successful. Thank you for purchasing!");

                                    return false;

                                } else {
                                    System.out.println("\nDispensing item...");
                            
                                    boolean bIsSuccess = CPayment.produceChange(RVM, CPaymentSlot, CTempPayment);
                                    
                                    if (bIsSuccess){
                                        RVM.updateQtyOfItemSold(CSelectedItem.getName(), CSelectedItem.getPrice()); 
                                        CSelectedItem.setQuantity(CSelectedItem.getQuantity() - 1);
                                        System.out.println("\nTransaction successful. Thank you for purchasing!");
                                        bSuccess = true;
                                    } else {
                                        System.out.println("Returning inserted payment...");
                                        CPayment.returnPayment(CTempPayment);
                                        return false;
                                    }

                                }
                            }
                        } else {
                            System.out.println("\nInvalid slot.");
                        }
                        break;
                    case 2:
                        System.out.println("\nPurchase cancelled. Returning inserted payment...");
                        CPayment.returnPayment(CTempPayment);
                        return true;
                    default:
                        System.out.println("\nInvalid choice.");
                        break;
            }
            
            } while (nPurchaseChoice != 2 && !bSuccess);

        } else if (nChoice == 4) {
            return true;
        }

        return false;

    }

}

package com.main;

import java.util.Scanner;
import com.vendingMachine.RVendingMachine;

public class Main {
    public static void main(String[] args) {
        Scanner sc          = new Scanner(System.in);
        RVendingMachine RVM = null;
        RVMMenu CRVMMenu    = new RVMMenu();

        int nChoice = 0;

        do {
            System.out.println();
            System.out.println("\t[1] Create Vending Machine");
            System.out.println("\t[2] Test Vending Machine");
            System.out.println("\t[3] Exit");
            System.out.print("\nChoice: ");
            nChoice = sc.nextInt();

            switch (nChoice) {
                case 1:
                    RVM = CRVMMenu.createVendingMachine(sc);
                    break;
                case 2:
                    CRVMMenu.testVendingMachine(RVM, sc);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (nChoice != 3);

        sc.close();
    }

}

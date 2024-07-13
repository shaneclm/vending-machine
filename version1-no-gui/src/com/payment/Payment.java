package com.payment;

import com.denominations.Denominations;
import com.vendingMachine.RVendingMachine;

public class Payment {
    
    private float fTotalAmount; // amount to be paid 
    private float fChange;

    public Payment() {
        this.fTotalAmount  = 0;
        this.fChange       = 0;
    }   

    public void setTotalAmount(float fTotalAmount) {
        this.fTotalAmount = fTotalAmount;
    }

    public void updateUserBillDenom(int nBillChoice, Denominations CTempPayment) {
        int nQty = 0;

        switch (nBillChoice) {
            case 1:
                nQty = CTempPayment.get20Bills() + 1;
                CTempPayment.set20Bills(nQty);
                break;
            case 2:
                nQty = CTempPayment.get50Bills() + 1;
                CTempPayment.set50Bills(nQty);
                break;
            case 3:
                nQty = CTempPayment.get100Bills() + 1;
                CTempPayment.set100Bills(nQty);
                break;
            case 4:
                nQty = CTempPayment.get200Bills() + 1;
                CTempPayment.set200Bills(nQty);
                break;
            case 5:
                nQty = CTempPayment.get500Bills() + 1;
                CTempPayment.set500Bills(nQty);
                break;
            case 6:
                nQty = CTempPayment.get100Bills() + 1;
                CTempPayment.set1000Bills(nQty);
                break;
            default:
                break;
        }
    }

    public void updateUserCoinDenom(int nCoinChoice, Denominations CTempPayment) {
        int nQty = 0;

        switch (nCoinChoice) {
            case 1:
                nQty = CTempPayment.get1Coins() + 1;
                CTempPayment.set1Coins(nQty);
                break;
            case 2:
                nQty = CTempPayment.get5Coins() + 1;
                CTempPayment.set5Coins(nQty);
                break;
            case 3:
                nQty = CTempPayment.get10Coins() + 1;
                CTempPayment.set10Coins(nQty);
                break;
            default:
                break;
        }
    }

    public float calculateChange(RVendingMachine RVM, Denominations CTempPayment) {
        fChange = CTempPayment.getTotalAmount() - fTotalAmount;
        if (fChange >= 0) {
            return fChange;
        } else if (fChange < 0) {
            System.out.println("\nInsufficient amount inserted. Returning inserted payment...");
        } 
        
        return fChange;
    }

    public boolean produceChange(RVendingMachine RVM, Denominations CPaymentSlot, Denominations CTempPayment) {
        int nNeededQty = 0;
        int nUpdatedQty = 0;
        boolean bEnoughChange = true;
        boolean bIsSuccess = false;

        Denominations CTempDenom = RVM.getDenominations();

        
        if (fChange > 0 && CTempDenom.getTotalAmount() > fChange) {
            System.out.println("\nChange: " + fChange);
            System.out.println("Dispensing change with the following denominations...");
            
            while (fChange != 0 && bEnoughChange) {
                if (fChange >= 1000 && CTempDenom.get1000Bills() > 0 ) {
                    nNeededQty = (int) (fChange / 1000);
                    if (nNeededQty <= CTempDenom.get1000Bills()) {      // 1000
                        nUpdatedQty = CTempDenom.get1000Bills() - nNeededQty;
                        CTempDenom.set1000Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 1000 Peso Bill/s");
                        fChange = fChange - (1000 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get1000Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set1000Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 1000 Peso Bill/s");
                        fChange = fChange - (1000 * nNeededQty);
                    }
                } else if (fChange >= 500 && CTempDenom.get500Bills() > 0) {
                    nNeededQty = (int) (fChange / 500);
                    if (nNeededQty <= CTempDenom.get500Bills()) {      // 500
                        nUpdatedQty = CTempDenom.get500Bills() - nNeededQty;
                        CTempDenom.set500Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 500 Peso Bill/s");
                        fChange = fChange - (500 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get500Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set500Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 500 Peso Bill/s");
                        fChange = fChange - (500 * nNeededQty);
                    }
                } else if (fChange >= 200 && CTempDenom.get200Bills() > 0) {
                    nNeededQty = (int) (fChange / 200);
                    if (nNeededQty <= CTempDenom.get200Bills()) {      // 200
                        nUpdatedQty = CTempDenom.get200Bills() - nNeededQty;
                        CTempDenom.set200Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 200 Peso Bill/s");
                        fChange = fChange - (200 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get200Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set200Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 200 Peso Bill/s");
                        fChange = fChange - (200 * nNeededQty);
                    }
                } else if (fChange >= 100 && CTempDenom.get100Bills() > 0) {
                    nNeededQty = (int) (fChange / 100);
                    if (nNeededQty <= CTempDenom.get100Bills()) {      // 200
                        nUpdatedQty = CTempDenom.get100Bills() - nNeededQty;
                        CTempDenom.set100Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 100 Peso Bill/s");
                        fChange = fChange - (100 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get100Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set100Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 100 Peso Bill/s");
                        fChange = fChange - (100 * nNeededQty);
                    }
                } else if (fChange >= 50 && CTempDenom.get50Bills() > 0) {
                    nNeededQty = (int) (fChange / 50);
                    if (nNeededQty <= CTempDenom.get50Bills()) {      // 50
                        nUpdatedQty = CTempDenom.get50Bills() - nNeededQty;
                        CTempDenom.set50Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 50 Peso Bill/s");
                        fChange = fChange - (50 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get50Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set50Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 50 Peso Bill/s");
                        fChange = fChange - (50 * nNeededQty);
                    }
                } else if (fChange >= 20 && CTempDenom.get20Bills() > 0) {
                    nNeededQty = (int) (fChange / 20);
                    if (nNeededQty <= CTempDenom.get20Bills()) {      // 20
                        nUpdatedQty = CTempDenom.get20Bills() - nNeededQty;
                        CTempDenom.set20Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 20 Peso Bill/s");
                        fChange = fChange - (20 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get50Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set20Bills(nUpdatedQty);
                        System.out.println(nNeededQty + " 20 Peso Bill/s");
                        fChange = fChange - (20 * nNeededQty);
                    }
                } else if (fChange >= 10 && CTempDenom.get10Coins() > 0) {
                    nNeededQty = (int) (fChange / 10);
                    if (nNeededQty <= CTempDenom.get10Coins()) {      // 10
                        nUpdatedQty = CTempDenom.get10Coins() - nNeededQty;
                        CTempDenom.set10Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 10 Peso Coin/s");
                        fChange = fChange - (10 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get10Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set10Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 10 Peso Coin/s");
                        fChange = fChange - (10 * nNeededQty);
                    }
                } else if (fChange >= 5 && CTempDenom.get5Coins() > 0) {
                    nNeededQty = (int) (fChange / 5);
                    if (nNeededQty <= CTempDenom.get5Coins()) {      // 5
                        nUpdatedQty = CTempDenom.get5Coins() - nNeededQty;
                        CTempDenom.set5Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 5 Peso Coin/s");
                        fChange = fChange - (5 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get5Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set5Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 5 Peso Coin/s");
                        fChange = fChange - (5 * nNeededQty);
                    }
                } else if (fChange >= 1 && CTempDenom.get1Coins() > 0) {
                    nNeededQty = (int) (fChange / 1);
                    if (nNeededQty <= CTempDenom.get1Coins()) {      // 1
                        nUpdatedQty = CTempDenom.get1Coins() - nNeededQty;
                        CTempDenom.set1Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 1 Peso Coin/s");
                        fChange = fChange - (1 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get1Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set1Coins(nUpdatedQty);
                        System.out.println(nNeededQty + " 1 Peso Coin/s");
                        fChange = fChange - (1 * nNeededQty);
                    }
                } else {
                    bEnoughChange = false;
                }
            }
        } else {
            bEnoughChange = false;
        }

        if (!bEnoughChange) {
            System.out.println("\nNot enough money to produce change, please insert the exact amount to continue the transaction.");
            return bIsSuccess;
        } else {
            RVM.setDenominations(CTempDenom);
            CPaymentSlot.addDenomination(CTempPayment);
            bIsSuccess = true;
            return bIsSuccess;
        }
        
    }

    public void returnPayment(Denominations CTempPayment) {
        int nPayment;

        nPayment = CTempPayment.get1Coins();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get1Coins() + " 1 Peso Coin/s"); 
            }

        nPayment = CTempPayment.get5Coins();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get5Coins() + " 5 Peso Coin/s"); 
            } 

        nPayment = CTempPayment.get10Coins();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get10Coins() + " 10 Peso Coin/s"); 
            } 

        nPayment = CTempPayment.get20Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get20Bills() + " 20 Peso Bill/s"); 
            } 
    
        nPayment = CTempPayment.get50Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get50Bills() + " 50 Peso Bill/s"); 
            } 

        nPayment = CTempPayment.get100Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get100Bills() + " 100 Peso Bill/s"); 
            } 

        nPayment = CTempPayment.get200Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get200Bills() + " 200 Peso Bill/s"); 
            } 

        nPayment = CTempPayment.get500Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get500Bills() + " 500 Peso Bill/s"); 
            }

        nPayment = CTempPayment.get1000Bills();
            if (nPayment > 0) {
                System.out.println(CTempPayment.get1000Bills() + " 500 Peso Bill/s"); 
        } 
    }

}
package com.models.payment;

import java.util.ArrayList;

import com.models.denominations.Denominations;
import com.models.items.Item;
import com.models.vendingMachine.VendingMachine;

/**
 * Represents a payment made by the user for a transaction in a vending machine.
 */
public class Payment {
    private float fTotalAmount;
    private float fChange;
    private Denominations CTempDenom;

    /**
     * Initializes the Payment class with fields set to 0.
     */
    public Payment() {
        this.fTotalAmount = 0;
        this.fChange = 0;
    }

     /**
     * Updates the user's bill denominations based on the bill choice.
     * 
     * @param nBillChoice   the bill choice selected by the user
     * @param CTempPayment  the temporary payment object to update the bill denomination
     */
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
                nQty = CTempPayment.get1000Bills() + 1;
                CTempPayment.set1000Bills(nQty);
                break;
            default:
                break;
        }
    }

    /**
     * Updates the user's coin denominations based on the coin choice.
     * 
     * @param nCoinChoice   the coin choice selected by the user
     * @param CTempPayment  the temporary payment object to update the coin denomination
     */
    public void updateUserCoinDenom(int nCoinChoice, Denominations CTempPayment) {
        switch (nCoinChoice) {
            case 1:
                int nQty1 = CTempPayment.get1Coins() + 1;
                CTempPayment.set1Coins(nQty1);
                break;
            case 2:
                int nQty5 = CTempPayment.get5Coins() + 1;
                CTempPayment.set5Coins(nQty5);
                break;
            case 3:
                int nQty10 = CTempPayment.get10Coins() + 1;
                CTempPayment.set10Coins(nQty10);
                break;
            default:
                break;
        }
    }

    /**
     * Accumulates the change to be returned based on the total amount to be paid and the user's payment.
     * 
     * @param CVendingMachine the vending machine object
     * @param CTempPayment    the temporary payment object to update the bill denomination
     * @return the calculated change
     */
    public float calculateChange(VendingMachine CVendingMachine, Denominations CTempPayment) {
        fChange = CTempPayment.calculateTotalAmount() - fTotalAmount;

        return fChange;
    }

    /**
     * Generates change based on the available denominations on the vending machine and the required change amount.
     * 
     * @param CVendingMachine the vending machine object
     * @param CPaymentSlot    the payment slot object containing the user's payment
     * @param CTempPayment    the temporary payment object containing the user's payment
     * @return true if the change is successfully produced and added to the payment slot, false otherwise
     */
    public boolean produceChange(VendingMachine CVendingMachine, Denominations CPaymentSlot,
        Denominations CTempPayment, ArrayList<String> arrReceipt) {
        int nNeededQty = 0;
        int nUpdatedQty = 0;
        boolean bEnoughChange = true;
        boolean bIsSuccess = false;
        String strChange;

        CTempDenom = CVendingMachine.getDenominations();

        if (fChange > 0 && CTempDenom.calculateTotalAmount() >= fChange) {
            strChange = " Change: " + fChange + "\n" + 
                        " Dispensing change with the following denominations..." + "\n";

            while (fChange != 0 && bEnoughChange) {
                if (fChange >= 1000 && CTempDenom.get1000Bills() > 0) {
                    nNeededQty = (int) (fChange / 1000);
                    if (nNeededQty <= CTempDenom.get1000Bills()) { // 1000
                        nUpdatedQty = CTempDenom.get1000Bills() - nNeededQty;
                        CTempDenom.set1000Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 1000 Peso Bill(s)" + "\n";
                        fChange = fChange - (1000 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get1000Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set1000Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 1000 Peso Bill(s)" + "\n";
                        fChange = fChange - (1000 * nNeededQty);
                    }
                } else if (fChange >= 500 && CTempDenom.get500Bills() > 0) {
                    nNeededQty = (int) (fChange / 500);
                    if (nNeededQty <= CTempDenom.get500Bills()) { // 500
                        nUpdatedQty = CTempDenom.get500Bills() - nNeededQty;
                        CTempDenom.set500Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 500 Peso Bill(s)" + "\n";
                        fChange = fChange - (500 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get500Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set500Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 500 Peso Bill(s)" + "\n";
                        fChange = fChange - (500 * nNeededQty);
                    }
                } else if (fChange >= 200 && CTempDenom.get200Bills() > 0) {
                    nNeededQty = (int) (fChange / 200);
                    if (nNeededQty <= CTempDenom.get200Bills()) { // 200
                        nUpdatedQty = CTempDenom.get200Bills() - nNeededQty;
                        CTempDenom.set200Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 200 Peso Bill(s)" + "\n";
                        fChange = fChange - (200 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get200Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set200Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 200 Peso Bill(s)" + "\n";
                        fChange = fChange - (200 * nNeededQty);
                    }
                } else if (fChange >= 100 && CTempDenom.get100Bills() > 0) {
                    nNeededQty = (int) (fChange / 100);
                    if (nNeededQty <= CTempDenom.get100Bills()) { // 200
                        nUpdatedQty = CTempDenom.get100Bills() - nNeededQty;
                        CTempDenom.set100Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 100 Peso Bill(s)" + "\n";
                        fChange = fChange - (100 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get100Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set100Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 100 Peso Bill(s)" + "\n";
                        fChange = fChange - (100 * nNeededQty);
                    }
                } else if (fChange >= 50 && CTempDenom.get50Bills() > 0) {
                    nNeededQty = (int) (fChange / 50);
                    if (nNeededQty <= CTempDenom.get50Bills()) { // 50
                        nUpdatedQty = CTempDenom.get50Bills() - nNeededQty;
                        CTempDenom.set50Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 50 Peso Bill(s)" + "\n";
                        fChange = fChange - (50 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get50Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set50Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 50 Peso Bill(s)" + "\n";
                        fChange = fChange - (50 * nNeededQty);
                    }
                } else if (fChange >= 20 && CTempDenom.get20Bills() > 0) {
                    nNeededQty = (int) (fChange / 20);
                    if (nNeededQty <= CTempDenom.get20Bills()) { // 20
                        nUpdatedQty = CTempDenom.get20Bills() - nNeededQty;
                        CTempDenom.set20Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 20 Peso Bill(s)" + "\n";
                        fChange = fChange - (20 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get50Bills();
                        nUpdatedQty = 0;
                        CTempDenom.set20Bills(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 20 Peso Bill(s)" + "\n";
                        fChange = fChange - (20 * nNeededQty);
                    }
                } else if (fChange >= 10 && CTempDenom.get10Coins() > 0) {
                    nNeededQty = (int) (fChange / 10);
                    if (nNeededQty <= CTempDenom.get10Coins()) { // 10
                        nUpdatedQty = CTempDenom.get10Coins() - nNeededQty;
                        CTempDenom.set10Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 10 Peso Bill(s)" + "\n";
                        fChange = fChange - (10 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get10Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set10Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 10 Peso Bill(s)" + "\n";
                        fChange = fChange - (10 * nNeededQty);
                    }
                } else if (fChange >= 5 && CTempDenom.get5Coins() > 0) {
                    nNeededQty = (int) (fChange / 5);
                    if (nNeededQty <= CTempDenom.get5Coins()) { // 5
                        nUpdatedQty = CTempDenom.get5Coins() - nNeededQty;
                        CTempDenom.set5Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 5 Peso Bill(s)" + "\n";
                        fChange = fChange - (5 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get5Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set5Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 5 Peso Bill(s)" + "\n";
                        fChange = fChange - (5 * nNeededQty);
                    }
                } else if (fChange >= 1 && CTempDenom.get1Coins() > 0) {
                    nNeededQty = (int) (fChange / 1);
                    if (nNeededQty <= CTempDenom.get1Coins()) { // 1
                        nUpdatedQty = CTempDenom.get1Coins() - nNeededQty;
                        CTempDenom.set1Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 1 Peso Bill(s)" + "\n";
                        fChange = fChange - (1 * nNeededQty);
                    } else {
                        nNeededQty = CTempDenom.get1Coins();
                        nUpdatedQty = 0;
                        CTempDenom.set1Coins(nUpdatedQty);
                        strChange += "  " + nNeededQty + " 1 Peso Bill(s)" + "\n";
                        fChange = fChange - (1 * nNeededQty);
                    }
                } else {
                    bEnoughChange = false;
                }
            }
            arrReceipt.add(strChange);
        } else {
            bEnoughChange = false;
        }

        if (!bEnoughChange) {
            strChange = " Not enough money to produce change." + 
                        "\n" + " Please insert the exact amount to continue the transaction.";
            arrReceipt.add(strChange);
            return bIsSuccess;
        } else {
            CVendingMachine.setDenomination(CTempDenom);
            CPaymentSlot.addDenomination(CTempPayment);
            bIsSuccess = true;
            return bIsSuccess;
        }

    }

    /**
     * Remits the payment to the user by displaying the quantity of each denomination inserted.
     * 
     * @param CTempPayment the payment of the user
     */
    public void returnPayment(Denominations CTempPayment, ArrayList<String> arrReceipt) {
        int nPayment;
        String strPayment = "";

        nPayment = CTempPayment.get1Coins();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get1Coins() + " 1 Peso Coin(s)" + "\n";
        }

        nPayment = CTempPayment.get5Coins();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get5Coins() + " 5 Peso Coin(s)" + "\n";
        }

        nPayment = CTempPayment.get10Coins();
        if (nPayment > 0) {
            strPayment = "  " + CTempPayment.get10Coins() + " 10 Peso Coin(s)" + "\n";
        }

        nPayment = CTempPayment.get20Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get20Bills() + " 20 Peso Bill(s)" + "\n";
        }

        nPayment = CTempPayment.get50Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get50Bills() + " 50 Peso Bill(s)" + "\n";
        }

        nPayment = CTempPayment.get100Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get100Bills() + " 100 Peso Bill(s)" + "\n";
        }

        nPayment = CTempPayment.get200Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get200Bills() + " 200 Peso Bill(s)" + "\n";
        }

        nPayment = CTempPayment.get500Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get500Bills() + " 500 Peso Bill(s)" + "\n";
        }

        nPayment = CTempPayment.get1000Bills();
        if (nPayment > 0) {
            strPayment += "  " + CTempPayment.get1000Bills() + " 100 Peso Bill(s)" + "\n";
        }

        arrReceipt.add(strPayment);
    }

     /**
     * Assigns the total amount for the transaction.
     * 
     * @param fTotalAmount the total amount for the transaction
     */
    public void setTotalAmount(float fTotalAmount) {
        this.fTotalAmount = fTotalAmount;
    }

    /**
     * Calculates and returns the total price of the items in the cart.
     * 
     * @param arrCart the ArrayList of items in the cart
     * @return the total price of items in the cart
     */
    public float getProductPrice(ArrayList<Item> arrCart) {
        float fTotalAmount = 0;

        for (Item CItem : arrCart) {
            fTotalAmount += CItem.getPrice();
        }

        return fTotalAmount;
    }
    

}

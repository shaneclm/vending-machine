package com.denominations;

public class Denominations {
    
    private int n1Coin;
    private int n5Coin;
    private int n10Coin;

    private int n20Bill;
    private int n50Bill;
    private int n100Bill;
    private int n200Bill;
    private int n500Bill;
    private int n1000Bill;

    public Denominations() {
        this.n1Coin  = 0;
        this.n5Coin  = 0;
        this.n10Coin = 0;
        
        this.n20Bill   = 0;
        this.n50Bill   = 0;
        this.n100Bill  = 0;
        this.n200Bill  = 0;
        this.n500Bill  = 0;
        this.n1000Bill = 0;
    }

    public void set1Coins(int n1Coin) {
        this.n1Coin = n1Coin;
    }
    
    public int get1Coins() {
        return this.n1Coin;
    }

    public void set5Coins(int n5Coin) {
        this.n5Coin = n5Coin;
    }

    public int get5Coins() {
        return this.n5Coin;
    }

    public void set10Coins(int n10Coin) {
        this.n10Coin = n10Coin;
    }

    public int get10Coins() {
        return this.n10Coin;
    }

    public void set20Bills(int n20Bill) {
        this.n20Bill = n20Bill;
    }

    public int get20Bills() {
        return this.n20Bill;
    }

    public void set50Bills(int n50Bill) {
        this.n50Bill = n50Bill;
    }

    public int get50Bills() {
        return this.n50Bill;
    }

    public void set100Bills(int n100Bill) {
        this.n100Bill = n100Bill;
    }

    public int get100Bills() {
        return this.n100Bill;
    }

    public void set200Bills(int n200Bill) {
        this.n200Bill = n200Bill;
    }

    public int get200Bills() {
        return this.n200Bill;
    }

    public void set500Bills(int n500Bill) {
        this.n500Bill = n500Bill;
    }

    public int get500Bills() {
        return this.n500Bill;
    }

    public void set1000Bills(int n1000Bill) {
        this.n1000Bill = n1000Bill;
    }

    public int get1000Bills() {
        return this.n1000Bill;
    }

    public void addDenomination(Denominations CTempPayment) {
        this.n1Coin  += CTempPayment.get1Coins();
        this.n5Coin  += CTempPayment.get5Coins();
        this.n10Coin += CTempPayment.get10Coins();
        
        this.n20Bill   += CTempPayment.get20Bills();
        this.n50Bill   += CTempPayment.get50Bills();
        this.n100Bill  += CTempPayment.get100Bills();
        this.n200Bill  += CTempPayment.get200Bills();
        this.n500Bill  += CTempPayment.get500Bills();
        this.n1000Bill += CTempPayment.get1000Bills();
    }

    public float getTotalAmount() {
        float fTotal = (n1Coin * 1) + (n5Coin * 5) + (n10Coin * 10) + (n20Bill * 20) + (n50Bill * 50)
                     + (n100Bill * 100) + (n200Bill * 200) + (n500Bill * 500) + (n1000Bill * 1000);
        return fTotal;
    }

    public void resetDenominations() {
        this.n1Coin  = 0;
        this.n5Coin  = 0;
        this.n10Coin = 0;
        
        this.n20Bill   = 0;
        this.n50Bill   = 0;
        this.n100Bill  = 0;
        this.n200Bill  = 0;
        this.n500Bill  = 0;
        this.n1000Bill = 0;
    }
}

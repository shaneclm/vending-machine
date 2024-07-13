package com.models.denominations;

/**
    the class represents the set of denominations found in the vending machine
 */
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

    /**
        creates an instance and initializes all denominations to 0
        <p>
        Postcondition: A new instance of Denominations is created with all denomination quantities set to 0. 
    */
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

    /** 
        adjoins the denominations from another denominations instance
        
        <p>
        Precondition : CTempPayment is a valid instance of Denominations containing non-negative quantities of denominations.
        <p>
        Postcondition: The denominations of the current instance are increased by the corresponding denominations from CTempPayment.
       
        @param CTempPayment the denominations instance that will be added
     */
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

    /** 
        calculates the total amount of all denominations
 
        <p>
        Precondition : The denominations contains non-negative quantities.
        <p>
        Postcondition: It returns the computed total amount (fTotal) of all denominations.
       
        @return    the total amount computed of all denominations
     */
    public float calculateTotalAmount() {
        float fTotal = (n1Coin * 1) + (n5Coin * 5) + (n10Coin * 10) + (n20Bill * 20) + (n50Bill * 50)
                     + (n100Bill * 100) + (n200Bill * 200) + (n500Bill * 500) + (n1000Bill * 1000);
        return fTotal;
    }

    /** 
        initializes all the denominations to 0
        <p>
        Postcondition: All the denominations  are set to 0.
        
     */
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

    /** 
        assigns the quantity of 1 coin denomination

        <p>
        Postcondition: n1Coin variable is updated with the provided quantity.

        @param n1Coin  the quantity of 1 coin denomination      
     */
    public void set1Coins(int n1Coin) {
        this.n1Coin = n1Coin;
    }
    
    /** 
        obtains the quantity of 1 coin denomination

        <p>
        Postcondition: Returns the current quantity value of n1Coin variable.
       
        @return    the quantity of 1 coin denomination  
     */
    public int get1Coins() {
        return this.n1Coin;
    }

    /** 
        assigns the quantity of 5 coin denomination

        <p>
        Postcondition: n5Coin variable is updated with the provided quantity.

        @param n5Coin  the quantity of 5 coin denomination      
     */
    public void set5Coins(int n5Coin) {
        this.n5Coin = n5Coin;
    }

    /** 
        obtains the quantity of 5 coin denomination

        <p>
        Postcondition: Returns the current quantity value of n5Coin variable.

        @return    the quantity of 5 coin denomination  
     */
    public int get5Coins() {
        return this.n5Coin;
    }

    /** 
        assigns the quantity of 10 coin denomination

        <p>
        Postcondition: n10Coin variable is updated with the provided quantity.

        @param n10Coin  the quantity of 10 coin denomination      
     */
    public void set10Coins(int n10Coin) {
        this.n10Coin = n10Coin;
    }

    /** 
        obtains the quantity of 10 coin denomination

        <p>
        Postcondition: Returns the current quantity value of n10Coin variable.
       
        @return    the quantity of 10 coin denomination  
     */
    public int get10Coins() {
        return this.n10Coin;
    }

    /** 
        assigns the quantity of 20 coin denomination

        <p>
        Postcondition: n20Bill variable is updated with the provided quantity.

        @param n20Bill  the quantity of 20 coin denomination      
     */   
    public void set20Bills(int n20Bill) {
        this.n20Bill = n20Bill;
    }

    /** 
        obtains the quantity of 20 coin denomination

        <p>
        Postcondition: Returns the current quantity value of n20Bill variable.
       
        @return    the quantity of 20 coin denomination  
     */
    public int get20Bills() {
        return this.n20Bill;
    }

    /** 
        assigns the quantity of 50 bill denomination

        <p>
        Postcondition: n50Bill variable is updated with the provided quantity.

        @param n50Bill  the quantity of 50 bill denomination      
     */   
    public void set50Bills(int n50Bill) {
        this.n50Bill = n50Bill;
    }

    /** 
        obtains the quantity of 50 bill denomination

        <p>
        Postcondition: Returns the current quantity value of n50Bill variable.
       
        @return    the quantity of 50 bill denomination  
     */
    public int get50Bills() {
        return this.n50Bill;
    }

    /** 
        assigns the quantity of 100 bill denomination

        <p>
        Postcondition: n100Bill variable is updated with the provided quantity.

        @param n100Bill  the quantity of 100 bill denomination      
     */   
    public void set100Bills(int n100Bill) {
        this.n100Bill = n100Bill;
    }

    /** 
        obtains the quantity of 100 bill denomination

        <p>
        Postcondition: Returns the current quantity value of n100Bill variable.
       
        @return    the quantity of 100 bill denomination  
     */
    public int get100Bills() {
        return this.n100Bill;
    }

    /** 
        assigns the quantity of 200 bill denomination

        <p>
        Postcondition: n200Bill variable is updated with the provided quantity.

        @param n200Bill  the quantity of 200 bill denomination      
     */   
    public void set200Bills(int n200Bill) {
        this.n200Bill = n200Bill;
    }

    /** 
        obtains the quantity of 200 bill denomination

        <p>
        Postcondition: Returns the current quantity value of n200Bill variable.
       
        @return    the quantity of 200 bill denomination  
     */
    public int get200Bills() {
        return this.n200Bill;
    }

    /** 
        assigns the quantity of 500 bill denomination

        <p>
        Postcondition: n500Bill variable is updated with the provided quantity.

        @param n500Bill  the quantity of 500 bill denomination      
     */   
    public void set500Bills(int n500Bill) {
        this.n500Bill = n500Bill;
    }

    /** 
        obtains the quantity of 500 bill denomination

        <p>
        Postcondition: Returns the current quantity value of n500Bill variable.
       
        @return    the quantity of 500 bill denomination  
     */
    public int get500Bills() {
        return this.n500Bill;
    }

    /** 
        assigns the quantity of 1000 bill denomination

        <p>
        Postcondition: n1000Bill variable is updated with the provided quantity.

        @param n1000Bill  the quantity of 1000 bill denomination      
     */   
    public void set1000Bills(int n1000Bill) {
        this.n1000Bill = n1000Bill;
    }

    /** 
        obtains the quantity of 1000 bill denomination
        
        <p>
        Postcondition: Returns the current quantity value of n1000Bill variable.
       
        @return    the quantity of 1000 bill denomination  
     */
    public int get1000Bills() {
        return this.n1000Bill;
    }

}

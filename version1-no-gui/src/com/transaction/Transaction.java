package com.transaction;

import java.util.ArrayList;
import com.items.Item;
import com.vendingMachine.RVendingMachine;

public class Transaction {
    private ArrayList<Item> CItem;
    private float fTotalPayment;

    public Transaction(RVendingMachine vendingMachine) {
        this.CItem = new ArrayList<Item>();
        this.fTotalPayment = 0;
    }

    public void addItem(Item item) {
        CItem.add(item);
    }

    public void removeItem(Item item) {
        CItem.remove(item);
    }

    public void calculateTotalSales() {
        fTotalPayment = 0;
        for (Item item : CItem) {
            fTotalPayment += item.getPrice();
        }
    }

    public void resetTransaction() {
        CItem.clear();
        fTotalPayment = 0;
    }

    public float getTotalPayment() {
        return fTotalPayment;
    }

    public ArrayList<Item> getItemList() {
        return CItem;
    }
}

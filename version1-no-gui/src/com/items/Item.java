package com.items;

import java.util.HashMap;

public class Item {
    private String strSlot;
    private String strName;
    private String strCateg;
    private int    nQuantity;
    private float  fPrice;
    private float  fCalories;

    public Item(String strName, String strCateg, int nQuantity, float fPrice, float fCalories, HashMap<String, Integer> categoryMap) {
        this.strName = strName;
        this.strCateg = strCateg;
        this.nQuantity = nQuantity;
        this.fPrice = fPrice;
        this.fCalories = fCalories;
        setSlot(categoryMap);
    }

    public Item(String strName, int nQuantity, float fPrice) {
        this.strName = strName;
        this.nQuantity = nQuantity;
        this.fPrice = fPrice;
    }

    public String getSlot() {
        return this.strSlot;
    }

    public void setSlot(HashMap<String, Integer> categoryMap) {
        String strTemp = this.strCateg.toLowerCase();

        if (categoryMap.containsKey(strTemp)) {
            int nCount = categoryMap.get(strTemp) + 1;

            // update the count map with the new count
            categoryMap.put(strTemp, nCount);
        } else {
            categoryMap.put(strTemp, 1);
        }

        // assign fixed slots for each category
        switch (strTemp) {
            case "viand":
                this.strSlot = "A" + categoryMap.get(strTemp);
                break;
            case "rice":
                this.strSlot = "B" + categoryMap.get(strTemp);
                break;
            case "beverage":
                this.strSlot = "C" + categoryMap.get(strTemp);
                break;
            default:
                this.strSlot = "N/A";
                break;
        }
    }


    public String getName() {
        return this.strName;
    }

    public void setName(String strName) {
        this.strName = strName;
    }

    public String getCategory() {
        return this.strCateg;
    }

    public void setCategory(String strCateg) {
        this.strCateg = strCateg;
    }

    public int getQuantity() {
        return this.nQuantity;
    }

    public void setQuantity(int nQuantity) {
        this.nQuantity = nQuantity;
    }

    public float getPrice() {
        return this.fPrice;
    }

    public void setPrice(float fPrice) {
        this.fPrice = fPrice;
    }

    public float getCalories() {
        return this.fCalories;
    }

    public void setCalories(float fCalories) {
        this.fCalories = fCalories;
    }
}

package com.models.items;

import java.util.HashMap;

/**
 * the class represents an item with its attributes such as name, category,
 * quantity, price, and calories
 */
public class Item {
    private String strSlot;
    private String strName;
    private String strCateg;
    private int nNumInstances;
    private float fPrice;
    private float fCalories;

    /**
     * constructs a new Item object with the specified name, category, quantity,
     * price, and calories
     * 
     * <p>
     * Postcondition: A new instance of Item is created with all fields initialized.
     * 
     * @param strName     the name of the ite
     * @param strCateg    the category of the item
     * @param nQuantity   the quantity of the item
     * @param fPrice      the price of the item
     * @param fCalories   the amount of calories of the item
     * @param categoryMap the category map containing the number of items in each
     *                    category
     */
    public Item(String strName, String strCateg, int nNumInstances, float fPrice, float fCalories,
            HashMap<String, Integer> categoryMap, HashMap<String, String> commonItemSlots) {
        this.strName = strName;
        this.strCateg = strCateg.toLowerCase();
        this.nNumInstances = nNumInstances;
        this.fPrice = fPrice;
        this.fCalories = fCalories;

        generateSlot(categoryMap, commonItemSlots);

    }

    public Item(String strName, String strSlot, float fPrice, float fCalories) {
        this.strName = strName;
        this.strSlot = strSlot;
        this.fPrice = fPrice;
        this.fCalories = fCalories;
    }

    /**
     * constructs a new Item object with the specified name, quantity, and price
     * 
     * <p>
     * Postcondition: A new instance of Item is created with strName, nQuantity, and
     * fPrice initialized.
     * 
     * @param strName   the name of the ite
     * @param nQuantity the quantity of the item
     * @param fPrice    the price of the item
     */
    public Item(String strName, int nNumInstances, float fPrice) {
        this.strName = strName;
        this.nNumInstances = nNumInstances;
        this.fPrice = fPrice;
    }

    /**
     * assigns the slot of the item based on its category
     * 
     * <p>
     * Precondition : categoryMap is initialized.
     * <p>
     * Postcondition: The categoryMap is updated with the count of items in the
     * corresponding category,
     * and the strSlot instance variable of the Item object is assigned a slot
     * value.
     * 
     * @param categoryMap the category map containing the number of items in each
     *                    category
     */
    public String generateSlot(HashMap<String, Integer> categoryMap, HashMap<String, String> commonItemSlots) {
        if (commonItemSlots.containsKey(strName)) {
            this.strSlot = commonItemSlots.get(strName);
        } else {
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

                case "egg":
                    this.strSlot = "D" + categoryMap.get(strTemp);
                    break;

                case "side":
                    this.strSlot = "E" + categoryMap.get(strTemp);
                    break;

                case "condiment":
                    this.strSlot = "F" + categoryMap.get(strTemp);
                    break;

                default:
                    this.strSlot = "N/A";
                    break;
            }

            // Store the slot in the commonItemSlots map for future instances of the same
            // name
            commonItemSlots.put(strName, this.strSlot);
        }

        return this.strSlot;
    }

    /**
     * obtains the slot of the item
     * 
     * <p>
     * Postcondition: Returns the slot number of the item.
     * 
     * @return slot of the item
     */
    public String getSlot() {
        return this.strSlot;
    }

    public String getCategory() {
        return this.strCateg;
    }

    /**
     * obtains the name of the item
     * 
     * <p>
     * Postcondition: Returns the name of the item.
     * 
     * @return name of the item
     */
    public String getName() {
        return this.strName;
    }


    public void setNumInstance(int nNumInstances) {
        this.nNumInstances = nNumInstances;
    }


    /**
     * obtains the quantity of the item
     * 
     * <p>
     * Postcondition: Returns the current quantity of the item.
     * 
     * @return quantity of the item
     */
    public int getNumInstances() {
        return this.nNumInstances;
    }

    /**
     * obtains the price of the item
     * 
     * <p>
     * Postcondition: Returns the price of the item.
     * 
     * @return price of the item
     */
    public float getPrice() {
        return this.fPrice;
    }

    /**
     * obtains the amount of calories of the item
     * 
     * <p>
     * Postcondition: Returns the number of calories of the item.
     * 
     * @return amount of calories of the item
     */
    public float getCalories() {
        return this.fCalories;
    }

}

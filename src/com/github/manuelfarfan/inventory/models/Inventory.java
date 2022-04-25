package com.github.manuelfarfan.inventory.models;

import java.util.Date;
import java.util.HashMap;

public class Inventory {
   private HashMap<Product,Double> products = new HashMap<>();
   private int amount;
   private Date date;

    public HashMap<Product, Double> getProduct() {
        return products;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Methods
    public void addProduct (Product product,Double amount) {
        Double currentAmount = 0.0;
        if (products.containsKey(product)) {
            currentAmount = products.get(product);
        }
        products.put(product,amount+ currentAmount);


    }

}

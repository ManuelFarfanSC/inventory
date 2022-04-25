package com.github.manuelfarfan.inventory.models;

public class Product {
   private String name;
   private int amountWarehouseDateCurrent;
   private int amountEnter;
   private int amountTotal;
   private int expirationDate;
   private int invoiceNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountWarehouseDateCurrent() {
        return amountWarehouseDateCurrent;
    }

    public void setAmountWarehouseDateCurrent(int amountWarehouseDateCurrent) {
        this.amountWarehouseDateCurrent = amountWarehouseDateCurrent;
    }

    public int getAmountEnter() {
        return amountEnter;
    }

    public void setAmountEnter(int amountEnter) {
        this.amountEnter = amountEnter;
    }

    public int getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(int amountTotal) {
        this.amountTotal = amountTotal;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
}
// Methods

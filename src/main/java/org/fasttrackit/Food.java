package org.fasttrackit;

// Aici am importat libraria java.util.date; pentru a reprezenta timpul.
// Totodata avem si un constructor care ne obliga sa avem neaparat unele variabile in momentul in care creem
// o noua instanta a obiectului Food. Spre exemplu, nu putem avea un nou tip de mancare fara sa ii dam nume.

import java.util.Date;

public class Food {

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;
    private double quantity;
    private Date expiryDate;
    private boolean inStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}


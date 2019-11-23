package org.fasttrackit;

import java.util.Date;

public class Food {
    public Food(String name) {
        this.name = name;
    }
    String name;
    short price;
    double quantity;
    Date expiryDate;
    boolean inStock;
}

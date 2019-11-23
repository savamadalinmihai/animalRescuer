package org.fasttrackit;

// Aici am importat libraria java.util.date; pentru a reprezenta timpul.
// Totodata avem si un constructor care ne obliga sa avem neaparat unele variabile in momentul in care creem
// o noua instanta a obiectului Food. Spre exemplu, nu putem avea un nou tip de mancare fara sa ii dam nume.

import java.util.Date;

public class Food {
    public Food() {
        this.name = name;
    }
    String name;
    short price;
    double quantity;
    Date expiryDate;
    boolean inStock;
}

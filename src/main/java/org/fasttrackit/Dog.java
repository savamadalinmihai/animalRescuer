package org.fasttrackit;

// Aici sunt caracteristicile pe care dog le are specific, pe langa ce mosteneste din Animal.

public class Dog extends Animal {

    String dogBreed;
    boolean bites;
    boolean needsAWalk;


    public Dog(String name, boolean hasAnOwner) {
        super(name, hasAnOwner);
    }
}

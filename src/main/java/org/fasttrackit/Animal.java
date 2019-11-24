package org.fasttrackit;

// Aici avem caracteristicile/variabilele clasei parinte Animal, care se vor aplica tuturor subclaselor.

public class Animal {

    public Animal(String name, boolean hasAnOwner) {
        this.name = name;
        this.hasAnOwner = hasAnOwner;

    }

    String name;
    byte age;
    double healthLevel;
    double hungerLevel;
    double energyLevel;
    double happinessLevel;
    boolean hasAnOwner;
    String favoriteFood;
    String favoriteActivity;

}

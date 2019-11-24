package org.fasttrackit;

// Aici avem activitatile pe care le putem face cu animalele si cum afecteaza ele animalul.

public class Activities {

    public Activities(String name, double happinessIncrease, double energySpent) {
        this.name = name;
        this.happinessIncrease = happinessIncrease;
        this.energySpent = energySpent;

    }

    String name;
    double happinessIncrease;
    double energySpent;
    int timeInMinutes;
    int costInDollars;
    String dollarSign;



}

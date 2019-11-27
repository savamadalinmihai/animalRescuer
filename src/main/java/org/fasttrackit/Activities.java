package org.fasttrackit;

// Aici avem activitatile pe care le putem face cu animalele si cum afecteaza ele animalul.

public class Activities {

    public Activities(String name, double happinessIncrease, double energySpent) {
        this.name = name;
        this.happinessIncrease = happinessIncrease;
        this.energySpent = energySpent;

    }

    private String name;
    private double happinessIncrease;
    private double energySpent;
    private int timeInMinutes;
    private int costInDollars;
    private String dollarSign;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHappinessIncrease() {
        return happinessIncrease;
    }

    public void setHappinessIncrease(double happinessIncrease) {
        this.happinessIncrease = happinessIncrease;
    }

    public double getEnergySpent() {
        return energySpent;
    }

    public void setEnergySpent(double energySpent) {
        this.energySpent = energySpent;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public int getCostInDollars() {
        return costInDollars;
    }

    public void setCostInDollars(int costInDollars) {
        this.costInDollars = costInDollars;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }
}

package org.fasttrackit;

// Aici avem activitatile pe care le putem face cu animalele si cum afecteaza ele animalul.

public class Activities {

    private String name;
    private double happinessIncrease;
    private double energySpent;
    private int timeInMinutes;
    private int costInDollars;
    private String dollarSign;

    public Activities(String name, double happinessIncrease, double energySpent) {
        this.name = name;
        this.happinessIncrease = happinessIncrease;
        this.energySpent = energySpent;

    }

    Animal animal;

    public Activities() {

    }

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

    public void playWithAnimal (Rescuer rescuer01, Animal animal, Activities Activity01){
        System.out.println("Playing " + Activity01.getName() + " with " + animal.getName());

        if (Activity01.getName().equals(animal.getFavoriteActivity())) {

            animal.setHappinessLevel(animal.getHappinessLevel() + 2);
            animal.setEnergyLevel(animal.getEnergyLevel() + 2);
        }else {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            animal.setEnergyLevel(animal.getEnergyLevel() + 1);
        }

        System.out.println("The new energy level of the " + animal.getName() + " is: " + animal.getEnergyLevel() +
                " and the new happiness level is: " +animal.getHappinessLevel());
    }
}

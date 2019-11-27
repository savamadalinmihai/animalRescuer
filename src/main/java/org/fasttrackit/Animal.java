package org.fasttrackit;

// Aici avem caracteristicile/variabilele clasei parinte Animal, care se vor aplica tuturor subclaselor.

public class Animal {

    public Animal(String name, boolean hasAnOwner) {
        this.name = name;
        this.hasAnOwner = hasAnOwner;

    }

    private String name;
    private int age;
    private double healthLevel;
    private double hungerLevel;
    private double energyLevel;
    private double happinessLevel;
    private boolean hasAnOwner;
    private String favoriteFood;
    private String favoriteActivity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    public double getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(double happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public boolean isHasAnOwner() {
        return hasAnOwner;
    }

    public void setHasAnOwner(boolean hasAnOwner) {
        this.hasAnOwner = hasAnOwner;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
}

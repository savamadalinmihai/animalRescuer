package org.fasttrackit;

// Aici avem caracteristicile adoptatorului.

public class Adopter {

    public Adopter(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private String name;
    private int age;
    private int gender;
    private String occupation;
    private String allergicTo;
    private double moneyAvailable;
    private String dollarSign;

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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAllergicTo() {
        return allergicTo;
    }

    public void setAllergicTo(String allergicTo) {
        this.allergicTo = allergicTo;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }
}

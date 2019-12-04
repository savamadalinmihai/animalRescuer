package org.fasttrackit;

// Aici avem caracteristicile adoptatorului.

public class Rescuer {

    public Rescuer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Rescuer() {

    }

    private String name;
    private int age;
    private String gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

//    This method allows you to feed the animal, which decreases its hunger level
//    and in turn it also decreases the food quantity.

    public void feedAnimal(Animal animal, Food food) {
        System.out.println(this.getName() + " just gave " + animal.getName() + " some " + food.getName());

        animal.setHungerLevel(animal.getHungerLevel() - 1);

        System.out.println("The new hunger level of the animal is: " + animal.getHungerLevel());


        if (food.getName().equals(animal.getFavoriteFood())) {

            animal.setHungerLevel(animal.getHungerLevel() - 2);
        } else {
            animal.setHungerLevel(animal.getHungerLevel() - 1);

        }

        System.out.println(this.getName() + "just fed " + animal.getName() + " with " + food.getName());
    }
}




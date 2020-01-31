package org.fasttrackit;

import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        Activities Activity01 = new Activities("Fetch", 15, 3);
        Activity01.setEnergySpent(1);

        Activities activities1 = new Activities("Sleeping", 10, -4);

        Animal Animal01 = new Cat("Standard Animal", false);
        Animal01.setAge(3);
        Animal01.setFavoriteActivity("Sleeping");
        Animal01.setFavoriteFood("Whiskas");
        Animal01.setHappinessLevel(10);
        Animal01.setHungerLevel(10.0);
        Animal01.setHealthLevel(9.5);

        Animal Animal02 = new Dog("dog", false);
        Animal02.setAge(4);
        Animal02.setFavoriteActivity("Fetch");
        Animal02.setFavoriteFood("Purina");
        Animal02.setHappinessLevel(55);
        Animal02.setHungerLevel(12);
        Animal02.setHealthLevel(8);

        Rescuer rescuer01 = new Rescuer("Simina", 5);
        rescuer01.setMoneyAvailable(325);
        rescuer01.setDollarSign("$");


        Food Food01 = new Food("Whiskas", 125);
        Food01.setExpiryDate(new Date(2020, 12, 12));
        Food01.setInStock(true);
        Food01.setPrice(25);
        Food01.setQuantity(250);


        Veterinarian Vet01 = new Veterinarian();
        Vet01.setName("Madalin");
        Vet01.setSpecialisation("Dogs");

        System.out.println(rescuer01.getName() + " has "
                + rescuer01.getMoneyAvailable() + rescuer01.getDollarSign() + " left.");


        rescuer01.feedAnimal(rescuer01, Animal01, Food01);

        System.out.println(rescuer01.getName() + " has " + rescuer01.getMoneyAvailable() +
                rescuer01.getDollarSign() + " left.");

        System.out.println();

        rescuer01.playWithAnimal(Animal01, activities1);

        System.out.println();

        Animal01.showHappiness(Animal01);

        System.out.println();

        Animal cat = new Cat("Baast", false);
        cat.showHappiness(cat);

        System.out.println();

        Animal dog = new Dog("Lulu", false);
        dog.showHappiness(dog);


    }

}

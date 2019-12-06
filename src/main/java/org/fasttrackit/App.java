package org.fasttrackit;

// Aici am importat 2 librarii Java pentru a putea reprezenta timpul.

import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        Activities Activity01 = new Activities("Fetch", 15, 3);
        Activity01.setHappinessIncrease(2.5);

        Animal Animal01 = new Animal("cat", false);
        Animal01.setAge(3);
        Animal01.setFavoriteActivity("Meowing");
        Animal01.setFavoriteFood("Whiskas");
        Animal01.setHappinessLevel(10);
        Animal01.setHungerLevel(10.0);
        Animal01.setHealthLevel(9.5);

        Rescuer rescuer01 = new Rescuer("Simina", 5);
        rescuer01.setMoneyAvailable(325);
        rescuer01.setDollarSign("$");

        Food Food01 = new Food("Whiskas", 125);
        Food01.setExpiryDate(new Date(2020, 12, 12));
        Food01.setInStock(true);
        Food01.setPrice(25);
        Food01.setQuantity(2.5);


        Veterinarian Vet01 = new Veterinarian();
        Vet01.setName("Madalin");
        Vet01.setSpecialisation("Dogs");

        System.out.println(rescuer01.getName() + " has "
                + rescuer01.getMoneyAvailable() + rescuer01.getDollarSign() + " left.");

        Rescuer rescuer = new Rescuer();
        rescuer.feedAnimal(rescuer01, Animal01, Food01);

    }

}

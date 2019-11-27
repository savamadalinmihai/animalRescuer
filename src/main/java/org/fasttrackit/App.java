package org.fasttrackit;

// Aici am importat 2 librarii Java pentru a putea reprezenta timpul.

import java.time.Instant;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        Activities Activity01 = new Activities("Fetch", 15, 3);
        Activity01.setHappinessIncrease(2.5);

        Animal Animal01 = new Animal("cat", false);
        Animal01.setAge(3);
        Animal01.setFavoriteActivity("Meowing.");
        Animal01.setFavoriteFood("Wet food.");
        Animal01.setHappinessLevel(10);
        Animal01.setHungerLevel(4);
        Animal01.setHealthLevel(9.5);

        Adopter Adopter01 = new Adopter("Simina", 5);
        Adopter01.setName("Simina");
        Adopter01.setMoneyAvailable(325);
        Adopter01.setDollarSign("$");

        Food Food01 = new Food("Whiskas", 125);
        Food01.setExpiryDate(new Date(2020, 12, 12));
        Food01.setInStock(true);
        Food01.setPrice(25);
        Food01.setQuantity(2.5);

//        Game Game01 = new Game();
//        Game01.adopter = "Simina";
//        Game01.animal = "dog";
//        Game01.veterinarian = "Madalin";

        Veterinarian Vet01 = new Veterinarian();
        Vet01.setName("Madalin");
        Vet01.setSpecialisation("Dogs");

        System.out.println(Adopter01.getName() + " has "
                + Adopter01.getMoneyAvailable() + Adopter01.getDollarSign() + " left.");

    }

}

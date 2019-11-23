package org.fasttrackit;

// Aici am importat 2 librarii Java pentru a putea reprezenta timpul.

import java.time.Instant;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {

        Activities Activity01 = new Activities();
        Activity01.name = "Fetch";
        Activity01.happinessIncrease = 2.5;

        Animal Animal01 = new Animal();
        Animal01.name = "Cat";
        Animal01.age = 3;
        Animal01.favoriteActivity = "Meowing.";
        Animal01.favoriteFood = "Wet food.";
        Animal01.happinessLevel = 10;
        Animal01.hungerLevel = 4;
        Animal01.healthLevel = 9.5;

        Adopter Adopter01 = new Adopter();
        Adopter01.name = "Simina";
        Adopter01.moneyAvailable = 325;
        Adopter01.dollarSign = "$";

        Food Food01 = new Food();
        Food01.name = "Whiskas";
        Food01.expiryDate = new Date(2019, 11, 11);
        Food01.inStock = true;
        Food01.price = 25;
        Food01.quantity = 2.5;

//        Game Game01 = new Game();
//        Game01.adopter = "Simina";
//        Game01.animal = "dog";
//        Game01.veterinarian = "Madalin";

        Veterinarian Vet01 = new Veterinarian();
        Vet01.name = "Madalin";
        Vet01.specialisation = "dogs";

        System.out.println(Adopter01.name + " has " + Adopter01.moneyAvailable + Adopter01.dollarSign + " left.");

    }

}

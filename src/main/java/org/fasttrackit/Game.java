package org.fasttrackit;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private String name;
    private int durationInMinutes;
    private boolean toysRequired;
    private List<Food> availableFood = new ArrayList<>();
    private Activities[] availableActivities = new Activities[8];

    Rescuer rescuer;
    Dog dog;
    Veterinarian veterinarian;


    public Game(String name, int durationInMinutes, boolean toysRequired) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.toysRequired = toysRequired;
    }

    public Game() {

    }

    private void initAnimal(){
        Animal animal = new Dog("Bonnie", false);
        dog.setBites(false);
        dog.setNeedsAWalk(true);
    }

    private void initRescuer(){
        System.out.println("Please enter the name of your rescuer character:");

        Scanner scanner = new Scanner(System.in);
        String rescuerName = scanner.nextLine();

        if (rescuerName.isEmpty()){
        System.out.println("You entered nothing. Try again.");
        initRescuer();
        }

        Rescuer rescuer = new Rescuer();
        rescuer.setName(rescuerName);
    }

    private void nameAnimal(){
        
    }

    private void initFood() {
        // this method initialises the Food ArrayList.
        int numberOfFoods = getNumberOfFoods();
        System.out.println("The number of foods added will be " + numberOfFoods);

        for (int i = 1; i <= numberOfFoods; i++) {
            System.out.println("Adding food number " + i + ".");

            Food food = new Food();
            food.setName(getFoodNameFromUser());
            food.setPrice(ThreadLocalRandom.current().nextInt(8, 25));
            food.setQuantity(ThreadLocalRandom.current().nextInt(15, 100));

            System.out.println("Food number " + i + " was added. The name is: " + food.getName() +
                    " quantity is " + food.getQuantity() + " kg and  the price is " + food.getPrice() + "$/kg.");

            availableFood.add(food);
        }
    }

    public void initActivities() {
        // this method initialises the Activities array.
        int numberOfActivities = getNumberOfActivities();
        int i = 0;
        System.out.println("You said you wanted to create " + numberOfActivities + " activities");
        System.out.println("");
        for (int z = i; z <= (numberOfActivities - 1); z++) {

            System.out.println("Creating activity " + (z + 1) + ":");

            Activities activities = new Activities();
            activities.setName(getActivityNameFromUser());
            activities.setHappinessIncrease(getHappinessIncrease());
            availableActivities[z] = activities;

            System.out.println("Activity " + z + " was created. It's called " + activities.getName()
                    + ", and has a happiness increase of " + activities.getHappinessIncrease() + ".");
        }
    }

    private void showAllActivities() {
        // this method will show all available activities at the beginning of the game.
        System.out.println("The list of all available activities is: ");
        try {
            for (int i = 0; i < availableActivities.length; i++) {
                System.out.println(availableActivities[i].getName());
            }
        } catch (NullPointerException n) {
            return;
        }
    }

    private void showAllFoods() {
        // this method prints all the availableFood objects from the availableFood array.
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null)
                System.out.println("Food number " + i + " is " + availableFood.get(i).getName());
        }
    }

    private int getNumberOfFoods() {
        //this method gets the number of foods from the user.
        try {
            System.out.println("How many foods do you want to have?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Numbers, please.");
            return getNumberOfFoods();
        }
    }

    private String getFoodNameFromUser() {
        //this method gets called to get the food name from the user.
        System.out.println("What's the name of the food?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getNumberOfActivities() {
        //this method gets the number of activities the user wants to create.
        try {
            System.out.println("How many activities do you want to create?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You can count activities in numbers only. Please enter a number!");
            return getNumberOfActivities();
        }
    }

    private String getActivityNameFromUser() {
        //this method gets the activity names for the activities created by the user.
        System.out.println("What will be the name of the activity?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getHappinessIncrease() {
        // this method asks the user how much the happiness level should be increased for each method created.
        try {
            System.out.println("How much do you want to increase happiness level by doing this activity?");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a number!");
            return getHappinessIncrease();
        }
    }

    public void start() {
        //this method starts the game.
        Game game = new Game();
        game.initAnimal();
        game.initFood();
        game.initActivities();
        game.showAllFoods();
        game.showAllActivities();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isToysRequired() {
        return toysRequired;
    }

    public void setToysRequired(boolean toysRequired) {
        this.toysRequired = toysRequired;
    }

}

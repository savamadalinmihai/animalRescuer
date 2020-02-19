package org.fasttrackit;

import com.sun.deploy.security.SelectableSecurityManager;
import jdk.internal.util.xml.impl.Input;

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
    Random random = new Random();
    Game game;

    int counter = 0;


    public Game(String name, int durationInMinutes, boolean toysRequired) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.toysRequired = toysRequired;
    }

    public Game() {
    }

    public void startAnotherRound() {
        // this method starts another round and monitors how many rounds have been played.

        System.out.println("You successfully passed this round.");
        System.out.println("Now, keep playing with and feeding the animal, in order to win.");
        System.out.println("");
        System.out.println("Your goal is to keep happiness & energy levels as high as possible and hunger as low" +
                " as possible");
        System.out.println("");
        System.out.println("So far, " + dog.getName() + "'s stats are as follows: ");
        System.out.println("Hunger level: " + dog.getHungerLevel() + "/10.");
        System.out.println("Happiness level: " + dog.getHappinessLevel() + "/10.");
        System.out.println("Energy level: " + dog.getEnergyLevel() + "/10.");
        System.out.println("");
        System.out.println("");
        requireFeeding();
        System.out.println("");
        showAllActivities();
        System.out.println("");
        requirePlaying();

        counter++;
    }

    public void gameLogic() {
        // this method checks animal's health/hunger/happiness levels and
        // if they are within safe levels, allows the user to play another round.
        // in case the user played 3 successful rounds without the animal dying, it ends the game with a win.

        // this condition checks to see if the user has won or not
        if (counter > 3 && dog.getHungerLevel() < 10 && dog.getHappinessLevel() > 0 && dog.getEnergyLevel() > 0) {
            System.out.println("Congratulations. You successfully finished 5 rounds and completed the game!");
            System.out.println("YOU WON!!!");
            return;
        }

        if (dog.getHungerLevel() > 10) {
            System.out.println("Your dog became too hungry and died.");
            System.out.println("");
            System.out.println("GAME OVER");
        } else if (dog.getHappinessLevel() < 0) {
            System.out.println("Your dog became depressed and died");
            System.out.println("");
            System.out.println("GAME OVER");
        } else if (dog.getEnergyLevel() < 0) {
            System.out.println("Your dog became depleted of energy and died");
            System.out.println("");
            System.out.println("GAME OVER");
        }

        // this condition allows for the game to go on for a maximum of three rounds, unless the dog is dead
        if (counter < 10 && dog.getHungerLevel() < 10 && dog.getHappinessLevel() > 0 && dog.getEnergyLevel() > 0) {
            startAnotherRound();
        }
    }

    public void requireFeeding() {
        // this method requires the user to feed the animal.

        try {
            for (int i = 1; i < (availableFood.size() + 1); i++) {
                System.out.println("Food number " + i + " is: " + availableFood.get(i - 1).getName());
            }
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
        }
        System.out.println("");

        System.out.println("Choose the number of the food you want to give your pet.");
        Scanner scanner = new Scanner(System.in);

        try {
            int selectedFood = scanner.nextInt();
            rescuer.feedAnimal(rescuer, dog, availableFood.get(selectedFood - 1));
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
        }
        System.out.println("You can only select from the given numbers.");

    }

    public void requirePlaying() {
        // this method requires the user to play/have an activity with the animal.
        // secondly, this method also allows for animal to be fed in next rounds.
        try {
            for (int i = 1; i < availableActivities.length; i++) {
                System.out.println("Activity " + i + ": " + availableActivities[i - 1].getName());
            }
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
        }
        System.out.println("");

        System.out.println("Choose the number of the activity you want to have with the animal.");
        Scanner scanner = new Scanner(System.in);

        try {
            int selectedActivity = scanner.nextInt();
            rescuer.playWithAnimal(dog, availableActivities[selectedActivity - 1]);
        } catch (IndexOutOfBoundsException | NullPointerException | InputMismatchException e) {
        }
        System.out.println("Choose from the numbers available on screen.");

    }

    private void initAnimal() {
        // this method creates a default animal in the game, that can be rescued.
        String dogName = nameAnimal();

        dog = new Dog(dogName, false);
        dog.setBites(random.nextBoolean());
        dog.setNeedsAWalk(random.nextBoolean());
        dog.setEnergyLevel(5);
        dog.setHappinessLevel(5);
        dog.setHungerLevel(5);
    }

    private void initRescuer() {
        // this method creates a rescuer characters and gives it a name.
        System.out.println("Please enter the name of your rescuer character:");

        Scanner scanner = new Scanner(System.in);
        String rescuerName = scanner.nextLine();

        if (rescuerName.isEmpty()) {
            System.out.println("You entered nothing. Try again.");
            initRescuer();
        }
        rescuer = new Rescuer();
        rescuer.setName(rescuerName);

        System.out.println("Great! Your character's name will be: " + rescuerName);
    }

    private String nameAnimal() {
        // this method names the animal you just rescued.
        System.out.println("Now, please enter the name you want to give to your rescued animal:");

        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();

        if (animalName.isEmpty()) {
            System.out.println("You must give your pet a name.");
            nameAnimal();
        }

        System.out.println("Awesome! Your pet's name will be: " + animalName);
        return animalName;
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

            System.out.println("Activity " + (z + 1) + " was created. It's called " + activities.getName()
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
        System.out.println("The list of all available foods is: ");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null)
                System.out.println("Food number " + (i + 1) + ": " + (availableFood.get(i).getName())
                        + "(" + availableFood.get(i).getPrice() + "$/kg.");
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
        game = new Game();
        System.out.println("Hi! This is the start of the game.");
        System.out.println("");
        System.out.println("We'll begin by creating your rescuer character.");
        System.out.println("");
        game.initRescuer();
        System.out.println("");
        game.initAnimal();
        System.out.println("");
        game.initFood();
        System.out.println("");
        game.initActivities();
        System.out.println("");
        System.out.println("Your pet was just rescued and needs feeding. Choose from below: ");
        System.out.println("");
        game.requireFeeding();
        System.out.println("");
        System.out.println("In order to bond with your pet, you need to do an activity together:");
        System.out.println("The available activities are as follows:");
        System.out.println("");
        game.requirePlaying();
        game.gameLogic();
    }

    public String toString() {
        return String.valueOf(availableFood);
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

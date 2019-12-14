package org.fasttrackit;

public class Game {

    private String name;
    private int durationInMinutes;
    private boolean toysRequired;

    Rescuer rescuer;
    Dog dog;
    Veterinarian veterinarian;


    public Game(String name, int durationInMinutes, boolean toysRequired) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.toysRequired = toysRequired;
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

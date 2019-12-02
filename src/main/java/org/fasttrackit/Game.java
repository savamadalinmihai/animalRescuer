package org.fasttrackit;

public class Game {

    public Game(String name, int durationInMinutes, boolean toysRequired) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.toysRequired = toysRequired;
    }

    Rescuer rescuer1 = new Rescuer();


    private String name;
    private int durationInMinutes;
    private boolean toysRequired;

    public Rescuer getRescuer1() {
        return rescuer1;
    }

    public void setRescuer1(Rescuer rescuer1) {
        this.rescuer1 = rescuer1;
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

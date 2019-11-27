package org.fasttrackit;

public class Game {

    Adopter adopter1 = new Adopter("Radu", 15);

    public Game(String name, int durationInMinutes, boolean toysRequired) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.toysRequired = toysRequired;
    }

    private String name;
    private int durationInMinutes;
    private boolean toysRequired;

    public Adopter getAdopter1() {
        return adopter1;
    }

    public void setAdopter1(Adopter adopter1) {
        this.adopter1 = adopter1;
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

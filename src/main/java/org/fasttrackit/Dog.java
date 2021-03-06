package org.fasttrackit;

// Aici sunt caracteristicile pe care dog le are specific, pe langa ce mosteneste din Animal.

public class Dog extends Animal {

    private String dogBreed;
    private boolean bites;
    private boolean needsAWalk;


    public Dog(String name, boolean hasAnOwner) {
        super(name, hasAnOwner);
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean getBites() {
        return bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }

    public boolean getNeedsAWalk() {
        return needsAWalk;
    }

    public void setNeedsAWalk(boolean needsAWalk) {
        this.needsAWalk = needsAWalk;
    }

    public void showHappiness(Animal animal){
        System.out.println(animal.getName() + " is happy, so it is wagging its tail.");
    }


}

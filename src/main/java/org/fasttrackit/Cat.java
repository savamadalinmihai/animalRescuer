package org.fasttrackit;

public class Cat extends Animal {

    private boolean knocksStuffOver;
    private String something;

    public Cat(String name, boolean hasAnOwner) {
        super(name, hasAnOwner);
    }

    public boolean isKnocksStuffOver() {
        return knocksStuffOver;
    }

    public void setKnocksStuffOver(boolean knocksStuffOver) {
        this.knocksStuffOver = knocksStuffOver;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public void showHappiness(Animal animal){
        System.out.println(animal.getName() + " is happy, so it is purring.");
    }
}

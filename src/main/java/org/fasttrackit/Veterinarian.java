package org.fasttrackit;

// Aici avem de definit inca lucruri.

public class Veterinarian extends MedicalStaff {

    private String somethingIdk;
    private String somethingElse;

    public Veterinarian(String name, String specialisation) {
        super(name, specialisation);
    }

    public Veterinarian() {
        super();
    }

    public String getSomethingIdk() {
        return somethingIdk;
    }

    public void setSomethingIdk(String somethingIdk) {
        this.somethingIdk = somethingIdk;
    }

    public String getSomethingElse(){
        return somethingElse;
    }

    public void setSomethingElse(String somethingElse) {
        this.somethingElse = somethingElse;
    }
}

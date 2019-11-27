package org.fasttrackit;

// Aici avem variabilele clasei MedicalStaff.

public class MedicalStaff {

    public MedicalStaff(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;

    }

    private String name;
    private String specialisation;
    private Boolean isBusy;
    private int costInDollars;
    private int costInMinutes;

    public MedicalStaff() {
            }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public int getCostInDollars() {
        return costInDollars;
    }

    public void setCostInDollars(int costInDollars) {
        this.costInDollars = costInDollars;
    }

    public int getCostInMinutes() {
        return costInMinutes;
    }

    public void setCostInMinutes(int costInMinutes) {
        this.costInMinutes = costInMinutes;
    }
}

package PetsExercise;

import java.util.Objects;

public class Pets {
    private String petName;
    private String owner;
    private int days;

    public Pets (String petName, String owner, int days){
        this.petName = petName;
        this.owner = owner;
        this.days = days;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double calcCost() {
        return days*2;
    }

    @Override
    public String toString(){
        return "Pet Name = " + petName + ", Owners Name = " + owner + ", Days = " + days + ", ";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return days == pets.days &&
                petName.equals(pets.petName) &&
                owner.equals(pets.owner);
    }

}

package PetsExercise;

import java.util.Objects;

public class Hamster extends Pets {
    private String colour;

    public Hamster(String petName, String owner, int days, String colour){
        super(petName, owner, days);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double calcCost() {
        return getDays()*4;
    }

    @Override
    public String toString(){
        return super.toString() + "Colour = " + colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hamster hamster = (Hamster) o;
        return colour.equals(hamster.colour);
    }

}

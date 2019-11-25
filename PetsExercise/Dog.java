package PetsExercise;

import java.util.Objects;

public class Dog extends Pets {
    private String breed;
    private double weight;

    public Dog (String petName, String owner, int days, String breed, double weight) {
        super(petName, owner, days);
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calcCost() {
        return getDays()*8;
    }

    @Override
    public String toString() {
        return super.toString() + "Breed = " + breed + ", Weight = " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.weight, weight) == 0 &&
                breed.equals(dog.breed);
    }

}

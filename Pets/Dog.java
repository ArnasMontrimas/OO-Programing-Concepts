package Pets;

public class Dog extends Pets {
    private double barkVolume;

    public Dog(double weight, double price, String name, String breed, double barkVolume) {
        super(weight, price, name, breed);
        this.barkVolume = barkVolume;
    }

    public double getBarkVolume() {
        return barkVolume;
    }

    public void setBarkVolume(double barkVolume) {
        this.barkVolume = barkVolume;
    }
}

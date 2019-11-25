package Pets;

public class Cat  extends Pets{
    private double purrVolume;

    public Cat(double weight, double price, String name, String breed, double purrVolume) {
        super(weight, price, name, breed);
        this.purrVolume = purrVolume;
    }

    public double getPurrVolume() {
        return purrVolume;
    }

    public void setPurrVolume(double purrVolume) {
        this.purrVolume = purrVolume;
    }
}

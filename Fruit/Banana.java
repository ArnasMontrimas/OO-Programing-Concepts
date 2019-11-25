package Fruit;

public class Banana extends Fruit {
    private double length;

    public Banana(double weight, double length) {
        super(weight);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

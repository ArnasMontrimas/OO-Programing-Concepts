package Pets;

public class Pets {
    private double weight;
    private double price;
    private String name;
    private String breed;

    public Pets(double weight, double price, String name, String breed){
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

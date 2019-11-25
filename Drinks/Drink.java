package Drinks;

public class Drink {
    private String flavour;
    protected double value;

    public Drink(String flavour) {
        this.flavour = flavour;
        this.value = 2;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double calcPrice(){
        return value*1.5;
    }

    @Override
    public String toString(){
        return "Type of Drink = " + getClass().getTypeName().substring(7) + "\nFlavour = " + flavour + "\nValue = " + calcPrice();
    }
}

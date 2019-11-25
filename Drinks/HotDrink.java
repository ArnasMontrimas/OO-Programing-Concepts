package Drinks;

public class HotDrink extends Drink {
    private double temperature;
    private String extras;

    public HotDrink(String flavour, double temperature, String extras){
        super(flavour);
        this.temperature = temperature;
        this.extras = extras;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public double calcPrice() {
        if(getExtras() != null) return value*3;
        else return value*2;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTemperature = " + temperature + "\nExtras = " + extras;
    }
}

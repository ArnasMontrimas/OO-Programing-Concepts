package Fruit;

public class Apple extends Fruit {
    private String variety;

    public Apple(double weight, String variety){
        super(weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}

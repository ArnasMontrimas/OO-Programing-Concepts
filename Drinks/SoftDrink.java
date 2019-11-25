package Drinks;

public class SoftDrink extends Drink {
    private boolean fizzy;

    public SoftDrink(String flavour, boolean fizzy){
        super(flavour);
        this.fizzy = fizzy;
    }

    public boolean isFizzy() {
        return fizzy;
    }

    public void setFizzy(boolean fizzy) {
        this.fizzy = fizzy;
    }

    public double calcPrice() {
        if(isFizzy()) return value*2.5;
        else return value;
    }

    @Override
    public String toString(){
        return super.toString() + "\nFizzy? = " + fizzy;
    }
}

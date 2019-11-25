package Fruit;

public class FruitApp {
    public static void main(String[] args){
        //Creating Objects
        Apple a1 = new Apple(10,"Red");
        Banana b1 = new Banana(5,4.56);

        //Testing Methods
        a1.setVariety("Blue");
        a1.setWeight(1);
        b1.setLength(20);
        b1.setWeight(1);

        System.out.println(a1.getVariety() +" "+ a1.getWeight());
        System.out.println(b1.getWeight() +" "+ b1.getLength());


    }
}

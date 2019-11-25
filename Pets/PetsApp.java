package Pets;

public class PetsApp {
    public static void main(String[] args) {
        //Creating Objects;
        Dog d1 = new Dog(22,10,"Lopas","Dobberman",25);
        Cat c1 = new Cat(22,4,"King","Sfynks",24);


        //Testing Methods
        d1.setBarkVolume(4);
        d1.setName("Arnas");
        c1.setPurrVolume(2);
        c1.setName("James");

        System.out.println(d1.getBarkVolume());
        System.out.println(d1.getName());
        System.out.println(c1.getPurrVolume());
        System.out.println(c1.getName());
    }
}

package Drinks;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args){
        //Object Set Up
        Scanner scan = new Scanner(System.in);
        ArrayList<Drink>  myDrinks = new ArrayList<>();


        //Variables
        String input, flavour, extras;
        boolean bool = true, fizzy;
        double temperature;

        //CoffeeShop Application.
        System.out.println("Welcome to the CoffeeShop");
        while (bool) {
            System.out.println("What Drink would you like?\nDrink? - 1\nSoftDrink? - 2\nHotDrink? - 3");
            input = scan.next();
            if(input.equalsIgnoreCase("1")){
                System.out.println("Enter flavour desired");
                flavour = scan.next();
                Drink d1 = new Drink(flavour);
                myDrinks.add(d1);
                System.out.println("Continue? y/n");
                input = scan.next();
                if(input.equalsIgnoreCase("n")) bool = false;
            }
            if(input.equalsIgnoreCase("2")){
                System.out.println("Enter flavour desired");
                flavour = scan.next();
                System.out.println("Would you like it fizzy? y/n");
                input = scan.next();
                fizzy = input.equalsIgnoreCase("y");
                Drink d1 = new SoftDrink(flavour,fizzy);
                myDrinks.add(d1);
                System.out.println("Continue? y/n");
                input = scan.next();
                if(input.equalsIgnoreCase("n")) bool = false;
            }
            if(input.equalsIgnoreCase("3")){
                System.out.println("Enter flavour desired");
                flavour = scan.next();
                System.out.println("Enter temperature desired");
                temperature = scan.nextDouble();
                System.out.println("What extras would you like?");
                scan.nextLine();
                extras = scan.nextLine();
                Drink d1 = new HotDrink(flavour,temperature,extras);
                myDrinks.add(d1);
                System.out.println("Continue? y/n");
                input = scan.next();
                if(input.equalsIgnoreCase("n")) bool = false;
            }
        }
        for(Drink d: myDrinks){
            System.out.println();
            System.out.println(d);
        }


    }
}

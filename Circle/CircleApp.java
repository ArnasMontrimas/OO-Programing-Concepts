package Circle;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args){
        //Object Set Up
        Scanner scan = new Scanner(System.in);
        CircleStore store = new CircleStore("CircleStore");

        //Variables
        String input;
        String continueOrNot = "y";
        double radius;
        double length;

        //Interface Set Up
        System.out.println("Welcome to the CircleApp :)");

        while(continueOrNot.equalsIgnoreCase("y")) {
            System.out.println("Make Circle or Cylinder 1/2");
            input = scan.next();
            if(input.equalsIgnoreCase("1")) {
                System.out.println("Enter Radius of Circle");
                radius = scan.nextDouble();
                Circle c1 = new Circle(radius);
                store.addCircle(c1);
                System.out.println("Continue? y/n");
                input = scan.next();
                if(input.equalsIgnoreCase("n")){
                    continueOrNot = "n";
                }
            }
            if(input.equalsIgnoreCase("2")){
                System.out.println("Enter Radius of Cylinder");
                radius = scan.nextDouble();
                System.out.println("Enter Length of Cylinder");
                length = scan.nextDouble();
                Circle c2 = new Cylinder(radius,length);
                store.addCircle(c2);
                System.out.println("Continue? y/n");
                input = scan.next();
                if(input.equalsIgnoreCase("n")){
                    continueOrNot = "n";
                }
            }
        }

        System.out.println("Radii are");
        store.showAllRadii();
        System.out.println();
        System.out.println("Areas are");
        store.showAllAreas();
        System.out.println();
        System.out.println("Lengths of Cylinders are");
        store.showCylinderLengths();
        System.out.println();
        System.out.println("Volumes of Cylinders are");
        store.showCylinderVolumes();

    }

}

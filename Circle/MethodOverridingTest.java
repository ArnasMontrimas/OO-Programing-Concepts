/* sam008: MethodOverridingTest.java
 *
 * This class is incomplete.  Write code to:
 * 	Create a circle with radius 3; output its radius and its area
 * 	Create a cylinder with radius 3 and length 4: output is radius, length and surface area
 */
package Circle;

import java.text.DecimalFormat;
public class MethodOverridingTest
{


    public static void main( String[] args )
    {
        System.out.println("\nsam008: Demonstrating Method Overriding\n");


		// testing how to format decimals
		double n = 123.5463456;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(n));

        Circle c1 = new Circle(2);
        Cylinder c2 = new Cylinder(3,4);

        System.out.println("Radius: " + c1.getRadius() + " Area: " + df.format(c1.calcArea()));
        System.out.println("Radius: " + c2.getRadius() + " Length: " + c2.getLength() + " Surface Area: " + df.format(c2.calcArea()));

    }
}

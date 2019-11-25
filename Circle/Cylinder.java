/* sam008: Cylinder.java
 *
 * Inheritance and Method Overriding
 *
 * This class is incomplete and will not compile as there is missing code!
 */
package Circle;

public class Cylinder extends Circle
{
    private double length;

    // default constructor
    public Cylinder()
    {
        radius = 5.0; // Default radius of 5.0
        length = 1.0; // default length of 1.0
    }


    public Cylinder(double aRadius, double aLength)
    {
        radius = aRadius;
        length = aLength;   // default length of 1.0
    }


    // getter method for length
    public double getLength()
    {
        return length;
    }

    public double calcVolume()
    {
        return Math.PI*Math.pow(radius,2)+length;
    }

    /* Calculate surface area of cylinder
    *  This method overrides calcArea() inherited from Circle class
    **/
    public double calcArea()
    {
        return 2*Math.PI*radius*length+2*Math.PI*Math.pow(radius,2);
    }

}

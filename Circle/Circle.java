/* sam008: Circle.java
 *
 *  This class is complete and should compile without errors
 */
package Circle;

public class Circle
{
    // instance variable
    protected double radius;

    // constructors
    public Circle( double aRadius )
    {
        radius = aRadius;
    }

    public Circle() // default constructor
    {
        radius = 1.0 ;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius( double aRadius )
    {
        radius = aRadius;
    }

    public double calcArea()
    {
        return radius * radius * Math.PI;
    }
}
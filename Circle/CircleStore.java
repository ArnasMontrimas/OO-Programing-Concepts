package Circle;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CircleStore {
    private DecimalFormat df = new DecimalFormat(".00");

    private ArrayList<Circle> hoops;
    private String name;

    public CircleStore(String name){
        this.hoops = new ArrayList<Circle>();
        this.name = name;
    }

    public void addCircle(Circle circle){
        hoops.add(circle);
    }

    public void showAllRadii(){
        for(Circle c: hoops){
            System.out.println(c.getRadius());
        }
    }

    public void showAllAreas(){
        for(Circle c: hoops){
            System.out.println(df.format(c.calcArea()));
        }
    }

    public void showCylinderLengths(){
        for(Circle c: hoops){
            if(c instanceof Cylinder) {
                System.out.println(((Cylinder) c).getLength());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showCylinderVolumes(){
        for(Circle c: hoops){
            if(c instanceof Cylinder){
                System.out.println(df.format(((Cylinder) c).calcVolume()));
            }
        }

    }

}

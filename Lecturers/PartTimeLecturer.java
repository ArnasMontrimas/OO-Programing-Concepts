
package Lecturers;


public class PartTimeLecturer extends Lecturer {
    private double hRate;

    public PartTimeLecturer(String aName, double aHrate){
        super(aName);
        hRate = aHrate;
    }

    public double gethRate() {
        return hRate;
    }

    public void sethRate(double hRate) {
        this.hRate = hRate;
    }

}

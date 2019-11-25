package Lecturers;

public class FullTimeLecturer extends Lecturer {
    private double salary;

    public FullTimeLecturer(String aName, double aSalary){
        super(aName);
        salary = aSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

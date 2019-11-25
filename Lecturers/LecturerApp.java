package Lecturers;

public class LecturerApp {
    public static void main(String[] args){
        //Creating Objects
        PartTimeLecturer p1 = new PartTimeLecturer("Tom", 20.00);
        FullTimeLecturer f1 = new FullTimeLecturer("James", 60000);

        //Testing Methods
        System.out.println(p1.getName());
        System.out.println(f1.getName());
        p1.sethRate(50.00);
        f1.setSalary(100000);
        System.out.println(p1.gethRate());
        System.out.println(f1.getSalary());
    }
}

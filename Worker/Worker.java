package Worker;

import java.util.Objects;

public class Worker {
    protected String name;
    protected double hWorked;
    protected double hRate;

    public Worker(String name, double hWorked, double hRate) {
        this.name = name;
        this.hWorked = hWorked;
        this.hRate = hRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double gethWorked() {
        return hWorked;
    }

    public void sethWorked(double hWorked) {
        this.hWorked = hWorked;
    }

    public double gethRate() {
        return hRate;
    }

    public void sethRate(double hRate) {
        this.hRate = hRate;
    }

    public double calcPay(){
        double pay;

        pay = hWorked * hRate;
        return pay;
    }

    @Override
    public String toString(){
        return "Name = " + name + ", HoursWorked = " + hWorked + ", HourlyRate = " + hRate;
    }

/*

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.hWorked, hWorked) == 0 &&
                Double.compare(worker.hRate, hRate) == 0 &&
                name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hWorked, hRate);
    }

 */
}

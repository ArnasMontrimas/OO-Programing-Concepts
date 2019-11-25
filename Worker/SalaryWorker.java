package Worker;

import java.util.Objects;

public class SalaryWorker extends Worker {
    private double salary;

    public SalaryWorker(String name, double hWorked, double hRate, double salary) {
        super(name, hWorked, hRate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calcPay(){
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + ", Salary = " + salary;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalaryWorker that = (SalaryWorker) o;
        return Double.compare(that.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

*/
}

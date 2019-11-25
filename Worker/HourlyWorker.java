package Worker;

import java.util.Objects;

public class HourlyWorker extends Worker {
    private double overTimeRate;

    public HourlyWorker(String name, double hWorked, double hRate, double overTimeRate) {
        super(name, hWorked, hRate);
        this.overTimeRate = overTimeRate;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public double calcPay(){
        double pay;

        if(hWorked > 40) {
            pay = ((hWorked-40)*overTimeRate)+40*hRate;
        }
        else {
            pay = hWorked*hRate;
        }
        return pay;
    }

    @Override
    public String toString(){
        return super.toString() + ", Overtime Rate = " + overTimeRate;
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyWorker that = (HourlyWorker) o;
        return Double.compare(that.overTimeRate, overTimeRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), overTimeRate);
    }

 */
}

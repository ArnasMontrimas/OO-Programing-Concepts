package Worker;

import java.util.ArrayList;
import java.util.Objects;

public class WorkerGroup {
    private String deptName;
    private ArrayList<Worker> workers;

    public WorkerGroup(String deptName){
        this.deptName = deptName;
        workers = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public boolean addWorker(Worker worker){
        return workers.add(worker);
    }

    public boolean removeWorker(Worker worker){
       return workers.remove(worker);
    }

    public void removeWorkerByIndex(int index){
        workers.remove(index);
    }

    public int getNumberOfWorkers(){
        return workers.size();
    }

    public int getNumberOfHourlyWorkers(){
        int counter = 0;
        for(Worker w: workers){
            if(w instanceof HourlyWorker){
                counter++;
            }
        }
        return counter;
    }

    public int getNumberOfSalaryWorkers(){
        int counter = 0;
        for(Worker w: workers){
            if(w instanceof SalaryWorker){
                counter++;
            }
        }
        return counter;
    }

    public double getAverageOvertimeRate(){
        double total= 0, avg;
        for(Worker w: workers){
            if(w instanceof HourlyWorker){
                total += ((HourlyWorker) w).getOverTimeRate();
            }
        }
        avg = total/getNumberOfHourlyWorkers();
        return avg;
    }

    public double getTotalWageBill(){
        double total = 0;
        for(Worker w: workers){
            if(w instanceof SalaryWorker){
                total += ((SalaryWorker) w).getSalary();
            }
        }
        return total;
    }

    public Worker findWorker(Worker worker){
       int counter = -1;
        for(Worker w: workers){
            counter++;
            if(w.equals(worker)){
                return workers.get(counter);
            }
        }
        return null;
    }

}

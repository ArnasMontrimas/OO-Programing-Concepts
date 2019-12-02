package Worker;

public class WorkerApp {
    public static void main(String[] args){
        //Creating Objects
        SalaryWorker s1 = new SalaryWorker("Tom",10,10,30000);
        SalaryWorker s2 = new SalaryWorker("Bob", 26,15,30000);
        HourlyWorker h1 = new HourlyWorker("James",30,10,20);
        HourlyWorker h2 = new HourlyWorker("Lad",50,10,20);
        HourlyWorker h3 = new HourlyWorker("Lad",50,10,20);

        //Creating Object That Will Serve As An ArrayList To Store All Workers
        WorkerGroup workers = new WorkerGroup("Dundalk");

        //Testing Methods
        workers.addWorker(s1); // Index 0
        workers.addWorker(s2); // Index 1
        workers.addWorker(h1); // Index 2
        workers.addWorker(h2); // Index 3

        workers.setDeptName("California");
        System.out.println(workers.getDeptName());
        System.out.println();

        workers.removeWorkerByIndex(0);
        System.out.println(workers.removeWorker(h1));
        System.out.println(workers.getNumberOfWorkers());
        System.out.println(workers.getNumberOfHourlyWorkers());
        System.out.println(workers.getNumberOfSalaryWorkers());
        System.out.println();

        System.out.println(workers.getAverageOvertimeRate());
        System.out.println(workers.getTotalWageBill());
        System.out.println();

        System.out.println(workers.findWorker(h3));
    }
}

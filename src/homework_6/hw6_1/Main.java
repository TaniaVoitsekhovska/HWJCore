package homework_6.hw6_1;

public class Main {
    public static void main(String[] args) {

        MonthSalary worker1 = new MonthSalary("Olia", 15000);
        HourSalary worker2 = new HourSalary("Ira", 65.50, 240);

        worker1.salaryToPay();
        worker2.salaryToPay();

    }


}

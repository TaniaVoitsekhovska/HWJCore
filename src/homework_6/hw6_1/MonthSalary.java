package homework_6.hw6_1;

public class MonthSalary extends Employee implements Salary {
    private double monthPay;

    public MonthSalary(String name, double monthPay) {
        super(name);
        this.monthPay = monthPay;
    }


    @Override
    public void salaryToPay() {
        double salary = this.monthPay;
        System.out.println("Employee salary " + super.getName() + " is " + salary );
    }
}

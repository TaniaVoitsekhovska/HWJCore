package homework_6.hw6_1;

public class HourSalary extends Employee implements Salary {
    private double hourPay;
    private int monthHours;

    public HourSalary(String name, double hourPay,int monthHours) {
        super(name);
        this.hourPay = hourPay;
        this.monthHours=monthHours;
    }


    @Override
    public void salaryToPay() {
        double salary = this.hourPay*(double)this.monthHours;
        System.out.println("Employee salary " + super.getName() + " is " + salary );
    }
}

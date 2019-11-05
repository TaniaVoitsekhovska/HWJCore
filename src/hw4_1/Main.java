package hw4_1;

public class Main {
    public static void main(String[] args) {

        Robot rb = new Robot();
        rb.work();

        CofeeRobot cr = new CofeeRobot();
        cr.work();

        RobotDancer rd = new RobotDancer();
        rd.work();

        RobotCoocker rc = new RobotCoocker();
        rc.work();

        Robot[] array = new Robot[]{rb, cr, rd, rc};

        System.out.println("\nArray work():");

        for (Robot robot:array) {
            robot.work();
        }
    }
}

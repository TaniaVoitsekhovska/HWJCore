package homework_6.hw6_2.com.lgs.lab.interface2;

public class Main {

    public static void main(String[] args) {

        MyCalculator calc1 = new MyCalculator();
        calc1.first =633;
        calc1.second = 33;

        System.out.println("Calc1 :");
        MyCalculator.result(calc1.plus());
        MyCalculator.result(calc1.minus());
        MyCalculator.result(calc1.multiply());
        MyCalculator.result(calc1.devide());

        System.out.println();

        MyCalculator calc2 = new MyCalculator(274.85, 121.25);

        System.out.println("Calc2 :");
        MyCalculator.result(calc2.plus());
        MyCalculator.result(calc2.minus());
        MyCalculator.result(calc2.multiply());
        MyCalculator.result(calc2.devide());

    }
}

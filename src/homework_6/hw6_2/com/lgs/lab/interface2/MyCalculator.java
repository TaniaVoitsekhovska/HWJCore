package homework_6.hw6_2.com.lgs.lab.interface2;

import homework_6.hw6_2.com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {


    double first;
    double second;

    public MyCalculator() {
    }

    public MyCalculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double plus() {
        return this.first+this.second;
    }

    @Override
    public double minus() {
        return this.first-this.second;
    }

    @Override
    public double multiply() {
        return this.first*this.second;
    }

    @Override
    public double devide() {
        if(first==0) {
            System.out.println("Cannaot devide zero!!");
            return 0;
        }

        return this.first/this.second;
    }

    static void result(double result) {
        System.out.println("The resault is " + result);
    }
}

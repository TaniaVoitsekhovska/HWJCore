package homework_8_and_9.hw9_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException{

        Scanner sc=new Scanner(System.in);
        double first, second;
        System.out.println("Enter first number");
        if(sc.hasNextDouble()){
            first=sc.nextDouble();
            System.out.println("Enter second number");
            if(sc.hasNextDouble()){
                second=sc.nextDouble();
                Methods methods=new Methods(first,second);
                Methods.showResult(methods.addition());
                Methods.showResult(methods.subtraction());
                Methods.showResult(methods.multiplication());
                Methods.showResult(methods.division());

            }else
                System.out.println("You entered wrong number");
        }else
            System.out.println("You entered wrong number");



    }
}

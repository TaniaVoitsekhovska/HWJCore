package homework_8_and_9.hw8_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first, second;

        System.out.println("Enter first number ");
        if (sc.hasNextInt()) {
            first = sc.nextInt();
            System.out.println("Enter second number ");
            if (sc.hasNextInt()) {
                second = sc.nextInt();
                System.out.println("The sum of your numbers = " + (first + second));
            } else {
                System.out.println("You've entered not integer number! Try again");
            }
        } else
            System.out.println("You've entered not integer number! Try again ");


    }
}

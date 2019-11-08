package homework_8_and_9.hw8_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter number ");
            if (sc.hasNextInt()) {
                if (sc.nextInt() % 2 == 0) {
                    System.out.println("Your number is equal !");
                } else
                    System.out.println("Your number is not equal!!!");

            } else
                System.out.println("You've entered not integer number! Try again");


    }
}



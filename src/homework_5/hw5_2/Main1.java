package homework_5.hw5_2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        Coin coins = new Coin();
        coins.flipPlay(name);
    }
}


package homework_5.hw5_2;

import java.util.Scanner;

public class Coin {
    static Scanner sc=new Scanner(System.in);

       static void flipPlay( String name) {
        int head = 0;
        int tail = 0;
        System.out.println("Enter count flip");
        int num=sc.nextInt();

        for (int i = 0; i < num; i++) {
            int resault = (int) (Math.random() * 2);
            if (resault == 1)
                head++;
            else
                tail++;
        }
        System.out.println("Player "+name+" has "+head+ " heads and "+tail+" tails");
    }

}


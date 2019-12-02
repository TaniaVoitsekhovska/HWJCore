package homework_20;

import java.util.Scanner;

public class MyThread extends Thread {
    int number;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        int fib = 1;
        int temp = 0;
        int[] array;

        if (number <= 0) {
            System.out.println("Entered number is 0 or less. Enter one more time!");
        } else {
            array = new int[number];
            array[0] = 1;
            for (int i = 1; i < number; i++) {
                fib += temp;
                array[i] = fib;
                temp = array[i - 1];
            }
            for (int num : array) {
                System.out.print(" (f)=" + num);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

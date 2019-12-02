package homework_20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of fibonacci numbers to output.");
        int number = sc.nextInt();
        System.out.println("Fibonacci numbers: ");

        MyThread myThread = new MyThread(number);
        RunnableThread runnableThread = new RunnableThread(number);

        myThread.start();
        new Thread(runnableThread).start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();


        executorService.submit(myThread);
        executorService.submit(runnableThread);

        singleThreadExecutor.submit(myThread);
        singleThreadExecutor.submit(runnableThread);


        scheduledThreadPool.submit(myThread);
        scheduledThreadPool.submit(runnableThread);

        executorService.shutdown();
        scheduledThreadPool.shutdown();
        singleThreadExecutor.shutdown();


    }


}

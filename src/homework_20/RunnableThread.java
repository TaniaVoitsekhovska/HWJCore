package homework_20;



public class RunnableThread implements Runnable {
    int number;

    public RunnableThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        int fib = 1;
        int temp = 0;
        String text = "Fibonacci numbers: ";
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
            for (int i = array.length-1; i>=0 ; i--) {
                System.out.print(" (r)="+array[i]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

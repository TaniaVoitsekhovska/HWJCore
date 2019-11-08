package homework_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;

        System.out.println("byte min = " + Byte.MIN_VALUE);
        System.out.println("byte max = " + Byte.MAX_VALUE);
        System.out.println("short min = " + Short.MIN_VALUE);
        System.out.println("short max = " + Short.MAX_VALUE);
        System.out.println("int min = " + Integer.MIN_VALUE);
        System.out.println("int max = " + Integer.MAX_VALUE);
        System.out.println("long min = " + Long.MIN_VALUE);
        System.out.println("long max = " + Long.MAX_VALUE);
        System.out.println("float min = " + Float.MIN_VALUE);
        System.out.println("float max = " + Float.MAX_VALUE);
        System.out.println("double min = " + Double.MIN_VALUE);
        System.out.println("double max = " + Double.MAX_VALUE);
        System.out.println("char = " + Character.MAX_VALUE);
        System.out.println("boolean = " + Boolean.FALSE);
        System.out.println("boolean = " + Boolean.TRUE);
        System.out.println();


        System.out.println("Enter some text ");
        String text = sc.nextLine();
        text.replaceAll(".,!?", "");
        String[] array = text.split(" ");
        String word = "Words:\n";
        for (int i = 0; i < array.length; i++) {
            int count=array[i].length();
            word = array[i] + " " +" numbers of letters: "+count+"\n";
        }
        System.out.println(word);

    }

    /**
     * method counts sum of to numbers
     *
     * @param a first integer to add
     * @param b second integer to add
     * @return the result of adding a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * @param text some text that method doubles
     * @return doubled text
     */
    public static String print(String text) {
        text += text;
        return text;
    }


}


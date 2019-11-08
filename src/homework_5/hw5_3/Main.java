package homework_5.hw5_3;

public class Main {
    public static void main(String[] args) {

        maxDouble();
        minDouble();
        minFloat();
        maxFloat();
    }


    static void minFloat() {
        System.out.println("float min = " + Float.MIN_VALUE);
    }

    static void maxFloat() {
        System.out.println("float max = " + Float.MAX_VALUE);
    }

    static void minDouble() {
        System.out.println("double min = " + Double.MIN_VALUE);
    }

    static void maxDouble() {
        System.out.println("double max = " + Double.MAX_VALUE);
    }
}

package homework_3;

public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Rectangle rec2 = new Rectangle(6.3, 7.1);


        System.out.println("\nRectangle rec :");
        rec.show();

        System.out.println("\nRectangle rec2 :");
        rec2.show();

        Circle circle1 = new Circle(5.4, 2.3);
        Circle circle2 = new Circle(8.8, 9.5);

        System.out.println("\nThe circle1:");
        circle1.show();
        System.out.println("\nThe circle2:");
        circle2.show();

    }
}

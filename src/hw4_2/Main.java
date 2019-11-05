package hw4_2;

public class Main {

    public static void main(String[] args) {

        Handlebar hb1 = new Handlebar(25, "black", true, "leather");
        AutoBody ab1 = new AutoBody(1700, "red", 2);
        Wheel wh1 = new Wheel(17, "Nokian", "winter");
        Car car = new Car(hb1, wh1, ab1, "Opel", 2018, 220);


        System.out.println(car.toString());



    }
}

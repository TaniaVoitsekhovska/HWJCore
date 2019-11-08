package homework_7;

public class AirplaneMove {

    public void up() {
        System.out.println("The airplane flew up " + Move.move() + "km");
    }

    public void down() {
        System.out.println("The airplane flew down " + Move.move() + "km");
    }

    public void left() {
        System.out.println("The airplane flew left " + Move.move() + "km");
    }

    public void right() {
        System.out.println("The airplane flew right " + Move.move() + "km");
    }
}

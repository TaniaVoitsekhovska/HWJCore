package homework_3;

public class Circle {

    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    public double area(){
        return (Math.PI/4)*(diameter*diameter);
    }

    public double length() {
        return 2*Math.PI*radius;
    }

    public void show(){
        System.out.printf("%nThe area = %.2f%n", area());
        System.out.printf("The length = %.2f%n", length());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

package homework_3;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 5.5;
        this.width = 3.5;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {

        return length * width;
    }

    public double perimetr() {

        return 2 * (length + width);
    }

    public void show(){
        System.out.printf("%nThe area of rectangle  = %.2f", area());
        System.out.printf("%nThe perimeter of rectangle  = %.2f%n ", perimetr());
    }

}

package homework_4.hw4_2;

public class Car {

    private Handlebar hb;
    private Wheel wh;
    private  AutoBody ab;
    private String brand;
    private int yearManufacture;
    private int MaxSpeed;

    public Car(Handlebar hb, Wheel wh, AutoBody ab, String brand, int yearManufacture, int maxSpeed) {
        this.hb = hb;
        this.wh = wh;
        this.ab = ab;
        this.brand = brand;
        this.yearManufacture = yearManufacture;
        MaxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hb=" + hb +
                ", wh=" + wh +
                ", ab=" + ab +
                ", brand='" + brand + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", MaxSpeed=" + MaxSpeed +
                '}';
    }




    public Handlebar getHb() {
        return hb;
    }

    public void setHb(Handlebar hb) {
        this.hb = hb;
    }

    public Wheel getWh() {
        return wh;
    }

    public void setWh(Wheel wh) {
        this.wh = wh;
    }

    public AutoBody getAb() {
        return ab;
    }

    public void setAb(AutoBody ab) {
        this.ab = ab;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }


}

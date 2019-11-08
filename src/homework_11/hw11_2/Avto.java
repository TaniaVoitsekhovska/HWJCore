package homework_11.hw11_2;

public class Avto {

    private int power;
    private int year;
    private Handlebar handlebar;
    private Engine engine;

    public Avto(int power, int year, Handlebar handlebar, Engine engine) {

        this.power = power;
        this.year = year;
        this.handlebar = handlebar;
        this.engine = engine;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public Handlebar getHandlebar() {
        return handlebar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHandlebar(Handlebar handlebar) {
        this.handlebar = handlebar;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Avto was manufactured in "+year+". The horse power is "+power+" "+handlebar.toString()+" "+
                engine.toString();
    }
}

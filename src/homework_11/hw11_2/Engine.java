package homework_11.hw11_2;

public class Engine {
    private int numOfCelinders;

    public Engine(int numOfCelinders) {
        this.numOfCelinders = numOfCelinders;
    }

    public int getNumOfCelinders() {
        return numOfCelinders;
    }

    public void setNumOfCelinders(int numOfCelinders) {
        this.numOfCelinders = numOfCelinders;
    }

    @Override
    public String toString() {
        return "Number of celinders "+numOfCelinders;
    }
}

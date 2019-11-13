package homework_12.hw12_1;

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

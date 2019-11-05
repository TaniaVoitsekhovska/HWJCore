package hw4_2;

public class AutoBody {

    private int weight;
    private String colour;
    private int doorNum;

    AutoBody(int weight, String colour, int doorNum){
        this.weight=weight;
        this.colour=colour;
        this.doorNum=doorNum;

    }

    @Override
    public String toString() {
        return "AutoBody{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                ", doorNum=" + doorNum +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }
}

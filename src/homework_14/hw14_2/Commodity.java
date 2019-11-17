package homework_14.hw14_2;


import java.util.Comparator;

public class Commodity  {

    private String name;
    private Integer length;
    private Integer width;
    private Integer weight;

    public Commodity(String name, Integer length, Integer width, Integer weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity [ name " + name + ", length " + length + ", width " + width + ", weight " + weight + "]";
    }


}

package homework_7;

public abstract class Airplane extends AirplaneMove {

    private int length;
    private int width;
    private int weight;

    public Airplane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void engineStart(){
        int num=(int)(Math.random()*(88-20+1)+20);
        System.out.println("Engine started. "+num+" seconds is left until takeoff ! ");

    }

    public void planeTakeoff(){
        double num=(Math.random()*(1000+1));
        System.out.printf("%nThe takeoff. The airplane will fly %.2f km with full tank.%n",num);
    }

    public void planeLanding() {
        System.out.println("The airplane is going to land !");
    }


}

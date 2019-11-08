package homework_7;

public class Su_27 extends Airplane implements TurboSpeedUp,Stelth,NuclearStrike{

    private int maxSpeed;
    private String colour;

    public Su_27(int length, int width, int weight, int maxSpeed, String colour) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }


    @Override
    public void nuclearStrike() {
        int bombs = (int) (Math.random() * (10 + 1));
        System.out.println( bombs + " bombs is going to be dropped");
    }

    @Override
    public void stelth() {
        int notVisible = (int) (Math.random() * 1000);
        System.out.println("The airplane is not visible for " + notVisible+ " sec");
    }

    @Override
    public void turboSpeedUp() {
        int newSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
        System.out.println("The speed in turbo regime is" + newSpeed + " km/hour");
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

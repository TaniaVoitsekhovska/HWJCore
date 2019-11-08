package homework_7;

public class Main {

    public static void main(String[] args) {

        Su_27 plane=new Su_27(250, 35,2500,500,"red");

        plane.engineStart();
        plane.planeTakeoff();
        plane.up();
        plane.left();
        plane.right();
        plane.down();
        plane.stelth();
        plane.nuclearStrike();
        plane.turboSpeedUp();
        plane.planeLanding();

    }
}

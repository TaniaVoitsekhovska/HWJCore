package homework_4.hw4_2;

public class Handlebar {

    private int diameter;
    private String coluor;
    private boolean hasSpeedChange;
    private String material;

    Handlebar(int diameter,String coluor,boolean hasSpeedChang, String material ){
        this.diameter=diameter;
        this.coluor=coluor;
        this.hasSpeedChange=hasSpeedChang;
        this.material=material;

    }

   @Override
    public String toString() {
        return "Handlebar{" +
                "diameter=" + diameter +
                ", coluor='" + coluor + '\'' +
                ", hasSpeedChange=" + hasSpeedChange +
                ", material='" + material + '\'' +
                '}';
    }

    public int diameterChange(int size){

        return getDiameter()+size;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColuor() {
        return coluor;
    }

    public void setColuor(String coluor) {
        this.coluor = coluor;
    }

    public boolean isHasSpeedChange() {
        return hasSpeedChange;
    }

    public void setHasSpeedChange(boolean hasSpeedChange) {
        this.hasSpeedChange = hasSpeedChange;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String matirial) {
        this.material = matirial;
    }
}

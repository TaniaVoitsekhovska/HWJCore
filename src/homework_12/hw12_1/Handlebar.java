package homework_12.hw12_1;

public class Handlebar {

    private int diametr;
    private String material;

    public Handlebar(int diametr, String material) {

        this.diametr = diametr;
        this.material = material;
    }

    public int getDiametr() {
        return diametr;
    }

    public String getMaterial() {
        return material;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Diametr of handelbar is " + diametr + " and is made of " + material;
    }
}

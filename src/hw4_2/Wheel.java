package hw4_2;

public class Wheel {

    private int size;
    private String brand;
    private String seasonUse;

    Wheel(int size, String brand, String seasonUse){
        this.size=size;
        this.brand=brand;
        this.seasonUse=seasonUse;

    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                ", seasonUse='" + seasonUse + '\'' +
                '}';
    }

    public int wheelSize(String season, int size){
        if(season!="winter"){
            return 17;
        }else {
            return size-1;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeasonUse() {
        return seasonUse;
    }

    public void setSeasonUse(String seasonUse) {
        this.seasonUse = seasonUse;
    }
}

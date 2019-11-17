package homework_14.hw14_2;

import java.util.Comparator;

public class Commodity_Weight implements Comparator<Commodity> {


    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWeight().compareTo(o2.getWeight())>0 ) {
            return 1;
        } else if (o1.getWeight().compareTo(o2.getWeight())<0) {
            return -1;
        }
        return 0;
    }
}

package homework_14.hw14_1;

import java.util.Comparator;

public class Cat2 implements Comparator<Cat> {


    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        return 0;
    }
}

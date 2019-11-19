package homework_15;

import java.util.Comparator;

public class Animal_Sort implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAnimalType().equalsIgnoreCase(o2.getAnimalType())) {
            return o1.getName().compareTo(o2.getName());
        } else
            return o1.getAnimalType().compareTo(o2.getAnimalType());

    }
}

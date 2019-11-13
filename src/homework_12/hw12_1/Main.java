package homework_12.hw12_1;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(10);

        ArrayList<Avto> arrayAvtos = new ArrayList();
        for (int i = 0; i < number; i++) {

            Handlebar handlebar = new Handlebar((random.nextInt((19 - 15 + 1) + 15)), material());
            arrayAvtos.add(new Avto((random(250, 100)), (random(2019, 1990)), handlebar,
                    new Engine(random(10, 2))));
        }
        System.out.println(arrayAvtos.toString());

    }

    static int random(int max, int min) {
        if (max < min) {
            throw new IllegalArgumentException("Max number is smaller than min number !");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    static String material() {
        Random random = new Random();
        Material[] materials = Material.values();
        int n = random.nextInt(2);

        return materials[n].name();
    }
}

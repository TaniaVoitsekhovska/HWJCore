package homework_11.hw11_2;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Avto[][] arrayAvtos = new Avto[random(10,1)][random(10,1)];
        for (int i = 0; i < arrayAvtos.length; i++) {
            for (int j = 0; j < arrayAvtos.length; j++) {
                Handlebar handlebar = new Handlebar((random.nextInt((19 - 15 + 1) + 15)), material());
                arrayAvtos[i][j] = new Avto((random(250, 100)), (random(2019, 1990)), handlebar,
                        new Engine(random(10, 2)));

            }
        }

        System.out.println(Arrays.deepToString(arrayAvtos));
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

package homework_14.hw14_1;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Cat a = new Cat("Murchyk", 3);
        Cat b = new Cat("Nuisha", 11);
        Cat c = new Cat("Vasia", 5);
        Cat d = new Cat("Sheba", 1);
        Cat e = new Cat("Murchyk", 8);
        Cat[] cats = {a, b, c, d, e};

        System.out.println("Using HasSet, outputs items in random order:");
        Set<Cat> catHashSet = new HashSet<Cat>();
        for (Cat cat : cats) {
            catHashSet.add(cat);
        }
        for (Cat print : catHashSet) {
            System.out.println(print);

        }



        System.out.println("\nUsing LinkedHasSet, outputs items in order of addition:");
        Set<Cat> catLinkedHashSet = new LinkedHashSet<Cat>();
        for (Cat cat : cats) {
            catLinkedHashSet.add(cat);
        }

        for (Cat print : catLinkedHashSet) {
            System.out.println(print);

        }


        System.out.println("\nUsing TreeSet, outputs items in order of Comperable:");
        Set<Cat> catTreeSet = new TreeSet<Cat>();
        for (Cat cat : cats) {
            catTreeSet.add(cat);
        }

        for (Cat print : catTreeSet) {
            System.out.println(print);

        }


        System.out.println("\nUsing TreeSet, outputs items in order of Comperator:");
        Set<Cat> catTreeSetNew = new TreeSet<Cat>(new Cat2());
        for (Cat cat : cats) {
            catTreeSetNew.add(cat);
        }

        for (Cat print : catTreeSetNew) {
            System.out.println(print);

        }


    }
}

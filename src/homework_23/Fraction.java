package homework_23;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Fraction {

    private String fraction;

    public Fraction(String fraction) {
        this.fraction = fraction;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    List<Deputy> deputies = new ArrayList<Deputy>();

    Supplier<Deputy> createDeputy = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname = scanner.next();
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter height:");
        int height = scanner.nextInt();
        System.out.println("Enter weight:");
        int weight = scanner.nextInt();
        System.out.println("Enter bribe-taker status (true/false):");
        boolean bribeTaker = scanner.nextBoolean();

        return new Deputy(surname, name, age, height, weight, bribeTaker);
    };

    Supplier<Deputy> getDeputy = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname = scanner.next();
        System.out.println("Enter name:");
        String name = scanner.next();

        return new Deputy(surname, name);
    };


    public void addDeputy() {
        Deputy deputy = createDeputy.get();

        if (deputy.isBribeTaker()) {
            deputy.giveBribe();
        }

        deputies.add(deputy);
        System.out.println("Deputy " + deputy.toString() + " is added!");
    }

    public void removeDeputy() {
        Deputy deputyTyped = getDeputy.get();

        Predicate<Deputy> isEqualSurnameName = deputy -> deputy.getSurname().equalsIgnoreCase(deputyTyped.getSurname())
                && deputy.getName().equalsIgnoreCase(deputyTyped.getName());
        Optional<Deputy> deputyFound = deputies.stream().filter(isEqualSurnameName).findFirst();

        if (deputyFound.isPresent()) {
            deputies.remove(deputyFound.get());
            System.out.println("Deputy " + deputyFound.get().toString() + " is removed!");

        } else {
            System.out.println("There is no such deputy!");
        }
    }

    public void getAllBribeTakers() {
        System.out.println("bribe-takers are:");
        List<Deputy> bribeTakers = deputies.stream().filter(Deputy::isBribeTaker).collect(Collectors.toList());
        bribeTakers.forEach(System.out::println);
    }

    public void getBiggestBribeTaker() {
        Comparator<Deputy> deputyBiggestBribe = (deputy1, deputy2) -> (deputy1.getBribeSize()
                > deputy2.getBribeSize()) ? 1 : (deputy1.getBribeSize() == deputy2.getBribeSize()) ? 0 : -1;
        Optional<Deputy> biggestBribeTaker = deputies.stream().filter(Deputy::isBribeTaker)
                .max(deputyBiggestBribe);

        if (biggestBribeTaker.isPresent()) {
            System.out.println("The biggest bribe-taker " + biggestBribeTaker.get().toString());
        } else {
            System.out.println("Fraction has no bribe-taker!");
        }
    }

    public void getAllDeputies() {
        System.out.println("Deputies of fraction:");
        deputies.forEach(System.out::println);
    }

    public void clearFraction() {
        deputies.clear();
        System.out.println("All deputies are removed!");
    }

    @Override
    public String toString() {
        return "Fraction \"" + deputies + "\"";
    }
}




package homework_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public final class VerkhovnaRada {

    private static VerkhovnaRada instance=new VerkhovnaRada();

    private VerkhovnaRada(){

    }

    public static VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    List<Fraction> verkhovnaRadaFraction=new ArrayList<Fraction>();

    Supplier<Fraction> getFraction = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of fraction:");
        String fractionName = scanner.next();

        return new Fraction(fractionName);
    };

    public Optional<Fraction> findFraction() {
        Fraction fraction = getFraction.get();

        Predicate<Fraction> isEqualFraction = fraction1 -> fraction1.getFraction().equalsIgnoreCase(fraction.getFraction());
        Optional<Fraction> fractionFound = verkhovnaRadaFraction.stream().filter(isEqualFraction).findFirst();

        return fractionFound;
    }

    public void addFraction() {
        Fraction fraction = getFraction.get();

        verkhovnaRadaFraction.add(fraction);
        System.out.println(fraction.toString() + " is added to Verkhovna Rada!");
    }

    public void removeFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            verkhovnaRadaFraction.remove(fraction.get());
            System.out.println(fraction.get().toString() + "is removed from Verkhovna Rada!");
        } else {
            System.out.println("Is not a fraction of Verkhovna Rada !");
        }
    }

    public void getSpecificFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            System.out.println(fraction.get().toString());
            fraction.get().getAllDeputies();
        } else {
            System.out.println("There is no such fraction!");
        }
    }
    public void getAllFractions() {
        System.out.println("Fractions are:");
        verkhovnaRadaFraction.forEach(System.out::println);
    }
    public void addDeputyToFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            fraction.get().addDeputy();
        } else {
            System.out.println("There is no such fraction!");
        }
    }

    public void removeDeputyFromFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            fraction.get().removeDeputy();
        } else {
            System.out.println("There is no such fraction!");
        }
    }
    public void getBribeTakersFromFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            fraction.get().getAllBribeTakers();
        } else {
            System.out.println("There is no such fraction!");
        }
    }

    public void getBiggestBribeTakerFromFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            fraction.get().getBiggestBribeTaker();
        } else {
            System.out.println("There is no such fraction!");
        }
    }

    public void clearFraction() {
        Optional<Fraction> fraction = findFraction();

        if (fraction.isPresent()) {
            fraction.get().clearFraction();
        } else {
            System.out.println("There is no such fraction!");
        }
    }
}

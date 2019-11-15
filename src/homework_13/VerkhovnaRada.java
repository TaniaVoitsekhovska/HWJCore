package homework_13;

import java.util.*;

public final class VerkhovnaRada implements Comparator<Fraction> {

    private static VerkhovnaRada instance;

    private VerkhovnaRada() {
    }

    public static VerkhovnaRada getInstance() {
        if (instance == null)
            instance = new VerkhovnaRada();

        return instance;
    }

    ArrayList<Fraction> fractionsArray = new ArrayList<Fraction>();

    public void addFraction() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of fraction:");
        String fractionName = sc.next();

        Fraction fraction1 = new Fraction(fractionName);
        fractionsArray.add(fraction1);
        System.out.println(fraction1.toString() + " is added to Verkhovna Rada");
    }

    public void removeFraction() {

        System.out.println("Enter fraction to remove ");
        Scanner sc = new Scanner(System.in);
        String fractionToRemove = sc.nextLine();

        boolean check = isFraction(fractionsArray, fractionToRemove);
        if (check) {
            Iterator<Fraction> fractionIterator = fractionsArray.iterator();
            while (fractionIterator.hasNext()) {
                Fraction fraction = fractionIterator.next();
                if (fraction.getNameOfFraction().equalsIgnoreCase(fractionToRemove)) {
                    fractionIterator.remove();
                    System.out.println("Fraction is removed from Verkhovna Rada");
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void selectAllFractions() {

        System.out.println("All fractions are: ");
        Collections.sort(fractionsArray, new VerkhovnaRada());
        Iterator<Fraction> fractions = fractionsArray.iterator();
        while (fractions.hasNext()) {
            Fraction allFraction = fractions.next();
            System.out.println(allFraction.toString());
        }
    }

    public void selectFraction() {
        System.out.println("Enter fraction ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction fraction = fractions.next();
                if (fraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    System.out.println(fraction.toString());
                    fraction.allDeputiesOfFraction();
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void addDeputyToFtaction() {
        System.out.println("Enter fraction  ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction allFraction = fractions.next();
                if (allFraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    allFraction.addDeputy();
                    System.out.println("The  deputy is added!");
                    allFraction.allDeputiesOfFraction();
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void removeDeputyFromFtaction() {
        System.out.println("Enter fraction  ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction allFraction = fractions.next();
                if (allFraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    allFraction.removeDeputy();
                    System.out.println("The deputy is removed!");
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void checkAllBribersOfFraction() {
        System.out.println("Enter fraction  ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction allFraction = fractions.next();
                if (allFraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    allFraction.allBribeTakers();
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void biigestBriberOfFraction() {
        System.out.println("Enter fraction ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction allFraction = fractions.next();
                if (allFraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    allFraction.biggestBriber();
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public void cleanFraction() {
        System.out.println("Enter fraction ");
        Scanner sc = new Scanner(System.in);
        String toCheck = sc.nextLine();

        boolean check = isFraction(fractionsArray, toCheck);
        if (check) {
            Iterator<Fraction> fractions = fractionsArray.iterator();
            while (fractions.hasNext()) {
                Fraction allFraction = fractions.next();
                if (allFraction.getNameOfFraction().equalsIgnoreCase(toCheck)) {
                    allFraction.removeAllDeputies();
                }
            }
        } else
            System.out.println("There is no such fraction!");
    }

    public boolean isFraction(ArrayList<Fraction> fractions, String fractionToCheck) {
        boolean check = false;
        Iterator<Fraction> iterator = fractions.iterator();
        while (iterator.hasNext()) {
            Fraction fraction = iterator.next();
            if (fraction.getNameOfFraction().equalsIgnoreCase(fractionToCheck)) {
                return true;
            }
        }
        return check;
    }

    @Override
    public int compare(Fraction o1, Fraction o2) {
        return o1.getNameOfFraction().compareTo(o2.getNameOfFraction());
    }
}

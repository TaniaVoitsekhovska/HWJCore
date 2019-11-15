package homework_13;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // example with two fractions and some deputies to show methods before adding new fractions and deputies
        VerkhovnaRada.getInstance().fractionsArray.add(new Fraction("Motherland"));
        VerkhovnaRada.getInstance().fractionsArray.add(new Fraction("Nature lovers"));

        VerkhovnaRada.getInstance().fractionsArray.get(0).deputiesArray.add( new Deputy(85, 185,
                "Petrov", "Sergio", 38, false));
        VerkhovnaRada.getInstance().fractionsArray.get(0).deputiesArray.add( new Deputy(110, 155,
                "Oliynik", "Ivan", 44, true));
        VerkhovnaRada.getInstance().fractionsArray.get(0).deputiesArray.get(1).setBribeValue(5500);
        VerkhovnaRada.getInstance().fractionsArray.get(0).deputiesArray.add( new Deputy(96, 177,
                "Kharchenko", "Oleh", 55, true));
        VerkhovnaRada.getInstance().fractionsArray.get(0).deputiesArray.get(2).setBribeValue(300);


        VerkhovnaRada.getInstance().fractionsArray.get(1).deputiesArray.add(new Deputy(91, 201,
                "Petrova", "Olena", 38, false));
        VerkhovnaRada.getInstance().fractionsArray.get(1).deputiesArray.add( new Deputy(53, 163,
                "Khorotka", "Iryna", 44, true));
        VerkhovnaRada.getInstance().fractionsArray.get(1).deputiesArray.get(1).setBribeValue(12500);
        VerkhovnaRada.getInstance().fractionsArray.get(1).deputiesArray.add(new Deputy(53, 165,
                "Khorotka", "Olia", 27, false));

        start();
    }


    public static void consoleMenu() {
        System.out.println("Enter 1, to add fraction");
        System.out.println("Enter 2, to remove specific fraction ");
        System.out.println("Enter 3, to show all fractions ");
        System.out.println("Enter 4, to clear specific fraction ");
        System.out.println("Enter 5, to show specific fraction");
        System.out.println("Enter 6, to add new deputy to fraction ");
        System.out.println("Enter 7, to remove deputy from fraction ");
        System.out.println("Enter 8, to show bribe-takers of fraction ");
        System.out.println("Enter 9, to show the biggest bribe-taker of fraction ");
        System.out.println("Enter o, for exit ");

    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            consoleMenu();
            boolean notExit = true;
            while (notExit) {

                switch (scanner.nextInt()) {

                    case 1: {
                        VerkhovnaRada.getInstance().addFraction();
                        break;
                    }

                    case 2: {
                        VerkhovnaRada.getInstance().removeFraction();
                        break;
                    }

                    case 3: {
                        VerkhovnaRada.getInstance().selectAllFractions();
                        break;
                    }

                    case 4: {
                        VerkhovnaRada.getInstance().cleanFraction();
                        break;
                    }

                    case 5: {
                        VerkhovnaRada.getInstance().selectFraction();
                        break;
                    }

                    case 6: {
                        VerkhovnaRada.getInstance().addDeputyToFtaction();
                        break;
                    }

                    case 7: {
                        VerkhovnaRada.getInstance().removeDeputyFromFtaction();
                        break;
                    }

                    case 8: {
                        VerkhovnaRada.getInstance().checkAllBribersOfFraction();
                        break;
                    }

                    case 9: {
                        VerkhovnaRada.getInstance().biigestBriberOfFraction();
                        break;
                    }
                    case 0: {
                        return;
                    }

                    default: {
                        System.out.println("Enter number from 1 to 9 !\n Enter 0 for exit");
                        break;
                    }
                }
            }
        }
    }
}

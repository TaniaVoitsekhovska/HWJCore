package homework_23;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        {
            Supplier<Integer> menu = () -> {
                System.out.println();
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

                Scanner scanner = new Scanner(System.in);
                int menuChoise = scanner.nextInt();

                return menuChoise;
            };


            while (true) {
                switch (menu.get()) {

                    case 1: {
                        VerkhovnaRada.getInstance().addFraction();
                        break;
                    }

                    case 2: {
                        VerkhovnaRada.getInstance().removeFraction();
                        break;
                    }

                    case 3: {
                        VerkhovnaRada.getInstance().getAllFractions();
                        break;
                    }

                    case 4: {
                        VerkhovnaRada.getInstance().clearFraction();
                        break;
                    }

                    case 5: {
                        VerkhovnaRada.getInstance().getSpecificFraction();
                        break;
                    }

                    case 6: {
                        VerkhovnaRada.getInstance().addDeputyToFraction();
                        break;
                    }

                    case 7: {
                        VerkhovnaRada.getInstance().removeDeputyFromFraction();
                        break;
                    }

                    case 8: {
                        VerkhovnaRada.getInstance().getBribeTakersFromFraction();
                        break;
                    }

                    case 9: {
                        VerkhovnaRada.getInstance().getBiggestBribeTakerFromFraction();
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





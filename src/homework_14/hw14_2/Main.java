package homework_14.hw14_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sale commodity = new Sale();

        Scanner sc = new Scanner(System.in);

        boolean next=true;

        while (next) {

            menuConsole();

            switch (sc.nextInt()) {

                case 1: {
                    commodity.add();
                    break;
                }

                case 2: {
                    commodity.remove();
                    break;
                }

                case 3: {
                    commodity.replace();
                    break;
                }

                case 4: {
                    commodity.sortByName();
                    break;
                }

                case 5: {
                    commodity.sortByLength();
                    break;
                }

                case 6: {
                    commodity.sortByWidth();
                    break;
                }

                case 7: {
                    commodity.sortByWeight();
                    break;
                }

                case 8: {
                    commodity.getElementOfCommodity();
                    break;
                }

                case 0: {
                    System.exit(0);
                    next=false;
                    break;
                }

                default: {
                    System.out.println("Enter number from menu!");
                    break;
                }
            }
        }

    }
    public static void menuConsole(){
        System.out.println("Enter 1, to add commodity ");
        System.out.println("Enter 2, to remove commodity");
        System.out.println("Enter 3, to replace commodity");
        System.out.println("Enter 4, to sort by name commodity");
        System.out.println("Enter 5, to sort by length commodity");
        System.out.println("Enter 6, to sort by width commodity");
        System.out.println("Enter 7, to sort by weight commodity");
        System.out.println("Enter 8, to see commodity with specific element");
        System.out.println("Enter 0, for exit");
    }


}


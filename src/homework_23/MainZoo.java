package homework_23;

import java.util.Scanner;
import java.util.function.Supplier;

public class MainZoo {
    public static void main(String[] args) {

        Supplier<Integer> menuZoo = () -> {
            System.out.println("Menu: ");
            System.out.println("Enter 1, to add new member of zooclub");
            System.out.println("Enter 2, to add new animal to member");
            System.out.println("Enter 3, to remove animal from member");
            System.out.println("Enter 4, to remove member from zooclub");
            System.out.println("Enter 5, to remove animal from all members");
            System.out.println("Enter 6, to see the zooclub ");
            System.out.println("Enter 0, to exit");
            Scanner scanner = new Scanner(System.in);
            int menuChoise = scanner.nextInt();

            return menuChoise;
        };

        ZooClub zooClub = new ZooClub();
        while (true) {

            switch (menuZoo.get()) {

                case 1: {
                    zooClub.addPerson();
                    break;
                }
                case 2: {
                    zooClub.addAnimal();
                    break;
                }

                case 3: {
                    zooClub.removeAnimal();
                    break;
                }

                case 4: {
                    zooClub.removePerson();
                    break;
                }

                case 5: {
                    zooClub.removeAnimalFromAll();
                    break;
                }

                case 6: {
                    System.out.println(zooClub.toString());
                    break;
                }

                case 0: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Enter number from 1 to 9 !\n Enter 0 for exit");
                    break;
                }
            }
        }
    }
}


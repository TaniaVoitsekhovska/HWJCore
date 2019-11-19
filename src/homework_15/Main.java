package homework_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zooclub zooClub = new Zooclub();
        Scanner sc = new Scanner(System.in);

         while (true) {
            menu();

            switch (sc.nextInt()) {

                case 1: {
                    zooClub.addMember();
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
                    zooClub.removeMember();
                    break;
                }

                case 5: {
                    zooClub.removeAnimalFromAllMembers();
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
                    System.out.println("Enter number from menu!");
                    break;
                }
            }
        }


    }

    public static void menu(){

        System.out.println("Menu: ");
        System.out.println("Enter 1, to add new member of zooclub");
        System.out.println("Enter 2, to add new animal to member");
        System.out.println("Enter 3, to remove animal from member");
        System.out.println("Enter 4, to remove member from zooclub");
        System.out.println("Enter 5, to remove animal from all members");
        System.out.println("Enter 6, to see the zooclub ");
        System.out.println("Enter 0, to exit");
    }
}

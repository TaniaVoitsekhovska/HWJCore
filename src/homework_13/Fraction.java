package homework_13;

import java.util.*;

public class Fraction implements Comparator<Deputy> {

    private String nameOfFraction;

    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public String getNameOfFraction() {
        return nameOfFraction;
    }

    public void setNameOfFraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    ArrayList<Deputy> deputiesArray = new ArrayList<Deputy>();

    public void addDeputy() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        String surname = scanner.next();

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter age::");
        Integer age = scanner.nextInt();

        System.out.println("Enter height:");
        Integer height = scanner.nextInt();

        System.out.println("Enter weight:");
        Integer weight = scanner.nextInt();

        System.out.println("Does deputy take bribes ? (yes/no):");
        String briber = scanner.next();
        boolean bribeTaker;
        if (briber.equalsIgnoreCase("yes")) {
            bribeTaker = true;
        } else
            bribeTaker = false;

        Deputy deputy = new Deputy(weight, height, surname, name, age, bribeTaker);

        deputiesArray.add(deputy);
        if (deputy.isBribeTaker()) {
            deputy.giveBribe();
        }
        System.out.println("Deputy" + deputy.toString() + " is added to fraction");
    }

    public void removeDeputy() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname of deputy to remove");
        String surname = sc.next();
        System.out.println("Enter name of deputy to remove");
        String name = sc.next();

        boolean doesExist = doesDeputyExist(deputiesArray, surname, name);

        if (doesExist) {
            Iterator<Deputy> iterator = deputiesArray.iterator();
            while (iterator.hasNext()) {
                Deputy next = iterator.next();

                if (next.getSurname().equalsIgnoreCase(surname) && next.getName().equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("Deputy " + next.toString() + " is removed from fraction!");
                }
            }
        } else
            System.out.println("Deputy does not exist!!!");
    }

    public void allBribeTakers() {
        System.out.println("Bribe-Taker from fraction are: ");
        ArrayList<Deputy> bribersArray = new ArrayList<Deputy>();
        Iterator<Deputy> iterator = deputiesArray.iterator();
        while (iterator.hasNext()) {
            Deputy next = iterator.next();
            if (next.isBribeTaker())
                bribersArray.add(next);
        }
        Collections.sort(bribersArray, new Fraction(getNameOfFraction()));
        Iterator<Deputy> iterator1 = bribersArray.iterator();
        while (iterator1.hasNext()) {
            Deputy next = iterator1.next();
            System.out.println(next.toString());
        }
    }

    public void biggestBriber() {
        int value = 0;
        int index = -1;
        for (int i = 0; i < deputiesArray.size(); i++) {
            if (deputiesArray.get(i).isBribeTaker()) {
                if (deputiesArray.get(i).getBribeValue() > value) {
                    value = deputiesArray.get(i).getBribeValue();
                    index = i;
                }
            }
        }
        if (index < 0) {
            System.out.println("There is no bribe-taker in fraction !");
        } else
            System.out.println("The biggest bribe-taker in fraction is " + deputiesArray.get(index).toString() +
                    " the bribe value is " + deputiesArray.get(index).getBribeValue());
    }

    public void allDeputiesOfFraction() {

        System.out.println("The deputies of fraction are: ");
        Collections.sort(deputiesArray, new Fraction(getNameOfFraction()));
        Iterator<Deputy> iterator = deputiesArray.iterator();
        while (iterator.hasNext()) {
            Deputy deputy = iterator.next();
            System.out.println(deputy.toString());
        }
    }

    public void removeAllDeputies() {

        deputiesArray.clear();
        System.out.println("All deputies are removed from fraction!");
    }

    public boolean doesDeputyExist(ArrayList<Deputy> deputies, String surname, String name) {


        boolean exist = false;
        for (Deputy deputy : deputies) {
            if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
                exist = true;
            }
        }
        return exist;
    }

    @Override
    public String toString() {
        return "Fraction ' " + getNameOfFraction() + " ' ";
    }

    @Override
    public int compare(Deputy o1, Deputy o2) {
        if (o1.getSurname().compareTo(o2.getSurname()) != 0) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else {
            if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            } else {
                if (o1.getAge().compareTo(o2.getAge()) != 0) {
                    return o1.getAge().compareTo(o2.getAge());
                } else {
                    if (o1.getHeight().compareTo(o2.getHeight()) != 0) {
                        return o1.getHeight().compareTo(o2.getHeight());
                    } else
                        return o1.getWeight().compareTo(o2.getWeight());
                }
            }
        }
    }
}


package homework_15;

import java.util.*;

public class Zooclub {

    private Map<Person, ArrayList<Animal>> zooClub = new TreeMap<Person, ArrayList<Animal>>();


    public void addMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter age");
        Integer age = sc.nextInt();
        zooClub.put(new Person(name,age), new ArrayList<Animal>());
        System.out.println( "Member is added to zooclub! ");
    }

    public void addAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter age");
        Integer age = sc.nextInt();

        boolean exist = isClubMember(zooClub, name, age);
        if (exist) {
            System.out.println("Enter animal type ");
            String type = sc.next();
            System.out.println("Enter name of animal");
            String name1 = sc.next();

            Animal animal = new Animal(type, name1);

            Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

                if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                    ArrayList<Animal> animalList = nextMember.getValue();

                    animalList.add(animal);
                    System.out.println("Animal " + animal.toString() + "is added to  " + nextMember.getKey() + "!");
                    Collections.sort(animalList, new Animal_Sort());
                }
            }

        } else {
            System.out.println("Member does not exist! ");
        }
        System.out.println(zooClub.toString());

    }

    public void removeAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter age");
        Integer age = sc.nextInt();

        boolean exist = isClubMember(zooClub, name, age);
        if (exist) {
            System.out.println("Enter animal type ");
            String type = sc.next();
            System.out.println("Enter name of animal");
            String name1 = sc.next();
            boolean animalExist = isAnimalExists(zooClub, name, age, type, name1);
            if (animalExist) {

                Animal animal = new Animal(type, name1);
                Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

                    if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                        ArrayList<Animal> animalList = nextMember.getValue();
                        animalList.remove(animal);
                        System.out.println("Animal " + animal.toString() + "is removed from   " + nextMember.getKey() + "!");
                        Collections.sort(animalList, new Animal_Sort());
                    }
                }
            } else {
                System.out.println("Animal does not exist! ");
            }
        } else {
            System.out.println("Member does not exist! ");

        }
        System.out.println(zooClub.toString());
    }

    public void removeMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter age");
        Integer age = sc.nextInt();

        boolean checkMember = isClubMember(zooClub, name, age);
        if (checkMember) {
            Iterator<Map.Entry<Person, ArrayList<Animal>>> entryIterator = zooClub.entrySet().iterator();
            while (entryIterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> entry = entryIterator.next();
                if (entry.getKey().getName().equals(name) && entry.getKey().getAge() == age) {
                    entryIterator.remove();
                    System.out.println("Member " + name + age + " years old is removed!");
                }
            }
        } else
            System.out.println("Member does not exist");
        System.out.println(zooClub.toString());
    }

    public void removeAnimalFromAllMembers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type ");
        String type = sc.next();

        boolean exist = isAnimalTypeExists(zooClub, type);
        if (exist) {
            Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
                ArrayList<Animal> animalList = nextMember.getValue();

                Iterator<Animal> iterator2 = animalList.iterator();
                while (iterator2.hasNext()) {
                    Animal animal = iterator2.next();
                    if (animal.getAnimalType().equalsIgnoreCase(type)) {
                        iterator2.remove();
                        System.out.println("Animal " + animal.toString() + "is removed from   " + nextMember.getKey() + "!");
                    }
                }
            }
        } else
            System.out.println("This type of animal does not exist!");
    }

    public static boolean isClubMember(Map<Person, ArrayList<Animal>> zooClub, String name, Integer age) {

        boolean check = false;

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

            if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                check = true;
            }
        }
        return check;

    }

    static boolean isAnimalExists(Map<Person, ArrayList<Animal>> zooClub, String name, Integer age,
                                  String type, String animalName) {
        boolean check = false;

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

            if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                ArrayList<Animal> animalList = nextMember.getValue();

                Iterator<Animal> iterator2 = animalList.iterator();

                while (iterator2.hasNext()) {
                    Animal next2 = iterator2.next();
                    if (next2.getAnimalType().equalsIgnoreCase(type) && next2.getName().equalsIgnoreCase(animalName)) {
                        check = true;
                    }
                }
            }
        }

        return check;
    }

    static boolean isAnimalTypeExists(Map<Person, ArrayList<Animal>> zooClub, String type) {
        boolean check = false;

        Iterator<Map.Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
            ArrayList<Animal> animalList = nextMember.getValue();
            Iterator<Animal> iterator2 = animalList.iterator();

            while (iterator2.hasNext()) {
                Animal next2 = iterator2.next();
                if (next2.getAnimalType().equalsIgnoreCase(type)) {
                    check = true;
                }
            }
        }
        return check;
    }

    @Override
    public String toString() {
        String text = "The zooclub contains:";
        Set<Map.Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();
        for (Map.Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
            text += "\n" + entry.toString();

        }
        return text;
    }
}

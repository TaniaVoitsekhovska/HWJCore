package homework_23;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ZooClub {

    private Map<Person, ArrayList<Animal>> zooClub = new LinkedHashMap<Person, ArrayList<Animal>>();


    Supplier<Person> newPerson = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();

        return new Person(name, age);
    };
    Supplier<Animal> newAnimal = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type:");
        String animalType = scanner.next();
        System.out.println("Enter name:");
        String name = scanner.next();

        return new Animal(name, animalType);
    };

    public Optional<Person> findPerson() {
        Person person = newPerson.get();

        Predicate<Person> isPerson = person1 -> (person1.getName().equalsIgnoreCase(person.getName())
                && person1.getAge() == person.getAge());
        Optional<Person> personFound = zooClub.keySet().stream().filter(isPerson).findFirst();

        return personFound;
    }


    public void addPerson() {
        Person person = newPerson.get();
        zooClub.put(person, new ArrayList<Animal>());
    }

    public void addAnimal() {
        Optional<Person> optionalPerson = findPerson();

        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            zooClub.get(person).add(newAnimal.get());
        } else {
            System.out.println("There is no such person!");
        }
    }

    public void removeAnimal() {
        Optional<Person> optionalPerson = findPerson();

        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            zooClub.get(person).remove(newAnimal.get());
        } else {
            System.out.println("There is no such person!");
        }
    }

    public void removePerson() {
        Person person = newPerson.get();
        zooClub.remove(person);
    }

    public void removeAnimalFromAll() {
        Scanner sc = new Scanner(System.in);
        String animalTypeToDelete = sc.next();

        boolean check = zooClub.values().stream().anyMatch(arrayList -> arrayList.stream()
                .anyMatch(type -> type.getAnimalType().equalsIgnoreCase(animalTypeToDelete)));
        if (check) {

            zooClub.values().stream().forEach(arrayList -> arrayList.removeAll(
                    arrayList.stream().filter(animal -> animal.getAnimalType().equalsIgnoreCase(animalTypeToDelete))
                            .collect(Collectors.toList()))
            );
        }else
            System.out.println("There is no such type!");
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

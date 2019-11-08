package homework_4.hw4_3;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Lion", 15, 11);
        System.out.println("Name is " + animal.getName() + " . Speed is " + animal.getSpeed() + " .It is " + animal.getAge() +
                " years old");
        animal.setAge(44);
        animal.setName("Turtle");
        animal.setSpeed(2);
        System.out.println("=========AFTER CHANGES=======");
        System.out.println("Name is " + animal.getName() + " . Speed is " + animal.getSpeed() + " .It is " + animal.getAge() +
                " years old");


    }
}

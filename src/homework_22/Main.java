package homework_22;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        {// homework 22/1
            Pet cow = () -> "I am cow: Muuuu muuuuu";
            Pet cat = () -> "I am cat: Miau miau";
            Pet dog = () -> "I am dog: Gav gav";

            System.out.println(cow.voice());
            System.out.println(cat.voice());
            System.out.println(dog.voice());
            System.out.println();
        }

        {//homework22/2
            System.out.println("The result of game:");
            for (int i = 0; i < 5; i++) {
                flipCoin();
            }
        }
        {//homework 22/3

            System.out.println();
            Exponential number = text -> System.out.println(text);

            number.show("float min = " + Float.MIN_VALUE);
            number.show("float max = " + Float.MAX_VALUE);
            number.show("double min = " + Double.MIN_VALUE);
            number.show("double max = " + Double.MAX_VALUE);
            System.out.println();
        }
        {// homework 22/4
            MyConstructor myConstructor = ConstructorShow::new;
            ConstructorShow constructor = myConstructor.create("Oleh");
            System.out.println("Constructor with one parameter: name = " + constructor.getName());
            MyConstructor2 myConstructor2 = ConstructorShow::new;
            ConstructorShow constructor2 = myConstructor2.create("Oleh", 24);
            System.out.println("Constructor with two parameters: name = " + constructor2.getName() + ", age = " + constructor2.getAge());
            System.out.println();
        }

        {// homework 22/5
            Frog frog = text -> System.out.println(text);
            frog.show(Amphibia.eat());
            frog.show(Amphibia.sleep());
            frog.show(Amphibia.swim());
            frog.show(Amphibia.walk());
        }

    }

    public static void flipCoin() {
        int flip = (int) (Math.random() * 2);
        checkSide(flip, num -> num == 1);
    }

    public static void checkSide(int flip, Predicate<Integer> predicate) {
        if (predicate.test(flip)) {
            System.out.println("Eagle");
        } else
            System.out.println("Reel");
    }


}
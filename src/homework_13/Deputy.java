package homework_13;

import java.util.Scanner;

public class Deputy extends Human {

    private String surname;
    private String name;
    private Integer age;
    private boolean isBribeTaker;
    private Integer bribeValue;

    public Deputy(Integer weight, Integer height, String surname, String name, Integer age, boolean isBribeTaker) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.isBribeTaker = isBribeTaker;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return isBribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        isBribeTaker = bribeTaker;
    }

    public Integer getBribeValue() {
        return bribeValue;
    }

    public void setBribeValue(Integer bribeValue) {
        this.bribeValue = bribeValue;
    }

    public void giveBribe() {
        if (!isBribeTaker) {
            System.out.println("This deputy does not take bribes! ");
        } else {
            System.out.println("Enter the value of bribe ");
            Scanner sc = new Scanner(System.in);
            int bribe = sc.nextInt();
            if (bribe > 5000) {
                System.out.println("The police will imprison the deputy");
            } else
                this.bribeValue = bribe;
        }
    }

    @Override
    public String toString() {
        return surname + " " + name + ", " + age + " years old, height is " + super.getHeight() + " sm, weight "
                + super.getWeight() + " kg, ";
    }
}

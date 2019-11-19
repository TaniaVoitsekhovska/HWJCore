package homework_15;


public class Person implements Comparable<Person>{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return name + ", " + age + " years";
    }


    @Override
    public int compareTo(Person o) {
        if (this.getName().equalsIgnoreCase(o.getName())) {
            return this.getAge().compareTo(o.getAge());
        }else
            return this.getName().compareTo(o.getName());
    }
}

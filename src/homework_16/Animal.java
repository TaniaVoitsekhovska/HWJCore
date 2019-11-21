package homework_16;


public class Animal implements Comparable<Animal> {

    private String name;
    private Integer age;
    public int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal o) {
        if(this.name.equalsIgnoreCase(o.name)){
            return this.age.compareTo(o.age);
        }else
        return this.name.compareTo(o.name);
    }
}

package homework_14.hw14_1;

public class Cat implements  Comparable<Cat> {

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
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
    public int compareTo(Cat o) {
        if(this.name.equalsIgnoreCase(o.getName())){
            return this.age.compareTo(o.getAge());
        }else
        return this.name.compareTo(o.getName()) ;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }


}

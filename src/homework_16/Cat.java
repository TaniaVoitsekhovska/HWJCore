package homework_16;

public class Cat extends Animal {

    public String colour;

    public Cat(String name, Integer age, int weight, String colour) {
        super(name, age, weight);
        this.colour = colour;
    }
    public Cat(String name, Integer age, int weight){
        super(name,age,weight);
    }

    public void say(){
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Cat name "+getName()+" is "+getAge()+" old. Weights "+getWeight()+" kg  and is "+colour+" colour." ;
    }
}

package homework_15;


public class Animal  {

    private String animalType;
    private String name;

    public Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return animalType + " \"" + name + "\"";
    }


}

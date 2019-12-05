package homework_21;

public class Book {

    @MyAnnotation(name = "Book name")
    private String name;

    @MyAnnotation(name = "book description")
    private String description;

    @MyAnnotation(name = "book",description = "printed")
    public void print(){
        System.out.println("The book "+name.toUpperCase()+" is printed ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "The book named "+name.toUpperCase()+" is about "+description;
    }
}

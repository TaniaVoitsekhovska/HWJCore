package homework_5.hw5_1;

public class Dog extends Pet{
    private String str=" Woof woof";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void voice(){
        System.out.println("I am a Dog and I say "+str+"\n");

    }
}

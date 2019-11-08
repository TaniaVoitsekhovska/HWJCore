package homework_5.hw5_1;

public class Cat extends Pet {

    private String str=" Miau miau";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void voice(){
        System.out.println("I am a Cat and I say "+str+"\n");

    }
}

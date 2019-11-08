package homework_5.hw5_1;

public class Cow extends Pet {

    private String str=" Moooooooo";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void voice(){
        System.out.println("I am a Cow and I say "+str+"\n");

    }
}

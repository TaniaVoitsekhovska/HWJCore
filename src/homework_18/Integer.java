package homework_18;

public class Integer {

   private String integer;


    public Integer(String integer) {
        this.integer = integer;
    }

    public String getInteger() {
        return integer;
    }

    public void setInteger(String integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "\n "+integer;
    }
}

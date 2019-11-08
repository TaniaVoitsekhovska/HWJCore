package homework_8_and_9.hw9_2;

public class Methods {

    private static double first;
    private static double second;

    public Methods(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public double addition()throws MyException{
        Methods.check();
        return first+second;

    }
    public double subtraction()throws MyException{
        Methods.check();
        return first-second;

    }
    public double multiplication()throws MyException{
        Methods.check();
        return first*second;

    }
    public double division()throws MyException{
        Methods.check();
        return first/second;

    }
    static void showResult(double result) {
        System.out.printf("%nThe result is %.2f", result);
    }


    static void check() throws MyException{
        if((first<0&&second<0)||(first==0&&second==0)){
            throw new IllegalArgumentException();
        }
        if(first==0&&second==0){
            throw new IllegalAccessError();
        }
        if((first==0&&second!=0)||(first!=0&&second==0)){
            throw new ArithmeticException();
        }
        if(first>0&&second>0){
            throw new MyException(" Error");
        }

    }
}

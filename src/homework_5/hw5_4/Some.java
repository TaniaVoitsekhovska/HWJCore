package homework_5.hw5_4;

public class Some {

    int a;
    int b;
    int c;

    Some(int a) {
        this.a = a;

    }

    Some(int a, int b) {
        this(a);
        this.b = b;
    }

    Some(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

}

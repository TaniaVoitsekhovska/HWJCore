package homework_12.hw12_3;

public class Main {

    public static void main(String[] args) {

        MyArrayList array = new MyArrayList();
        MyArrayList array2 = new MyArrayList(10);

        array.add("Hello 1");
        array.add("Hello 2");
        array.add("Hello 3");
        array.add("Hello 4");
        array.add("Hello 5");
        System.out.println(array.toString());
        array.add("Hello 6");
        array.add("Hello 7");

        System.out.println(array.toString());

        array2.add("Hello 1");
        array2.add("Hello 2");
        array2.add("Hello 3");
        array2.add("Hello 4");
        array2.add("Hello 5");
        array2.add("Hello 6");
        array2.add("Hello 7");
        array2.add("Hello 8");
        array2.add("Hello 9");
        array2.add("Hello 10");
        System.out.println(array2.toString());
        array2.remove(5);
        System.out.println(array2.toString());
        array2.remove(1);
        System.out.println(array2.toString());


    }


}

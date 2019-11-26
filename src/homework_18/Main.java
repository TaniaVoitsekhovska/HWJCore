package homework_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        MyMap<java.lang.Integer,List<java.lang.Integer>> map=
                new MyMap<>(25,new ArrayList<java.lang.Integer>( Arrays.asList(new java.lang.Integer(55))));

        map.addNewObject(21,Arrays.asList(new java.lang.Integer(33)));
        map.addNewObject(1,Arrays.asList(new java.lang.Integer(11)));
        map.addNewObject(7,Arrays.asList(new java.lang.Integer(4)));
        map.addNewObject(27,Arrays.asList(new java.lang.Integer(32)));
        map.addNewObject(14,Arrays.asList(new java.lang.Integer(2)));

        map.showMap();
        map.showKeys();
        map.showValues();
        System.out.println();

        map.removeByKey(7);
        map.removeByKey(27);
        System.out.println("After removing by key:");
        map.showMap();
        System.out.println();

        System.out.println("After removing by value:");
        map.removeByValue(Arrays.asList(new java.lang.Integer(55)));
        System.out.println();
        map.showMap();



        //String can be put into List<Integer> if create new class Integer

        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(new Integer("hello,"));
        arrayList.add(new Integer("it's"));
        arrayList.add(new Integer("not"));
        arrayList.add(new Integer("funny!"));
        System.out.println();
        System.out.println("My List))");
        System.out.println( arrayList.toString());


    }


}

package homework_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        MyMap<Integer,List<Integer>> map=
                new MyMap<>(25,new ArrayList<Integer>( Arrays.asList(new Integer(55))));

        map.addNewObject(21,Arrays.asList(new Integer(33)));
        map.addNewObject(1,Arrays.asList(new Integer(11)));
        map.addNewObject(7,Arrays.asList(new Integer(4)));
        map.addNewObject(27,Arrays.asList(new Integer(32)));
        map.addNewObject(14,Arrays.asList(new Integer(2)));

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
        map.removeByValue(Arrays.asList(new Integer(55)));
        System.out.println();
        map.showMap();





        List<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(6));
        arrayList.add(new Integer(11));
        arrayList.add(new Integer(0));
        addToList(arrayList);
        System.out.println( arrayList.toString());


    }

    public static void addToList(List list){
        list.add("Hello, I am String!");
    }


}

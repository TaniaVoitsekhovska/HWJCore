package homework_11.hw11_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int length = sc.nextInt();
        System.out.println("Enter min value of array ");
        int minNum = sc.nextInt();
        System.out.println("Enter max value of array ");
        int maxNum = sc.nextInt();
        if (maxNum <= minNum) {
            System.out.println("Enter max value of array bigger than min value ");
            maxNum = new Scanner(System.in).nextInt();
        }
        Integer[] array = new Integer[length];
        Random value = new Random(maxNum);
        for (int i = 0; i < array.length; i++) {
            array[i] = value.nextInt((maxNum - minNum + 1) + minNum);
        }
        System.out.println("your array is: " + Arrays.toString(array) + "\n");
        System.out.println("After sorting from min to max : \n");
        Arrays.sort(array, 0, array.length - 1);
        System.out.println(Arrays.deepToString(array));
        System.out.println();
        System.out.println("After sorting from max to min : \n");
        List<Integer> revers = Arrays.asList(array);
        Collections.reverse(revers);
        System.out.println(Arrays.deepToString(array));


    }
}

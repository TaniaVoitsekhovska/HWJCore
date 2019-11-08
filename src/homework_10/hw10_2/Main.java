package homework_10.hw10_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Please, enter some text ");
        String text=sc.nextLine();
        System.out.println(change(text));
    }

    static String change(String text1){

        String newText;
        char[] textArray=text1.toCharArray();
        char[] vowel={'a','e','i','o','u','y','A','E','I','O','U','Y'};

        for (int i = 0; i <textArray.length ; i++) {
            for (int j = 0; j <vowel.length ; j++) {
                if(textArray[i]==vowel[j])
                    textArray[i]='-';
            }
        }
        newText=new String(textArray);

        return  newText;
    }
}

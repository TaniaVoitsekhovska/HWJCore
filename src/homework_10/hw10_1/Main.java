package homework_10.hw10_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter word with 5 letters ");
        String entered = sc.next();
        if (entered.length() == 5) {
            String[] wordArray = entered.split("");
            if (wordArray[0].equalsIgnoreCase(wordArray[4]) && wordArray[1].equalsIgnoreCase(wordArray[3])) {
                System.out.println("Your word " + entered + " is palindrome. ");
            } else
                System.out.println("Your word " + entered + " is NOT palindrome! ");
        } else
            System.out.println("Word does not consists of 5 letters !");

    }


}

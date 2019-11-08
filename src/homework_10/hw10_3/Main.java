package homework_10.hw10_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter some sentence ");
        String sentence= sc.nextLine();
        System.out.println("Enter some text ");
        String text= sc.nextLine();
        System.out.println("The number of words in your sentence is "+ wordCount(sentence));
        System.out.println("The number of sentences in your text is "+sentenceCount(text));
        System.out.println(wordToFind(sentence));
        System.out.println(wordToFind(text));
    }
    static int wordCount(String sentence){
        int count=0;
        sentence.replaceAll("[.,:;!?@#$%^*(){}«»]","");
        String[]words=sentence.split(" ");
        count=words.length;
        return count;
    }
    static int sentenceCount(String text){
        int count;
       text.replace("!",".");
        text.replace("?",".");
        String[]sentence=text.split("\\. ");
        count=sentence.length;
        return count;
    }
    static String wordToFind(String text){
        String word;
        text.replaceAll("[.,:;!?@#$%^*(){}«»]","");
        String[]array=text.split(" ");
        int num=array.length;
        Integer []count =new Integer[num];
        for (int i = 0; i <array.length ; i++) {
            count[i]=0;
            for (int j = 0; j <array.length ; j++) {
                if(array[i].equalsIgnoreCase(array[j])){
                    count[i]++;
                }
            }
        }
        int max=0;
        for (int i = 0; i <count.length ; i++) {
            if(count[i]>max){
                max=i;
            }
        }
        word="Word "+array[max]+" is most times mentioned "+max;

        return word;
    }
}

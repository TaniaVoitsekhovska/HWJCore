package homework_12.hw12_3;

import java.util.Arrays;


public class MyArrayList {

    private String[] text;
    private int index;

    public MyArrayList() {
        this.index = 5;
        this.text = new String[index];
    }

    public MyArrayList(int index) {

        this.index = index;
        this.text = new String[index];
    }

    public void add(String textToAdd) {

        int size = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != null) {
                size++;
            }
        }
        if ((size + 1) > text.length) {
            String[] newText = new String[text.length + 1];

            for (int i = 0; i < text.length; i++) {
                newText[i] = text[i];
            }

            text = newText;
            index = text.length;
        }

        text[size++] = textToAdd;
    }

    public String remove(int indexToRemove) {

        String removedIndex = text[indexToRemove];
        String[] newText = new String[text.length - 1];

        int newIndex = 0;
        for (int i = 0; i < text.length; ) {
            if (text[i].equalsIgnoreCase(removedIndex)) {
                i++;
            } else {
                newText[newIndex] = text[i];
                newIndex++;
                i++;
            }
        }
        text = newText;
        index = newText.length;
        return removedIndex;
    }

    @Override
    public String toString() {
        return "MyArrayList [text array" + Arrays.toString(text) + ", size=" + index + "]";
    }
}



package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                 break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(startsWith(new char[]{'H', 'e', 'l', 'l'}, new char[]{'H', 'I', 'l'}));
    }
}

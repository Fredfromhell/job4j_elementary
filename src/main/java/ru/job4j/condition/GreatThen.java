package ru.job4j.condition;

public class GreatThen {
    public static boolean check(int first, int second) {
        return first < second;
    }

    public static void main(String[] args) {
        System.out.println(check(2, 6));
    }
}

package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean big = left > right;
        int result = big ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(30, 20);
        System.out.println(msg);
    }
}

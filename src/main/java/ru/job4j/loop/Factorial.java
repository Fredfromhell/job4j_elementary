package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int factor = 1; factor <= n; factor++) {
            result = factor * result;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(calc(5));

    }
}
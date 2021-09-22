package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = 0;
        while (a <= b) {
            result += a;
            a = a + 2;

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }
}


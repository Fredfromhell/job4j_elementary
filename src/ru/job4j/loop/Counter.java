package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int cycle;
        for (cycle = start; cycle <= finish; cycle++) {
            sum = sum + cycle;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        int cycle;
        for (cycle = start; cycle <= finish; cycle++) {
            if (cycle % 2 == 0) {
                sum = sum + cycle;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(0, 5));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}

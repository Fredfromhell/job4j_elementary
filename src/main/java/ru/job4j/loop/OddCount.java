package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 > 0) {
                sum += 1;

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(count(1, 3));
    }
}


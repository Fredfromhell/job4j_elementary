package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        for (int i = a; i <= b; i++) {
            a = i * a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(mult(1,3));
    }
}

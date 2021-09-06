package ru.job4j.array;

public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        return a.length + b.length;
    }

    public static void main(String[] args) {
        System.out.println(combineSize(new int[5], new int[3]));
    }
}

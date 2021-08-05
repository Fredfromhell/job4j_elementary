package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean rsl = true;
        if (left[left.length - 1] != right[right.length - 1]) {
            rsl = false;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    }

}
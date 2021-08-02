package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] autoIndex = new int[5];
        for (int index = 0; index < autoIndex.length; index++) {
            autoIndex[index] = index * 2 + 3;
        }
        for (int index = 0; index < autoIndex.length; index++) {
            System.out.println(autoIndex[index]);

        }
    }
}

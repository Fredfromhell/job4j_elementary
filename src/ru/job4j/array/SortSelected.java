package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        for (int result : sort(new int[]{5, 1, 3, 2, 4, 7, 10, 9, 8, 6})) {
            System.out.println(result);
        }

    }
}

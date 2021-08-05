package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf2(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;

            }

        }
        return rst;
    }

    public static void main(String[] args) {
        System.out.println(indexOf2(new int[]{1, 2, 3, 4, 5}, 3, 2, 5));
    }
}



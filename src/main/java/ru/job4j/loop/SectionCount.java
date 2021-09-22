package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int result = 0;
        while (length >= section) {
            length = length - section;
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(count(4, 2));
    }
}

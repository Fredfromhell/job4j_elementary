package ru.job4j.loop;

public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            int sum = price * i;
            System.out.println(sum);

        }
    }

        public static void main(String[] args) {
        SweetPrice.out(10);
    }
}

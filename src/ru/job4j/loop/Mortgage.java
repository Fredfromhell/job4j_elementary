package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double total = amount + (amount * (percent / 100));
        while (total > 0) {
            total = (total - salary);
            total = total * (percent / 100) + total;
            year = year + 1;
        }
        return year;
    }

    public static void main(String[] args) {

        System.out.println(year(100, 70, 50));
    }
}

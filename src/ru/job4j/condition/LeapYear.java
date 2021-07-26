package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }

        return false;

    }


    public static void main(String[] args) {
        System.out.println(LeapYear.checkYear(2019));
    }
}
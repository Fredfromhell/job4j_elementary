package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[10500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Lex Luthor";
        names[2] = "Alexey Bespalov";
        names[3] = "Ekaterina Bespalova";
        System.out.println("Размер массива равен ages: " + ages.length);
        System.out.println("Размер массива равен surnames: " + surnames.length);
        System.out.println("Размер массива равен prices: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}



package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a+b+c)/2;
        double result1 = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(result1);
        return s;
    }

    public static void main(String[] args) {
        double result1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result1 );
    }
}

package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h1 = k+1;
        double h2 = h1*2;
        double h3 = p/h2;
        double L = h3*k;
        double result1 = L*h3;
        return result1;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

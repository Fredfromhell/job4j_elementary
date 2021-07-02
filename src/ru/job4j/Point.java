package ru.job4j.condition;

public class Point {
        public static double distance(int x1, int y1, int x2, int y2) {
            double minus1 = x2 - x1;
            double minus2 = y2 - y1;
            double stepen1 = Math.pow(minus1, 2);
            double stepen2 = Math.pow(minus2, 2);
            double summastepen = stepen1 + stepen2;
            return Math.sqrt(summastepen);
        }

        public static void main(String[] args) {
            double result = Point.distance(6, 100, 10, 300);
            System.out.println("result (6, 100) to (10, 200) " + result);

        }
}

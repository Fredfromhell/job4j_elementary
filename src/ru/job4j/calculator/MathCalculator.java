package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double vi4itanieAndDelenie(double first, double second) {
        return vi4itanie(first, second) + delenie(first, second);

    }

    public static double summaVseh4etirehMetodov(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + vi4itanie(first, second) + delenie(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + vi4itanieAndDelenie(100, 20));
        System.out.print("Результат расчета равен: " + summaVseh4etirehMetodov(100, 20));
    }

}


package ru.job4j;

public class Converter {
    
    public static final float DOLLAR = 60;
    public static final float EURO = 70;

    public static float rubleToEuro(float value) {
        return value / EURO;
    }

    public static float rubleToDollar(float value) {
        return value / DOLLAR;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(3500000);
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        float in2 = 3500000;
        float expected2 = (float) 58333.332;
        float out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are " + euro + " euro." + " Test result: " + passed);
        System.out.println("3500000 rubles are " + dollar + " dollar " + " Test result: " + passed2);
    }
}


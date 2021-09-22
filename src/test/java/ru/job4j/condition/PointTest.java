package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void test1() {
        double expected = 200.04;
        int x1 = 6;
        int y1 = 100;
        int x2 = 10;
        int y2 = 300;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void test2() {
        double expected = 200.02;
        int x1 = 7;
        int y1 = 100;
        int x2 = 10;
        int y2 = 300;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void test3() {
        double expected = 200.01;
        int x1 = 8;
        int y1 = 100;
        int x2 = 10;
        int y2 = 300;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
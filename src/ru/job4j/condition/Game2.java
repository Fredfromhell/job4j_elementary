package ru.job4j.condition;

public class Game2 {
    public static int checkGame(double percent, int prize, int pay) {
        return percent * prize > pay ? (int) ((percent * prize) - pay) : 0;
    }

    public static void main(String[] args) {
        System.out.println(Game2.checkGame(1, 5, 5));
    }
}

package ru.leqsle.labs;
import java.io.IOException;

public class FirstLab extends Lab {
    double x, y;

    public FirstLab() throws IOException {
        super(1);
    }

    public void tasks() {
        taskOne();
        taskTwo();
    }

    private void taskOne() {
        System.out.println("Задача 1. Вычисление выражения");
        x = input.getDouble("Введите значение x");
        y = 5 * Math.pow(x, 3) * Math.pow((1 / Math.pow(x, 2) + 1 / Math.pow(x, 3)), 0.2);
        System.out.println("Результат: " + y + "\n");
    }

    private void taskTwo() {
        System.out.println("Задача 2. Принадлежит ли точка заштрихованной области");
        x = input.getDouble("Введите координату x");
        y = input.getDouble("Введите координату y");
        boolean result = (y <= 5 - x && y <= x + 5 && y >= 1.4 * x - 7) ^ (y < 0 && x < 0);
        System.out.println("Результат логического выражения: " + result);
    }
}

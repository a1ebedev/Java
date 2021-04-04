package ru.leqsle.labs;

import ru.leqsle.interaction.Commands;
import ru.leqsle.interaction.Input;
import ru.leqsle.interaction.Output;

import java.io.IOException;

public class FirstLab {
    Commands input = new Input();
    double x, y;

    public FirstLab() throws IOException {
        System.out.println("Лабораторная работа 1. Вариант 20");
        taskOne();
        taskTwo();
        Output.pause();
    }

    private void taskOne() throws IOException {
        System.out.println("Задача 1. Вычисление выражения");
        x = input.getDouble("Введите значение x");
        y = 5 * Math.pow(x, 3) * Math.pow((1 / Math.pow(x, 2) + 1 / Math.pow(x, 3)), 0.2);
        System.out.println("Результат: " + y + "\n");
    }

    private void taskTwo() throws IOException {
        System.out.println("Задача 2. Принадлежит ли точка заштрихованной области");
        x = input.getDouble("Введите координату x");
        y = input.getDouble("Введите координату y");
        boolean result = (y <= 5 - x && y <= x + 5 && y >= 1.4 * x - 7) ^ (y < 0 && x < 0);
        System.out.println("Результат логического выражения: " + result);
    }

}

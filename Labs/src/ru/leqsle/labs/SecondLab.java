package ru.leqsle.labs;

import java.io.IOException;

public class SecondLab extends Lab{
    private int n;
    private int result = 0;
    private int sum = 0;

    public SecondLab() throws IOException {
        super(2);
    }

    public void tasks() {
        taskOne();
        taskTwo();
    }

    private void taskOne() {
        System.out.println("Задача 1. Дана последовательность из n целых чисел. Найти сумму элементов с четными номерами.");

        n = input.getInt("Введите количество элементов последовательности");
        for (int i = 1; i <= n; i++) {
            int x = input.getInt("Введите число " + i);
            if (i % 2 == 0) sum += x;
        }

        System.out.println("Сумма элементов с четными номерами: " + sum);
        System.out.println();

    }

    private void taskTwo() {
        int count = 1;

        System.out.println("Задача 2. Последовательность целых чисел, за которой 0. Найти номер мин. элемента этой последовательности");

        do {
            n = input.getInt("Введите число " + count + " (0 = выход)");
            if (n <= sum && n != 0) {
                sum = n;
                result = count;
            }
            count = count + 1;
        }
        while (n != 0);

        System.out.println(result + "-е введенное число со значением " + sum + " минимально");
    }
}

package ru.leqsle.labs.labTwo;

import ru.leqsle.labs.Task;

import java.io.IOException;

public class TaskOne extends Task {
    private int size;
    private int sum;

    public TaskOne() throws IOException {
        super(1, "Дана последовательность из n целых чисел. Найти сумму элементов с четными номерами.");

    }

    public void body() {
        size = input.getInt("Введите количество элементов последовательности");
        for (int i = 1; i <= size; i++) {
            int value = input.getInt("Введите число " + i);
            if (i % 2 == 0) sum += value;
        }
        System.out.println("Сумма элементов с четными номерами: " + sum);
    }
}

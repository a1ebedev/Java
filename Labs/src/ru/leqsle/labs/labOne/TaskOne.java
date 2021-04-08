package ru.leqsle.labs.labOne;

import ru.leqsle.labs.Task;

import java.io.IOException;

class TaskOne extends Task {
    private double x = 0, y = 0;
    public TaskOne() throws IOException {
        super(1, "Вычисление выражения");
    }

    public void body() {
        x = input.getDouble("Введите значение x");
        y = 5 * Math.pow(x, 3) * Math.pow((1 / Math.pow(x, 2) + 1 / Math.pow(x, 3)), 0.2);
        System.out.println("Результат: " + y + "\n");
    }
}

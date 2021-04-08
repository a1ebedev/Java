package ru.leqsle.labs.labOne;

import ru.leqsle.labs.Task;

import java.io.IOException;

class TaskTwo extends Task {
    private double x, y;

    public TaskTwo() throws IOException {
        super(2, "Принадлежит ли точка заштрихованной области");
    }

    public void body() {
        x = input.getDouble("Введите координату x");
        y = input.getDouble("Введите координату y");
        boolean result = (y <= 5 - x && y <= x + 5 && y >= 1.4 * x - 7) ^ (y < 0 && x < 0);
        System.out.println("Результат логического выражения: " + result);
    }

}

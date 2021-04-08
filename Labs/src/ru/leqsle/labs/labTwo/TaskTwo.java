package ru.leqsle.labs.labTwo;

import ru.leqsle.labs.Task;

import java.io.IOException;

public class TaskTwo extends Task {
    private int size;
    private int sum;
    private int result;
    private int count = 1;

    public TaskTwo() throws IOException {
        super(2, "Последовательность целых чисел, за которой 0. Найти номер мин. элемента этой последовательности");
    }

    public void body() {
        do {
            size = input.getInt("Введите число " + count + " (0 = выход)");
            if (size <= sum && size != 0) {
                sum = size;
                result = count;
            }
            count = count + 1;
        }
        while (size != 0);

        System.out.println(result + "-е введенное число со значением " + sum + " минимально");
    }
}

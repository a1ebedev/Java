package ru.leqsle.labs.labTwo;

import ru.leqsle.labs.Task;
import ru.leqsle.ui.Get;
import ru.leqsle.ui.Input;

import java.io.IOException;

public class TaskTwo extends Task {
    private Input input;
    private int size;
    private int sum;
    private int result;
    private int count;
    private int quit;

    public TaskTwo() throws IOException {
        super(2, "Последовательность целых чисел, за которой 0. Найти номер мин. элемента этой последовательности");
    }

    public void body() {
        input = new Get();
        quit = 0;
        count = 1;
        result = 0;
        sum = 999;

        do {
            size = input.getInt("Введите число " + count + " (" + quit + " = выход)");
            if (size <= sum && size != quit) {
                sum = size;
                result = count;
            }
            count++;
        }
        while (size != quit);

        System.out.println(result + "-е введенное число со значением " + sum + " минимально");
    }
}

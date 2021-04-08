package ru.leqsle.labs.labFive;

import ru.leqsle.labs.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class TaskOne extends Task {
    private ArrayList<Integer> numbers;
    private Random rand;
    private int size;

    public TaskOne() throws IOException {
        super(1, "Динамический массив (ArrayList в Java)");
    }

    public void body() {
        numbers = new ArrayList<>();
        rand = new Random();

        System.out.println("Сформируем массив, применив ДСЧ");
        size = input.getInt("Введите длину массива");

        for (int i = 0; i < size; i++) {
            int x = rand.nextInt() % 100 - 25;
            numbers.add(x);
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Удалим из массива элемент");
        size = input.getInt("Введите значение");
        numbers.remove(Integer.valueOf(size));

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

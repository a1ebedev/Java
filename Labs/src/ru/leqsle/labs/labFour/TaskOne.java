package ru.leqsle.labs.labFour;

import ru.leqsle.labs.Task;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;

import java.io.IOException;

public class TaskOne extends Task {
    private NumbersList numArray;

    public TaskOne() throws IOException {
        super(1, "Удаление четных элементов из одномерного массива");
    }

    public void body() throws IOException {
        numArray = new NumArray();

        System.out.println("Сформируем одномерный массив, используя ДСЧ");
        int size = input.getInt("Введите длину массива");
        numArray.random(size);
        numArray.print();
        menu.pause();

        System.out.println("Удалим элементы с четными номерами");

        for (int i = numArray.size() - 1; i >= 0; i--) {
            if (numArray.get(i) % 2 == 0) numArray.remove(i);
        }
        numArray.print();
    }
}

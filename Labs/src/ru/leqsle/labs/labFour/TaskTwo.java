package ru.leqsle.labs.labFour;

import ru.leqsle.labs.Task;
import ru.leqsle.myArrays.DoubleArray;

import java.io.IOException;

public class TaskTwo extends Task {
    private DoubleArray doubleArray;

    public TaskTwo() throws IOException {
        super(2, "Двумерный массив и работа с ним");
    }

    public void body() {
        doubleArray = new DoubleArray();

        System.out.println("Сформируем двумерный массив, используя ДСЧ");
        int strings = input.getInt("Количество строк");
        int columns = input.getInt("Количество столбцов");
        doubleArray.random(strings, columns);
        doubleArray.print();


        System.out.println("Сдвинем нечетные строки матрицы влево на К элементов");
        int k = input.getInt("Введите К");
        doubleArray.moveLeft(k);
        doubleArray.print();
    }
}

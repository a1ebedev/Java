package ru.leqsle.labs;

import ru.leqsle.ui.Output;

import java.io.IOException;
import java.util.*;

public class FifthLab extends Lab{

    private int strings;
    private int columns;
    private int size;

    public FifthLab() throws IOException {
        super(5);

    }

    public void tasks() throws IOException {
        taskOne();
        taskTwo();
        taskThird();
        taskFourth();
    }
    private void taskOne() throws IOException {
        System.out.println("Сформируем массив через arrayList, применив ДСЧ");
        size = input.getInt("Введите длину массива");

        for (int i = 0; i < size; i++) {
            int x = rand.nextInt() % 100 - 25;
            numbers.add(x);
        }

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        Output.pause();
    }

    private void taskTwo() throws IOException {
        System.out.println("Удалим из массива элемент");
        size = input.getInt("Введите значение");
        numbers.remove(Integer.valueOf(size));

        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        Output.pause();

    }


    private void taskThird() throws IOException {
        System.out.println("Сформируем двумерный ArrayList, применив ДСЧ");
        strings = input.getInt("Количество строк");
        columns = input.getInt("Количество столбцов");

        for (int i = 0; i < strings; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                int x = rand.nextInt() % 100 - 25;
                list.get(i).add(x);
            }
        }

        for (List<Integer> i : list) {
            System.out.print(i + "\n");
        }
        Output.pause();
    }

    private void taskFourth() throws IOException {
        System.out.println("Добавим строки после каждой четной строки");

        for (int i = 2; i < strings; i += 2) {
            list.add(i, new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                int x = rand.nextInt() % 100 - 25;
                list.get(i).add(x);
            }
        }

        for (List<Integer> i : list) {
            System.out.print(i + "\n");
        }
        Output.pause();
    }
}

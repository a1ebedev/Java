package ru.leqsle.labs.labThree;

import ru.leqsle.labs.Task;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;

import java.io.IOException;

public class Tasks extends Task {
    private NumbersList numArray;
    private int min;
    private int minValue;

    public Tasks() throws IOException {
        super();
    }

    public void body() throws IOException {
        numArray = new NumArray();



        int n = input.getInt("Формирование массива. Введите длину массива");
        numArray.random(n);
        numArray.print();
        menu.pause();

        min  = numArray.get("min");
        minValue = numArray.get(min);

        System.out.printf("\nМинимальное [%d:%d]. Удалим его\n", min, minValue);
        numArray.remove(min);
        numArray.print();
        menu.pause();

        System.out.println("\nДобавление нового элемента");
        int size = numArray.size();
        boolean ok;
        int index;

        do {
            index = input.getInt("Введите индекс (0-" + size + ")");
            try {
                if (index < 0 || index > numArray.size()) {
                    throw new Exception();
                } else ok = true;
            } catch (Exception e) {
                ok = false;
                System.out.println("Неверный индекс!");
            }
        } while (!ok);


        int value = input.getInt("Введите значение");
        numArray.add(index, value);
        numArray.print();
        menu.pause();

        int min = numArray.get("min");
        int minValue = numArray.get(min);
        int max = numArray.get("max");
        int maxValue = numArray.get(max);

        System.out.printf("\nМинимальное [%2d:%4d], Максимальное [%2d:%4d], Поменяем их местами\n", min, minValue, max, maxValue);

        numArray.replace(min, maxValue);
        numArray.replace(max, minValue);

        numArray.print();
        menu.pause();

        int average = numArray.get("average");
        System.out.printf("Элемент равный среднему арифметическому элементов массива [%3d]", average);
        System.out.println();
        menu.pause();

        System.out.println("Проведем сортировку методом простого выбора");
        numArray.sort();
        numArray.print();
    }
}

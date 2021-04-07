package ru.leqsle.labs;

import ru.leqsle.ui.Output;

import java.io.IOException;


public class ThirdLab extends Lab {


    public ThirdLab() throws IOException {
        super(3);

    }

    public void tasks() throws IOException {
        taskOne();
        taskTwo();
        taskThird();
        taskFourth();
        taskFifth();
        taskSixth();
    }

    private void taskOne() throws IOException {
        System.out.println("Формирование массива с помощью ДСЧ");
        int n = input.getInt("Введите длину массива");
        numArray.random(n);
        numArray.print();
        Output.pause();
    }

    private void taskTwo() throws IOException {
        int min = numArray.get("min");
        int minValue = numArray.get(min);
        System.out.printf("\nМинимальное %2d[%4d]. Удалим его\n", min, minValue);
        numArray.remove(min);
        numArray.print();
        Output.pause();
    }

    private void taskThird() throws IOException {
        System.out.println("\nДобавление нового элемента");
        int size = numArray.size();
        boolean ok;
        int index;

        do {
            index = input.getInt("Введите индекс (0-" + size + ")");
            try {
                if(index < 0 || index > numArray.size()) {
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
        Output.pause();

    }


    private void taskFourth() throws IOException {
        int min = numArray.get("min");
        int minValue = numArray.get(min);
        int max = numArray.get("max");
        int maxValue = numArray.get(max);

        System.out.printf("\nМинимальное [%2d:%4d], Максимальное [%2d:%4d], Поменяем их местами\n", min, minValue, max, maxValue);

        numArray.replace(min, maxValue);
        numArray.replace(max, minValue);

        numArray.print();
        Output.pause();
    }

    private  void taskFifth() {
        int average = numArray.get("average");
        System.out.printf("Элемент равный среднему арифметическому элементов массива [%3d]", average);
        System.out.println();

    }

    private void taskSixth() {
        System.out.println("Проведем сортировку методом простого выбора");
        numArray.sort();
        numArray.print();
    }
}

package ru.leqsle.labs;

import ru.leqsle.interaction.Output;

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
        int index = input.getInt("Введите индекс (0-" + size + ")");
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

    private void taskFifth() {
        System.out.println("Проведем сортировку методом простого выбора");
        numArray.sort();
        numArray.print();
    }
}

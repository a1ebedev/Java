package ru.leqsle.labs;

import ru.leqsle.interaction.Input;
import ru.leqsle.interaction.Output;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;

import java.io.IOException;
import java.util.Random;

public class ThirdLab {
    private Input input = new Input();
    private Random rand = new Random();
    private NumbersList numArray = new NumArray();

    public ThirdLab() throws IOException {
        System.out.println("Лабораторная работа 3");
        taskOne();
        taskTwo();
        taskThird();
        taskFourth();
        taskSixth();

    }

    private void taskOne() throws IOException {
        System.out.println("Формирование массива с помощью ДСЧ");
        int n = input.getInt("Введите длину массива");

        for (int i = 0; i < n; i++) {
            int x = rand.nextInt() % 100 - 25;
            numArray.add(i, x);
        }
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

        System.out.printf("\nМинимальное %2d[%4d], Максимальное %2d[%4d]\n", min, minValue, max, maxValue);
        System.out.println("Поменяем их местами");

        numArray.replace(min, maxValue);
        numArray.replace(max, minValue);

        numArray.print();
        Output.pause();
    }

    private void taskSixth() throws IOException {
        System.out.println("Проведем сортировку методом простого выбора");
        numArray.sort();
        numArray.print();
        Output.pause();
    }
}

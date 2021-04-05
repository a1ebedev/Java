package ru.leqsle.labs;

import ru.leqsle.interaction.Input;
import ru.leqsle.interaction.Output;
import ru.leqsle.myArrays.DoubleArray;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;

import java.io.IOException;

public class FourthLab {
    private Input input = new Input();
    private NumbersList numArray = new NumArray();
    private DoubleArray doubleArray = new DoubleArray();

    public FourthLab() throws IOException {
        System.out.println("Лабораторная работа 4");
        taskOne();
        taskTwo();
        taskThird();
        taskFourth();
    }

    private void taskOne() throws IOException {
        System.out.println("Сформируем одномерный массив, используя ДСЧ");
        int n = input.getInt("Введите длину массива");
        numArray.random(n);
        numArray.print();
        Output.pause();
    }

    private void taskTwo() throws IOException {
        System.out.println("Удалим элементы с четными номерами");

        for(int i = numArray.size() - 1; i >= 0; i--) {
            if(numArray.get(i)%2 == 0) numArray.remove(i);
        }
        numArray.print();
        Output.pause();

    }

    private void taskThird() throws IOException {
        System.out.println("Сформируем двумерный массив, используя ДСЧ");
        int strings = input.getInt("Количество строк");
        int columns = input.getInt("Количество столбцов");
        doubleArray.random(strings,columns);
        doubleArray.print();
        Output.pause();
    }

    private void taskFourth() throws IOException {
        System.out.println("Сдвинем нечетные строки матрицы влево на К элементов");
        int k = input.getInt("Введите К");
        doubleArray.moveLeft(k);
        doubleArray.print();
        Output.pause();
    }
}

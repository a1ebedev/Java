package ru.leqsle.myArrays;

import java.util.Random;

public class NumArray implements NumbersList {

    private int[] array;
    private Random rand = new Random();

    public NumArray() {
        array = new int[0];
    }

    @Override
    public void random(int length) {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            int x = rand.nextInt() % 100 - 25;
            array[i] = x;
        }
    }

    @Override
    public void add(int index, int value) {
        int[] temp = array;
        array = new int[temp.length + 1];

        for (int i = 0; i < temp.length; i++)
            array[i] = temp[i];
        array[index] = value;
        for (int i = index; i < temp.length; i++)
            array[i + 1] = temp[i];
    }

    @Override
    public void remove(int index) {
        int[] temp = array;
        array = new int[temp.length - 1];

        for (int i = 0; i < index; i++) {
            array[i] = temp[i];
        }
        for (int i = index; i < array.length; i++) {
            array[i] = temp[i + 1];
        }
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                remove(i);
                break;
            }
        }
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int get(String s) {
        int indexMax = 0, indexMin = 0, minValue = 0, maxValue = 0, summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
            if (array[i] < minValue) {
                minValue = array[i];
                indexMin = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                indexMax = i;
            }
        }

        int averageValue = Math.round(summa / array.length);
        int min = Integer.MAX_VALUE;
        for (int v : array) {
            final int diff = Math.abs(v - averageValue);

            if (diff < min) {
                min = diff;
                averageValue = v;
            }
        }

        switch (s) {
            case "max":
                return indexMax;
            case "min":
                return indexMin;
            case "average":
                return averageValue;
            default:
                return -1;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void replace(int index, int value) {
        array[index] = value;
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    @Override
    public void print() {
        int w = 0;
        char ch;
        System.out.print("Результат:");

        while (w < array.length) {
            ch = w % 10 == 0 ? '\n' : ' ';
            System.out.format("%c[%2d: %4d]", ch, w, array[w]);
            w++;
        }
        System.out.println();
    }
}

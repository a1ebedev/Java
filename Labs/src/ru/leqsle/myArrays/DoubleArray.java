package ru.leqsle.myArrays;

import java.util.Random;

public class DoubleArray {
    private int[][] array;
    private Random rand = new Random();

    public DoubleArray() {
        array = new int[0][0];
    }

    public void random(int strings, int columns) {
        array = new int[strings][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt() % 100 - 25;
            }

        }
    }

    public void print() {
        System.out.println("Результат:");
        for (int[] i : array) {
            for (int j : i) {
                System.out.format(" [%4d]", j);
            }
            System.out.println();
        }
    }

    public void moveLeft(int position) {
        if(position > array.length) position %= array.length;
        int[] temp = new int[position];

        for(int i = 0; i < array.length; i += 2) {
            for(int j = 0; j < position; j++) {
                temp[j] = array[i][j];
            }
            for (int j = 0; j < array[i].length - position; j++) {
                array[i][j] = array[i][j + position];
            }
            for (int j = 0; j < position; j++) {
                array[i][j + array[i].length - position] = temp[j];
            }
        }
    }
}

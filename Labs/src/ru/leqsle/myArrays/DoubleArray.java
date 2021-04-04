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
            for(int j : i) {
                System.out.format(" [%4d]", j);
            }
            System.out.println();
        }
    }



}

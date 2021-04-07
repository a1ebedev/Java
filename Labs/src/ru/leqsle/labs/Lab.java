package ru.leqsle.labs;

import ru.leqsle.interaction.Commands;
import ru.leqsle.interaction.Input;
import ru.leqsle.myArrays.DoubleArray;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Lab {
    protected Commands input = new Input();
    protected Random rand = new Random();
    protected NumbersList numArray = new NumArray();
    protected DoubleArray doubleArray = new DoubleArray();
    protected ArrayList<Integer> numbers = new ArrayList<>();
    protected List<List<Integer>> list = new ArrayList<>();

    private boolean ok = true;

    public Lab(int serialNumber) throws IOException {
        while (ok) {
            line("=");
            System.out.println("Лабораторная работа " + serialNumber + ". Вариант 20");
            line("=");
            tasks();
            line("=");
            question();
        }
        System.out.println("\n");
    }

    private void line(String s) {
        for (int i = 0; i < 50; i++) {
            System.out.print(s);
        }
        System.out.println();

    }

    public void tasks() throws IOException{};

    private void question() {
        String question = input.getAnswer("(1 - Повтор / Enter - следующая лаб. работа)");
        if(question == "1") ok = true;
        if(question == "") ok = false;
    }
}

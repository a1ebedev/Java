package ru.leqsle.labs;

import ru.leqsle.ui.Commands;
import ru.leqsle.ui.Input;
import ru.leqsle.myArrays.DoubleArray;
import ru.leqsle.myArrays.NumArray;
import ru.leqsle.myArrays.NumbersList;
import ru.leqsle.ui.Menu;

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
    private Menu menu = new Menu();
    private boolean ok = true;

    public Lab(int serialNumber) throws IOException {

        while (ok) {
            line("=");
            System.out.println("Лабораторная работа " + serialNumber);
            line("=");
            tasks();
            line("=");
            endLab();
        }

        System.out.println();
    }

    private void line(String s) {
        for (int i = 0; i < 50; i++) {
            System.out.print(s);
        }
        System.out.println();

    }

    public void tasks() throws IOException {
    }

    private void endLab() throws IOException {
        String question = input.getAnswer("(1 - Меню | 2 - Повтор | Enter - След. работа)");
        switch (question) {
            case "1" :
                menu.main();
                ok = false;
            case "2" :
                break;
            case "" :
                ok = false;
        }
    }

}
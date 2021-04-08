package ru.leqsle.labs.labFive;

import ru.leqsle.labs.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskTwo extends Task {
    private List<List<Integer>> list;
    Random rand;
    private int strings;
    private int columns;

    public TaskTwo() throws IOException {
        super(2, "Двумерный ArrayList");
    }

    public void body() throws IOException {
        list = new ArrayList<>();
        rand = new Random();

        System.out.println("Сформируем двумерный ArrayList, применив ДСЧ");
        strings = input.getInt("Количество строк");
        columns = input.getInt("Количество столбцов");

        for (int i = 0; i < strings; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                int x = rand.nextInt() % 100 - 25;
                list.get(i).add(x);
            }
        }

        for (List<Integer> i : list) {
            System.out.print(i + "\n");
        }
        menu.pause();


        System.out.println("Добавим строки после каждой четной строки");

        for (int i = 2; i < strings; i += 2) {
            list.add(i, new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                int x = rand.nextInt() % 100 - 25;
                list.get(i).add(x);
            }
        }

        for (List<Integer> i : list) {
            System.out.print(i + "\n");
        }

    }
}

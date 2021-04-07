package ru.leqsle.ui;

import ru.leqsle.labs.*;

import java.io.IOException;

public class Menu {
    private Commands input = new Input();

    // Основное меню
    public void main() throws IOException {
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - Запустить работу №" + i + "      ");
            i++;
            System.out.println(i + " - Запустить работу №" + i);
        }
        System.out.println();

        int question = input.getInt("");

        switch (question) {
            case 1:
                new FirstLab();
            case 2:
                new SecondLab();
            case 3:
                new ThirdLab();
            case 4:
                new FourthLab();
            case 5:
                new FifthLab();
        }
    }

}

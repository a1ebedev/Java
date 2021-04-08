package ru.leqsle.ui;

import ru.leqsle.labs.labFive.FifthLab;
import ru.leqsle.labs.labFour.LabFour;
import ru.leqsle.labs.labOne.LabOne;
import ru.leqsle.labs.labThree.LabThree;
import ru.leqsle.labs.labTwo.LabTwo;

import java.io.IOException;

public class Menu {
    private Input input = new Get();

    // Основное меню
    public void main() throws IOException {
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - Запустить работу №" + i + "      ");
            i++;
            System.out.println(i + " - Запустить работу №" + i);
        }
        System.out.println();

        int question = input.getInt("Введите значение");

        switch (question) {
            case 1:
                new LabOne();
            case 2:
                new LabTwo();
            case 3:
                new LabThree();
            case 4:
                new LabFour();
            case 5:
                new FifthLab();
        }
    }

    public void pause() throws IOException {
        System.out.println("Нажмите Enter, чтобы продолжить...");
        System.in.read();
    }

}

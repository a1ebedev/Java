package ru.leqsle.ui;

import ru.leqsle.labs.labFive.FifthLab;
import ru.leqsle.labs.labFour.LabFour;
import ru.leqsle.labs.labOne.LabOne;
import ru.leqsle.labs.labSix.LabSix;
import ru.leqsle.labs.labThree.LabThree;
import ru.leqsle.labs.labTwo.LabTwo;

import java.io.IOException;

public class Menu {
    private Input input = new Get();
    private Lines line;
    private boolean ok;
    private int question;

    // Основное меню
    public void main() throws IOException {
        line = new Lines();

        System.out.println();
        line.draw("=", 60);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " - Запустить работу №" + i + "      ");
            i++;
            System.out.println(i + " - Запустить работу №" + i);
        }
        line.draw("=", 60);
        System.out.println();

        do {
            question = input.getInt("Введите значение");
            try {
                if (question < 1 || question > 6) {
                    throw new Exception();
                } else ok = true;
            } catch (Exception e) {
                ok = false;
                System.out.println("Ошибка! Введите значение от 1 до 6.");
            }
        } while (!ok);


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
            case 6:
                new LabSix();
        }
    }

    public void pause() throws IOException {
        System.out.println("Нажмите Enter, чтобы продолжить...");
        System.in.read();
    }

}

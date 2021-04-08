package ru.leqsle.labs;

import ru.leqsle.ui.Input;
import ru.leqsle.ui.Get;
import ru.leqsle.ui.Lines;
import ru.leqsle.ui.Menu;

import java.io.IOException;

public abstract class Lab {
    private Input input = new Get();
    private Menu menu = new Menu();
    private boolean ok = true;
    private Lines line = new Lines();

    public Lab(int serialNumber, String theTask) throws IOException {
        while (ok) {
            line.draw("+", 90);
            System.out.printf("Лабораторная работа № %d: ", serialNumber);
            System.out.println("\"" + theTask + "\"");
            line.draw("+", 90);
            tasks();
            line.draw("+", 90);
            endLab();
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
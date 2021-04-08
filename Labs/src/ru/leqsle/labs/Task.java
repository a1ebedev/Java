package ru.leqsle.labs;

import ru.leqsle.ui.Get;
import ru.leqsle.ui.Input;
import ru.leqsle.ui.Lines;
import ru.leqsle.ui.Menu;

import java.io.IOException;

public abstract class Task {
    private Lines line = new Lines();
    protected Menu menu = new Menu();
    protected Input input = new Get();

    public Task(int serialNumber, String theTask) throws IOException {
        line.draw("-", 90);
        System.out.printf("Задача %d. %s\n", serialNumber, theTask);
        line.draw("-", 90);
        body();
        menu.pause();
    }

    public Task() throws IOException {
        line.draw("-", 90);
        body();
        menu.pause();
    }

    public void body() throws IOException {

    }
}

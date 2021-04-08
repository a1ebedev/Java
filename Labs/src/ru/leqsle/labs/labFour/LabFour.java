package ru.leqsle.labs.labFour;

import ru.leqsle.labs.Lab;

import java.io.IOException;


public class LabFour extends Lab {


    public LabFour() throws IOException {
        super(4, "Функции и массивы в Java");
    }

    public void tasks() throws IOException {
        new TaskOne();
        new TaskTwo();
        new TaskThree();
    }
}
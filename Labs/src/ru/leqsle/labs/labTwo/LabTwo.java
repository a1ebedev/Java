package ru.leqsle.labs.labTwo;

import ru.leqsle.labs.Lab;

import java.io.IOException;

public class LabTwo extends Lab {


    public LabTwo() throws IOException {
        super(2, "Использование основных операторов языка Java");
    }

    public void tasks() throws IOException {
        new TaskOne();
        new TaskTwo();
    }




}

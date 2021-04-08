package ru.leqsle.labs.labOne;

import ru.leqsle.labs.Lab;

import java.io.IOException;

public class LabOne extends Lab {

    public LabOne() throws IOException {
        super(1, "Вычисление выражений с использованием стандартных функций");
    }


    public void tasks() throws IOException {
        new TaskOne();
        new TaskTwo();
    }

}


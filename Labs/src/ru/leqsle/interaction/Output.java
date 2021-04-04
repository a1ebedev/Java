package ru.leqsle.interaction;

import java.io.IOException;

public class Output {
    public static void pause() throws IOException {
        System.out.println("Нажмите Enter, чтобы продолжить...");
        System.in.read();
    }
}

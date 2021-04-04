package ru.leqsle.interaction;

import java.io.IOException;
import java.util.Scanner;

public class Input implements Commands {
    private boolean ok = false;
    private Scanner in;

    public Input() {
        in = new Scanner(System.in);
    }

    @Override
    public int getInt(String s) {
        int number = 0;
        do {
            System.out.print(s + ": ");
            try {
                number = Integer.valueOf(in.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе числа!");
            }
        } while (!ok);
        return number;
    }

    @Override
    public double getDouble(String s) {
        double number = 0;
        do {
            System.out.print(s + ": ");
            try {
                number = Double.valueOf(in.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка при вводе числа");
            }
        } while (!ok);
        return number;
    }

}


package ru.leqsle.ui;

import java.util.Scanner;

public class Get implements Input {
    private boolean ok = false;
    private Scanner in;

    public Get() {
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
                ok = false;
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
                ok = false;
                System.out.println("Ошибка при вводе числа");
            }
        } while (!ok);
        return number;
    }

    @Override
    public String getString(String s) {
        String str = new String();
        do {
            System.out.print(s + ": ");
            try {
                str = in.nextLine();
                if (str == null || str.trim().isEmpty()) {
                    throw new Exception();
                } else ok = true;

            } catch (Exception e) {
                ok = false;
                System.out.println("Вы ничего не ввели!");
            }
        } while (!ok);
        return str;

    }

    @Override
    public String getAnswer(String s) {
        System.out.print(s + ": ");
        String str = in.nextLine();
        return str;
    }

}


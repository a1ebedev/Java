import java.util.Scanner;

public class main {
    public static int getInt(String s) {
        int number = 0;
        boolean ok = false;
        Scanner in = new Scanner(System.in);
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

    public static void main(String[] args) throws Exception {
        int n;
        int sum = 0;
        int count = 1;
        int result = 0;

        System.out.println("Лабораторная работа 2\nЗадача 3:");
        n = getInt("Введите количество элементов последовательности");
        for (int i = 1; i <= n; i++) {
            int x = getInt("Введите число " + i);
            if (i % 2 == 0) sum += x;
        }

        System.out.println("Сумма элементов с четными номерами: " + sum);

        System.out.println("Задача 2:");

        do {
            n = getInt("Введите число " + count);
            if (n <= sum && n != 0) {
                sum = n;
                result = count;
            }
            count = count + 1;
        }
        while (n != 0);

        System.out.println(result + "-е введенное число со значением " + sum + " минимально");


    }
}
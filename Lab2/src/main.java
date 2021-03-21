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
        int summ = 0;
        System.out.println("Лабораторная работа 2\nЗадача 3:");
        n = getInt("Введите количество элементов последовательности");
        for (int i = 1; i <= n; i++) {
            int x = getInt("Введите число " + i);
            if (i % 2 == 0) summ += x;
        }

        System.out.println("Сумма элементов с четными номерами: " + summ);



    }
}
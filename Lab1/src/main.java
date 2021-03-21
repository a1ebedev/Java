import java.util.Scanner;

public class main {
    public static double getDouble(String s) {
        double number = 0;
        boolean ok = false;
        Scanner in = new Scanner(System.in);

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

    public static void main(String[] args) {
        double x, y;
        x = getDouble("Введите значение x");
        y = 5 * Math.pow(x, 3) * Math.pow((1 / Math.pow(x, 2) + 1 / Math.pow(x, 3)), 0.2);
        System.out.println("Результат выражения: " + y);

        x = getDouble("Введите координату x");
        y = getDouble("Введите координату y");


        boolean result = (y <= 5 - x && y <= x + 5 && y >= 1.4 * x - 7) ^ (y < 0 && x < 0);
        System.out.println("Результат логического выражения: " + result);
    }
}

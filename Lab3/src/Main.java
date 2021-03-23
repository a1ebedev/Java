import java.util.Random;
import java.util.Scanner;

public class Main {
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


    public static void main(String[] args) {
        int n = getInt("Введите длину массива"); // Ввод длины с клавиатуры
        int[] numbArray = new int[n]; // Инициализируем массив
        int arrayLength = numbArray.length; // Инициализируем переменную, равную длине массива
        int minEl = 0; // Инициализируем переменную самого маленького элемента
        int i; // Просто переменная для счетчика

        // Присваиваем каждому элементу массива произвольное число
        Random rand = new Random();
        for (i = 0; i < numbArray.length; i++) {
            int x = rand.nextInt() % 13;
            numbArray[i] = x;
        }

        // Выводим получившийся массив
        for (int j : numbArray) {
            System.out.print(j + " "); //
        }

        // Ищем минимальное значение в массиве
        for (i = 0; i < numbArray.length; i++) {
            int count = numbArray[i];
            if (count <= minEl) minEl = count;
        }

        // Выводим его в консоль
        System.out.println("\nЭлемент с мин. значением:\n" + minEl + "\nУдалим его и будет так: ");

        // Ищем элемент с этим значением и пропускаем его
        for (i = 0; i < arrayLength; i++) {
            if (numbArray[i] == minEl)
                break;
        }
        // Делаем сдвиг оставшимся значениям
        for (int k = i; k < arrayLength - 1; k++) {
            numbArray[k] = numbArray[k + 1];
        }

        for (int v = 0; v < arrayLength - 1; v++) {
            int el = numbArray[v];
            System.out.print(el + " ");
        }

    }
}

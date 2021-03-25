import java.util.Random;
import java.util.Scanner;

public class Main {
    // Проверка на ошибки при вводе числа
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

    // Получение мин., макс. и сред. ариф. значений из массива
    public static int sizeElements(int[] arr, String s) {
        int[] a = arr;
        int minEl = 0, maxEl = 0, summaEl = 0;

        for (int i = 0; i < a.length; i++) {
            int el = a[i];
            if (el <= minEl) minEl = el;
            if (el >= maxEl) maxEl = el;
            summaEl += el;
        }

        int averageEl = Math.round(summaEl / a.length);
        int min = Integer.MAX_VALUE;
        for (int v : a) {
            final int diff = Math.abs(v - averageEl);

            if (diff < min) {
                min = diff;
                averageEl = v;
            }
        }

        switch (s) {
            case "max":
                return maxEl;
            case "min":
                return minEl;
            case "average":
                return averageEl;
            default:
                return 0;
        }
    }

    // Удаление и добавление элементов в массиве
    public static int[] editArray(int[] arr, String s, int in, int el) {
        int[] a = arr;
        int x = 1;

        switch (s) {
            case "del":
                x = 1;
                break;
            case "add":
                x = -1;
                break;
        }

        int[] b = new int[a.length - x];
        int count = 0;
        int lengthArr = a.length;

        for (count = 0; count < lengthArr; count++) {
            if (a[count] == in && x == 1) break;
            if (count == in && x == -1) {
                a[count - 1] = el;
                break;
            }
            b[count] = a[count];
        }

        for (int k = count; k < lengthArr - x; k++) {
            b[k] = a[k + x];
        }

        return b;
    }

    // Вывод массива в консоль
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {


        int n = getInt("Введите длину массива"); // Ввод длины с клавиатуры
        int[] numbArray = new int[n]; // Инициализируем массив

        // Присваиваем каждому элементу массива произвольное число
        Random rand = new Random();
        for (int i = 0; i < numbArray.length; i++) {
            int x = rand.nextInt() % 100 - 25;
            numbArray[i] = x;
        }

        printArray(numbArray); // Выводим получившийся массив

        // Удаление элемента с мин. значением и вывод в консоль
        int minEl = sizeElements(numbArray, "min"); // Минимальное значение в массиве
        System.out.println("Элемент с мин. значением:\n" + minEl + "\n\nБез него будет так: ");
        int[] minDelArray = editArray(numbArray, "del", minEl, 0);
        printArray(minDelArray);

        // Добавление нового элемента
        System.out.println("Добавление нового элемента");
        int addEl = getInt("Введите номер ячейки");
        int k = getInt("Введите значение");
        int[] addElArray = editArray(minDelArray, "add", addEl - 1, k);
        printArray(addElArray);

        //Меняем Максимальный и минимальный элемент местами
        minEl = sizeElements(addElArray, "min");
        int maxEl = sizeElements(addElArray, "max");

        System.out.println("Элементы max: " + maxEl + " и min: " + minEl + " Меняем местами:");
        for (int i = 0; i < addElArray.length; i++) {
            if (addElArray[i] == minEl) addElArray[i] = maxEl;
            else if (addElArray[i] == maxEl) addElArray[i] = minEl;
            System.out.print(addElArray[i] + " ");
        }

        //Находим элемент равный среднему арифм. элементов массива
        System.out.println("\n\nЭлемент равный среднему арифм. элементов массива:");
        int averageEl = sizeElements(addElArray, "average");

        System.out.println(averageEl);
    }
}

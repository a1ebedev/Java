import java.util.Scanner;

public class Main2 {
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
                System.out.println("Размер массива должен быть целым числом, тормоз!");
            }
        } while (!ok);
        return number;
    }

    public static void main(String[] args) {
        int n;
        n = getInt("Введите размер массива");
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int rnd = -500 + (int) (Math.random() * 1000); // генерирует случайное целое число
            nums[i] = rnd;
        }
        int w = 0; //если сделать i то в последующих циклах выдаст ошибку что переменная ранее определена
        char ch; // эта переменная принимает значение "\n" для переноса на следующую строку
        while (w < nums.length) {
            ch = w % 10 == 0 ? '\n' : ' '; // тернарный оператор, 10 - кол-во элементов в строке
            System.out.format("%c[%02d:%4d]", ch, w, nums[w]); // выделяем 2 символа для номера и 4 для значения
            w++; // это все по условиям лабы не надо, можно обойтись sout, но хай будэ
        }

// Задача 1: удалить максимальный элемент.
        int max = -999;
        int maxnum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxnum = i;
            }

        }
        System.out.format("\n:Максимальный элемент: [%02d:%4d]\n", maxnum, max);
// нашли мах элемент, надо его как-то удалить.
        int nl = nums.length;
        int i;

        for (i = 0; i < nl; i++) { //поиск удаляемого элемента
            if (nums[i] == max)
                break;
        }
        for (int k = i; k < nl - 1; k++) //сдвиг последующих элементов
            nums[k] = nums[k + 1];
        nl--; //уменьшение размера

        int v = 0; //если сделать i то в последующих циклах выдаст ошибку что переменная ранее определена
        char ch1; // эта переменная принимает значение "\n" для переноса на следующую строку
        while (v < nl) {
            ch1 = v % 10 == 0 ? '\n' : ' '; // тернарный оператор, 10 - кол-во элементов в строке
            System.out.format("%c[%02d:%4d]", ch1, v, nums[v]); // выделяем 2 символа для номера и 4 для значения
            v++; // это все по условиям лабы не надо, можно обойтись sout, но хай будэ
        }


    }
}
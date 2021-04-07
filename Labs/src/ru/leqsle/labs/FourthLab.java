package ru.leqsle.labs;

import ru.leqsle.ui.Output;

import java.io.IOException;
import java.util.regex.Pattern;


public class FourthLab extends Lab{

    public FourthLab() throws IOException {
        super(4);
    }

    public void tasks() throws IOException {
        taskOne();
        taskTwo();
        taskThird();
        taskFourth();
        taskSixth();
    }

    private void taskOne() throws IOException {
        System.out.println("Сформируем одномерный массив, используя ДСЧ");
        int n = input.getInt("Введите длину массива");
        numArray.random(n);
        numArray.print();
        Output.pause();
    }

    private void taskTwo() throws IOException {
        System.out.println("Удалим элементы с четными номерами");

        for (int i = numArray.size() - 1; i >= 0; i--) {
            if (numArray.get(i) % 2 == 0) numArray.remove(i);
        }
        numArray.print();
        Output.pause();

    }

    private void taskThird() throws IOException {
        System.out.println("Сформируем двумерный массив, используя ДСЧ");
        int strings = input.getInt("Количество строк");
        int columns = input.getInt("Количество столбцов");
        doubleArray.random(strings, columns);
        doubleArray.print();
        Output.pause();
    }

    private void taskFourth() throws IOException {
        System.out.println("Сдвинем нечетные строки матрицы влево на К элементов");
        int k = input.getInt("Введите К");
        doubleArray.moveLeft(k);
        doubleArray.print();
        Output.pause();
    }

    private void taskSixth() throws IOException {
        System.out.println("Удаление всех слов, начинающихся на гласные из введенной строки");
        String line = input.getString("Введите строку");
        String noVowelsLine = removeVowelsWords(line);
        System.out.println("Результат: " + noVowelsLine);

    }

    // Принимает строку, удаляет из нее слова, начинающиеся с гласной и возвращает обратно
    private String removeVowelsWords(String line) {
        StringBuilder temp = new StringBuilder();
        String[] words = line.split("\\s");

        for (String s : words) {
            boolean vowels = Pattern.matches("^(?ui:[аеёиоуыэюя]).*", s);
            if(vowels == false) temp.append(s + " ");
        }

            String result = temp.toString();
            return result;
        }
    }
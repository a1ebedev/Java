package ru.leqsle.labs.labFour;

import ru.leqsle.labs.Task;

import java.io.IOException;
import java.util.regex.Pattern;

public class TaskThree extends Task {
    public TaskThree() throws IOException {
        super(3, "Работа со строками");
    }

    public void body() {
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
            if (vowels == false) temp.append(s + " ");
        }

        String result = temp.toString();
        return result;
    }
}

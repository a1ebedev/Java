package ru.leqsle.labs.labSix;

import ru.leqsle.labs.Task;
import ru.leqsle.ui.Get;
import ru.leqsle.ui.Input;
import ru.leqsle.ui.Lines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tasks extends Task {
    private List<Pupil> pupils;
    private Input string;
    private int question;
    private String addName;
    private int addAge;
    private float addRating;
    private boolean ok;
    private Lines line;

    public Tasks() throws IOException {
        super(1, "Формирование массива со структурой");
    }

    public void body() {
        line = new Lines();
        string = new Get();
        pupils = new ArrayList<>();
        ok = true;

        Pupil artem = new Pupil("Артем", 12, 4f);
        Pupil dima = new Pupil("Дима", 13, 5f);
        Pupil masha = new Pupil("Маша", 7, 4f);
        Pupil andrey = new Pupil("Андрей", 7, 3f);
        Pupil sasha = new Pupil("Саша", 12, 4f);
        Pupil lena = new Pupil("Лена", 13, 4.8f);
        Pupil petya = new Pupil("Петя", 14, 3f);
        Pupil sonya = new Pupil("Соня", 13, 4.9f);

        pupils.add(0, artem);
        pupils.add(1, dima);
        pupils.add(2, masha);
        pupils.add(3, andrey);
        pupils.add(4, sasha);
        pupils.add(5, lena);
        pupils.add(6, petya);
        pupils.add(7, sonya);


        while (ok) {
            line.draw("-", 50);
            System.out.println("1 - Добавить ученика\n2 - Показать список\n3 - Показать учеников 13 лет с рейтингом > 4\n4 - выход");
            line.draw("-", 50);
            question = string.getInt("Введите значение");

            switch (question) {
                case 1:
                    addName = string.getString("Введите имя");
                    addAge = string.getInt("Введите возраст");
                    addRating = (float) string.getDouble("Введите рейтинг");
                    pupils.add(new Pupil(addName, addAge, addRating));
                    break;
                case 2:
                    for (Pupil i : pupils) {
                        System.out.printf("%s, %d, %f \n", i.getName(), i.getAge(), i.getRating());
                    }
                    break;
                case 3:
                    for (Pupil i : pupils) {
                        if (i.getAge() == 13 && i.getRating() > 4) {
                            System.out.printf("%s, %d, %f \n", i.getName(), i.getAge(), i.getRating());
                        }
                    }
                    break;
                case 4:
                    ok = false;
            }

        }
    }

    class Pupil {
        private String name;
        private int age;
        private float rating;

        public Pupil(String name, int age, float rating) {
            setName(name);
            setAge(age);
            setRating(rating);
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public float getRating() {
            return rating;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean setAge(int age) {
            if(age > 0 && age < 20) {
                this.age = age;
                return true;
            } else return false;

        }

        public void setRating(float rating) {
            this.rating = rating;
        }
    }
}
package ru.leqsle.labs.labSix;

import ru.leqsle.labs.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tasks extends Task {
    private List<Pupil> pupils;

    public Tasks() throws IOException {
        super(1, "Формирование массива со структурой");
    }

    public void body() {
        pupils = new ArrayList<>();

        Pupil artem = new Pupil("Артем", 12, 10.4f);
        Pupil dima = new Pupil("Дима", 9, 9.5f);
        Pupil masha = new Pupil("Маша", 7, 15.4f);


        pupils.add(0, artem);
        pupils.add(1, dima);
        pupils.add(2, masha);

        for(Pupil i : pupils) {
            System.out.printf("%s, %d, %f \n", i.getName(), i.getAge(), i.getRating());
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
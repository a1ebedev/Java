package ru.leqsle.myArrays;

public interface NumbersList {
    void add(int index, int value);
    void remove(int index);
    void removeValue(int value);
    int get(int index);
    int get(String s);
    int size();
    void replace(int index, int value);
    void sort();
    void print();

}

package ru.leqsle.ui;

public class Lines {
    public void draw(String symbol, int width) {
        for(int i = 0; i < width; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}

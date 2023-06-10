package com.szaruga.map;

public class WarshipMap {

    private final int width;
    private final int height;

    public WarshipMap(int inputWidth, int inputHeight) {
        this.width = Validation.validInput(inputWidth);
        this.height = Validation.validInput(inputHeight);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int totalMapSquare() {
        return getHeight() * getWidth();
    }
}
package com.szaruga.map;

public class WarshipMap {
    private final int width;
    private final int height;
    private final Square[][] squares;

    public WarshipMap(int width, int height) {
        this.width = width;
        this.height = height;
        squares = new Square[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                squares[row][col] = new Square();
            }
        }
    }

    public  Square setShip(int row, int col){
        return this.squares[row][col];
    }
    public Square getSquare(int row, int col) {
        return squares[row][col];
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
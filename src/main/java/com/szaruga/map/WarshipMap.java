package com.szaruga.map;

public class WarshipMap {
    private final int width;

    private final int height;
    private final Object[][] table;

    public WarshipMap(int width, int height) {
        this.width = width;
        this.height = height;
        table = new Object[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0) {
                    table[row][col] = "A" + col;
                } else if (row == 1) {
                    table[row][col] = "B" + col;
                } else if (row == 2) {
                    table[row][col] = "C" + col;
                } else if (row == 3) {
                    table[row][col] = "D" + col;
                } else if (row == 4) {
                    table[row][col] = "E" + col;
                } else if (row == 5) {
                    table[row][col] = "F" + col;
                } else if (row == 6) {
                    table[row][col] = "G" + col;
                } else if (row == 7) {
                    table[row][col] = "H" + col;
                } else if (row == 8) {
                    table[row][col] = "I" + col;
                } else if (row == 9) {
                    table[row][col] = "J" + col;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print("|" + table[i][j] + "|");
            }
            System.out.println();
        }
    }
}
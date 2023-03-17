package com.szaruga.map;

public class WarshipMap {
    private int width;

    private int height;
    private Object[][] table;

    public WarshipMap(int inputWidth, int inputHeight) {
        try {
            if (inputWidth <= 26 && inputHeight <= 26) {
                this.width = inputWidth;
                this.height = inputHeight;
                table = new Object[height][width];
                for (int row = 0; row < height; row++) {
                    for (int col = 0; col < width; col++) {
                        if (row == 0) {
                            table[row][col] = "A" + col;
                        }
                        if (row == 1) {
                            table[row][col] = "B" + col;
                        }
                        if (row == 2) {
                            table[row][col] = "C" + col;
                        }
                        if (row == 3) {
                            table[row][col] = "D" + col;
                        }
                        if (row == 4) {
                            table[row][col] = "E" + col;
                        }
                        if (row == 5) {
                            table[row][col] = "F" + col;
                        }
                        if (row == 6) {
                            table[row][col] = "G" + col;
                        }
                        if (row == 7) {
                            table[row][col] = "H" + col;
                        }
                        if (row == 8) {
                            table[row][col] = "I" + col;
                        }
                        if (row == 9) {
                            table[row][col] = "J" + col;
                        }
                        if (row == 10) {
                            table[row][col] = "K" + col;
                        }
                        if (row == 11) {
                            table[row][col] = "L" + col;
                        }
                        if (row == 12) {
                            table[row][col] = "M" + col;
                        }
                        if (row == 13) {
                            table[row][col] = "N" + col;
                        }
                        if (row == 14) {
                            table[row][col] = "O" + col;
                        }
                        if (row == 15) {
                            table[row][col] = "P" + col;
                        }
                        if (row == 16) {
                            table[row][col] = "Q" + col;
                        }
                        if (row == 17) {
                            table[row][col] = "R" + col;
                        }
                        if (row == 18) {
                            table[row][col] = "S" + col;
                        }
                        if (row == 19) {
                            table[row][col] = "T" + col;
                        }
                        if (row == 20) {
                            table[row][col] = "U" + col;
                        }
                        if (row == 21) {
                            table[row][col] = "V" + col;
                        }
                        if (row == 22) {
                            table[row][col] = "W" + col;
                        }
                        if (row == 23) {
                            table[row][col] = "X" + col;
                        }
                        if (row == 24) {
                            table[row][col] = "Y" + col;
                        } else if (row == 25) {
                            table[row][col] = "Z" + col;
                        }
                    }
                }
            } else {
                System.out.println("Max size of map is 25x25");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void show() {

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print("|" + table[i][j] + "|");
            }
            System.out.println();
        }
    }

    public Object[][] setOneMast(int row, int col) {

        table = new Object[row][col];

        return table;
    }
}
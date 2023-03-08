package com.szaruga.map;

public class Map {
    private int numRows;
    private int numCols;
    private Square[][] grid;

    public Map(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        grid = new Square[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = new Square();
            }
        }
    }

    public Square getSquare(int row, int col) {
        return grid[row][col];
    }

    public void setSquare(int row, int col, Square square) {
        grid[row][col] = square;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }
}
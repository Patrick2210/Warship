package com.szaruga.map;

import static com.szaruga.enums.Strings.*;

public class WarshipMap {

    private final int width;
    private final int height;
    private final int[][] map;

    public WarshipMap(int inputWidth, int inputHeight) {
        this.width = inputWidth;
        this.height = inputHeight;
        map = new int[height][width];
        if (inputWidth <= 25 && inputHeight <= 25) {
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    int water = 0;
                    map[row][col] = water;
                }
            }
        } else if (inputWidth > 25 && inputHeight > 25) {
            System.out.println(SIZE_MAP.string);
        }
    }

    public void setSquare(int row, int col, int squareOption) {
        map[row][col] = squareOption;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSquare(int row, int col) {
        return map[row][col];
    }

    public void showMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(VERTICAL_BAR.string + map[i][j] + VERTICAL_BAR.string);
            }
            System.out.println();
        }
        System.out.println(MAP_DECRIPTION.string + NUMBER_ZERO.string + NUMBER_ONE.string + NUMBER_TWO.string
                + NUMBER_THREE.string);
    }
}
package com.szaruga.map;

import static com.szaruga.enums.Strings.*;
import static com.szaruga.enums.CapitalLetters.*;

public class WarshipMap {

    private final int width;
    private final int height;
    private final boolean[][] map;
    private boolean isHit;

    public WarshipMap(int inputWidth, int inputHeight) {
        this.width = inputWidth;
        this.height = inputHeight;
        map = new boolean[height][width];
        if (inputWidth <= 25 && inputHeight <= 25) {
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {

                }
            }
        } else if (inputWidth > 25 && inputHeight > 25) {
            System.out.println(SIZE_MAP.string);
        }
    }

    public boolean setShip(int row, int col) {
        return map[row][col] = true;
    }

    public boolean getShip(int row, int col) {
        return map[row][col];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit, int row, int col) {
        isHit = hit;
        if (isHit) {
            map[row][col] = Boolean.parseBoolean(X.letter);
        } else {
            map[row][col] = Boolean.parseBoolean(O.letter);
        }
    }

    public void showMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(VERTICAL_BAR.string + map[i][j] + VERTICAL_BAR.string);
            }
            System.out.println();
        }
    }
}
package com.szaruga.map;

import static enums.Strings.*;

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

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public void showMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(VERTICAL_BAR.string + map[i][j] + VERTICAL_BAR.string);
            }
            System.out.println();
        }
    }
    //TODO zrobic metode ktora wykorzysta isHit() i ustawi nam komurke X -> zatopiony / O -> pudlo
}
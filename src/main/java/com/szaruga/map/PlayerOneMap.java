package com.szaruga.map;

import static com.szaruga.enums.Strings.*;

public class PlayerOneMap extends WarshipMap {
    public final int[][] player1Map;

    public PlayerOneMap(int inputWidth, int inputHeight) {
        super(inputWidth, inputHeight);
        player1Map = new int[getHeight()][getWidth()];

    }

    public void setPlayerOneSquare(int row, int col, int squareOption) {
        player1Map[row][col] = squareOption;
    }

    public int getPlayerOneSquare(int row, int col) {
        return player1Map[row][col];
    }

    public void showPlayerOneMap() {
        System.out.println(PLAYER_ONE.string);
        for (int i = 0; i < player1Map.length; i++) {
            for (int j = 0; j < player1Map[i].length; j++) {
                System.out.print(VERTICAL_BAR.string + player1Map[i][j] + VERTICAL_BAR.string);
            }
            System.out.println();
        }
        System.out.println();
    }
}
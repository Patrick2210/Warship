package com.szaruga.map;

import static com.szaruga.enums.Strings.*;
import static com.szaruga.enums.Strings.NUMBER_THREE;

public class PlayerTwoMap extends WarshipMap {
    private final int[][] player2Map;

    public PlayerTwoMap(int inputWidth, int inputHeight) {
        super(inputWidth, inputHeight);
        player2Map = new int[getHeight()][getWidth()];
    }

    public void setPlayerTwoSquare(int row, int col, int squareOption) {
        player2Map[row][col] = squareOption;
    }

    public int getPlayerTwoSquare(int row, int col) {
        return player2Map[row][col];
    }

    public void showPlayerTwoMap() {
        System.out.println(PLAYER_TWO.string);
        for (int i = 0; i < player2Map.length; i++) {
            for (int j = 0; j < player2Map[i].length; j++) {
                System.out.print(VERTICAL_BAR.string + player2Map[i][j] + VERTICAL_BAR.string);
            }
            System.out.println();
        }
        System.out.println(MAP_DECRIPTION.string + NUMBER_ZERO.string + NUMBER_ONE.string + NUMBER_TWO.string
                + NUMBER_THREE.string);
    }
}
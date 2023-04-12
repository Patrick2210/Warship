package com.szaruga.map;

import java.util.ArrayList;
import java.util.List;

import static com.szaruga.enums.Strings.*;


// ogólnie to powinieneś przenieść z tej klasy metody typu isHit(), setShip(), setMiss(). Mapa wie że coś naniej stoi ale nie ma pojęcia co to oznacza hit czy miss
// Game powinna pobrać komórkę z mapy używając współrzędnych i zdecydować czy to hit czy nie, czy strzeliłeś w to samo miejsce czy w puste pole itd.
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

    public int setShip(int row, int col) {
        // to może byc private static final String SHIP = 1
        // a dlatego że to zawsze jest 1, tak samo hit i miss podobnie
        int ship = 1;
        return map[row][col] = ship;
    }

    public int setHit(int row, int col) {
        int busted = 2;
        return map[row][col] = busted;

    }

    public int setMiss(int row, int col) {
        int miss = 3;
        return map[row][col] = miss;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean getShip(int row, int col){
        if (map[row][col] == 0){
            return false;
        } else return map[row][col] == 1;
    }

    // podobnie jak w isHit możesz uprościć warunek
    // poza tym, to nazwa jest myląca, ta metoda zwraca czy na danej współrzędnej znajduje się statek, a nazwa sugeruje że zwraca komórkę
    // czyli robi dokładnie to samo co metoda getShip nad tą metodą
    public boolean getSquare(int row, int col) {
        if (map[row][col] == 0) {
            return false;
        }
        if (map[row][col] == 1) {
            return true;
        }
        return false;
    }

    // chyba powinno być getShipsLeft, bo ta metoda na razie oznacza nie pozostałe statki a lewe statki
    public Integer getLeftShips() {
        List<Integer> ships = new ArrayList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == 1) {
                    ships.add(map[i][j]);
                }
            }
        }
        return ships.size();
    }

    // to możesz uprościc po prostu pisząc
    // return map[row][col] == 2 || map[row][col] == 3;
    // 3 oznacza że strzeliłeś w to samo miejsce a nie że jest HIT
    public boolean isHit(int row, int col) {
        if (map[row][col] == 2 || map[row][col] == 3) {
            return true;
        } else return false;
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

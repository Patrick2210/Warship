package com.szaruga.map;

import static com.szaruga.enums.Strings.*;
import static com.szaruga.enums.CapitalLetters.*;

/* może prościej będzie tak: zamiast tablicy booleanów zrób tablice int[][] i ta, będziesz trzymał wartości.
* 0 - puste pole(woda)
* 1 - statek
* 2 - oddany strzał w statek
* 3 - oddany strzał w puste pole(w wodę)
*
* Jak postawisz statek to zmieniasz z 0 na 1
* Jak strzelisz to zmieniasz 1 na 2 jeżeli na tym polu na które strzelasz był statek albo 1 na 3 jeżeli tam statku nie było
*
* Po każdym strzale sprawdzasz całą mapę czy zostały jeszcze jakieś statki, jak nie to koniec gry.
* */
public class WarshipMap {

    private final int width;
    private final int height;
    private final boolean[][] map;

    // ta zmienna jest ustawiana na całej mapie a to poszczególna komórka tablicy oznacza czy został oddany strzał
    private boolean isHit;

    public WarshipMap(int inputWidth, int inputHeight) {
        this.width = inputWidth;
        this.height = inputHeight;
        map = new boolean[height][width];
        if (inputWidth <= 25 && inputHeight <= 25) {
            // ta pętla nic nie robi
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

    // ja bym tą metodę nazwał inaczej, bo nie wiesz czy tam jest statek czy nie, może tam jest puste pole albo już oddany strzał
    public boolean getShip(int row, int col) {
        return map[row][col];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // jak zmienisz na int[][] to ta metoda będzie zwracać true jeżeli komórka w tablicy ma wartość 2 lub 3
    public boolean isHit() {
        return isHit;
    }

    // ta metoda powinna ustawić tylko wartość w tablicy, to isHit = hit; jest zbędne
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

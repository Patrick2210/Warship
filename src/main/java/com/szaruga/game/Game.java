package com.szaruga.game;

import static com.szaruga.enums.Strings.*;

import com.szaruga.map.WarshipMap;

import java.util.Scanner;

public class Game {
    private WarshipMap map;
    int shipsOnMap;
    SupportClass sc = new SupportClass();

    public Game(WarshipMap map) {
        if (map != null) {
            if (map.getHeight() > 25 && map.getWidth() > 25) {
                System.out.println(FIX_SIZE.string);
            } else {
                this.map = map;
            }
        }
    }

    private boolean isShip(int row, int col) {
        int checkSquare = map.getSquare(row, col);
        // 1 wrzuć do stałej i nazwij to jakoś żeby było wiadomo
        // na przykład private static final int SHIP = 1;
        // takie używanie licz w kodzie jest źle widziane, bo później nikt nie wie skąd są te liczby i co oznaczają, tzw. magic numbers
        return checkSquare == 1;
    }

    private boolean checkSquare(int row, int col) {
        int checkSquare = map.getSquare(row, col);
        switch (checkSquare) {
            // to samo co wyżej
            case 2, 3 -> {
                return true;
            }
        }
        return false;
    }

    private void putShip() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW.string);
        int r = sc.rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();
        if (isShip(r, c)) {
            System.out.println(OCCUPIED.string);
        } else {
            int ship = 1;
            map.setSquare(r, c, ship);
            shipsOnMap++;
        }
    }

    private void shoot() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHOOT.string);
        System.out.println(ROW.string);
        int r = sc.rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();
        if (checkSquare(r, c)) {
            System.out.println(SQUARE_SHOT.string);
        } else {
            if (isShip(r, c)) {
                int hit = 2;
                map.setSquare(r, c, hit);
                shipsOnMap--;
                System.out.println(HIT_SHIP.string);

            } else if (!isShip(r, c)) {
                int miss = 3;
                map.setSquare(r, c, miss);
                System.out.println(MISSED_SHIP.string);
            }
        }
    }

    public void play() {
        System.out.println(WELCOME.string + START.string);
        /* Czy w taki sposob jak to napisalem bedzie scanner sie automatycznie zamykac,
        * na necie pisali ze niby tak wole sie upewnic.
        * Jezeli zrobilem to dobrze to gitowa. Czy musze zamykac kazdego scanera z osobna w kazdej metodzie?
        */

        // tak, ta konstrukcja nazywa się try-with-resources i jeżeli klasa implementuje interfejs AutoCloseable to się sam zamknie
        // akurat Scanner to implementuje
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println(PRESS_ONE.string + PRESS_TWO.string + PRESS_THREE.string + SHOOT_THEM_ALL.string);
                    int j = scanner.nextInt();
                    switch (j) {
                        case 1 -> {
                            map.showMap();
                            System.out.println(PRESS_ZERO.string);
                        }
                        case 2 -> {
                            putShip();
                            System.out.println(PRESS_ZERO.string);
                        }
                        case 3 -> {
                            if (shipsOnMap == 0) {
                                System.out.println(BEFORE_SHOOTING.string + PRESS_ZERO.string);
                            } else {
                                shoot();
                                if (shipsOnMap > 0) {
                                    System.out.println(REMAINING_SHIPS.string + shipsOnMap + MORE_LEFT.string);
                                    System.out.println(PRESS_ZERO.string);
                                } else {
                                    System.out.println(CONGRATULATION.string + SHOOT_THEM_ALL.string + GOODBYE.string);
                                    System.exit(0);
                                }
                            }
                        }
                    }
                } else {
                    System.out.println(PRESS_ZERO.string);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

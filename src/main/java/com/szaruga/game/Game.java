package com.szaruga.game;

import static com.szaruga.enums.Strings.*;

import com.szaruga.map.WarshipMap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private WarshipMap map;
    private static final int Ship = 1;
    private static final int hitShip = 2;
    private static final int missShoot = 3;
    int shipsOnMap;

    public Game(WarshipMap map) {
        if (map != null) {
            this.map = map;
        } else {
            System.err.print(MAP_NULL.string);
        }
    }

    private boolean isShip(int row, int col) {
        int checkSquare = map.getSquare(row, col);
        return checkSquare == Ship;
    }

    private boolean checkSquare(int row, int col) {
        int checkSquare = map.getSquare(row, col);
        switch (checkSquare) {
            case hitShip, missShoot -> {
                return true;
            }
        }
        return false;
    }

    private void putShip() {
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW_COL.string);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                int r = SupportClass.verificationChar(input);
                int c = input.nextInt();
                if (isShip(r, c)) {
                    System.out.println(OCCUPIED.string);
                    System.out.println(ROW_COL.string);
                    input.nextLine();
                } else {
                    int ship = 1;
                    map.setSquare(r, c, ship);
                    shipsOnMap++;
                    break;
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println(WRONG_INPUT_POSITION_SHIP.string);
                System.out.println(ROW_COL.string);
                input.nextLine();
            }
        }
    }

    private void shoot() {
        System.out.println(RDY_SHOOT.string);
        System.out.println(ROW_COL.string);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                int r = SupportClass.verificationChar(input);
                int c = input.nextInt();
                if (checkSquare(r, c)) {
                    System.out.println(SQUARE_SHOT.string);
                    System.out.println(ROW_COL.string);
                    input.nextLine();
                } else {
                    if (isShip(r, c)) {
                        int hit = 2;
                        map.setSquare(r, c, hit);
                        shipsOnMap--;
                        System.out.println(HIT_SHIP.string);
                        break;
                    } else if (!isShip(r, c)) {
                        int miss = 3;
                        map.setSquare(r, c, miss);
                        System.out.println(MISSED_SHIP.string);
                        break;
                    }
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println(WRONG_INPUT_POSITION_SHOOT.string);
                System.out.println(ROW_COL.string);
                input.nextLine();
            }
        }
    }

    private void amountOfPlayerShips() {
        int totalMapSquare = (map.getWidth() * map.getHeight());
        int playerShips = SupportClass.verificationPlayerShips(totalMapSquare);
        do {
            putShip();
            playerShips--;
        } while (playerShips != 0);
    }

    private void playerOnePutShip() {
        System.out.println(PLAYER_ONE.string);
        amountOfPlayerShips();
    }

    private void playerTwoPutShip() {
        System.out.println(PLAYER_TWO.string);
        amountOfPlayerShips();
    }

    private void verificationShoot() {
        if (shipsOnMap > 0) {
            System.out.println(REMAINING_SHIPS.string + shipsOnMap + MORE_LEFT.string);
        } else {
            System.out.println(CONGRATULATION.string + SHOOT_THEM_ALL.string + GOODBYE.string);
            System.exit(0);
        }
    }

    private void playerOneShoot() {
        System.out.println(PLAYER_ONE.string);
        shoot();
        verificationShoot();
    }

    private void playerTwoShoot() {
        System.out.println(PLAYER_TWO.string);
        shoot();
        verificationShoot();
    }

    public void play() {
        System.out.println(WELCOME.string + START.string);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    if (scanner.hasNextInt()) {
                        int i = scanner.nextInt();
                        if (i == 0) {
                            System.out.println(PRESS_ONE.string + PRESS_TWO.string
                                    + PRESS_THREE.string + SHOOT_THEM_ALL.string + PRESS_FOUR.string);
                            int j = scanner.nextInt();
                            switch (j) {
                                case 1 -> {
                                    map.showMap();
                                    System.out.println(PRESS_ZERO.string);
                                }
                                case 2 -> {
                                    playerOnePutShip();
                                    playerTwoPutShip();
                                    System.out.println(PRESS_ZERO.string);
                                }
                                case 3 -> {
                                    if (shipsOnMap == 0) {
                                        System.out.println(BEFORE_SHOOTING.string + PRESS_ZERO.string);
                                    } else {
                                        playerOneShoot();
                                        playerTwoShoot();
                                        System.out.println(PRESS_ZERO.string);
                                    }
                                }
                            }
                        } else {
                            System.out.println(PRESS_ZERO.string);
                        }
                    } else {
                        scanner.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println(INVALID_NUMBER.string + START.string);
                    scanner.nextLine();
                }
            }
        }
    }
}
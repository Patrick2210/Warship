package com.szaruga.game;

import com.szaruga.map.PlayerTwoMap;
import com.szaruga.map.PlayerOneMap;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.szaruga.enums.Strings.*;
import static com.szaruga.game.VerificationGame.verificationChar;
import static com.szaruga.game.VerificationGame.verificationPlayerShips;

public class WarshipGame {
    private PlayerOneMap player1Map;
    private PlayerTwoMap player2Map;
    Scanner scanner;
    private static final int ship = 1;
    private static final int hitShip = 2;
    private static final int missShoot = 3;
    private int shipsOnMapPlayerOne;
    private int shipsOnMapPlayerTwo;
    private int player1Points;
    private int player2Points;


    public WarshipGame(PlayerOneMap player1Map, PlayerTwoMap player2Map, Scanner scanner) {
        this.scanner = scanner;
        if (player1Map != null && player2Map != null) {
            this.player1Map = player1Map;
            this.player2Map = player2Map;
        } else {
            System.err.print(MAP_NULL.string);
        }
    }

    private boolean isShip(Object obj, int row, int col) {
        int checkSquare = 0;
        if (obj == player1Map) {
            checkSquare = player1Map.getPlayerOneSquare(row, col);
        } else if (obj == player2Map) {
            checkSquare = player2Map.getPlayerTwoSquare(row, col);
        }
        return checkSquare == ship;
    }

    private boolean checkSquare(Object obj, int row, int col) {
        if (obj == player1Map) {
            int checkSquare = player1Map.getPlayerOneSquare(row, col);
            switch (checkSquare) {
                case hitShip, missShoot -> {
                    return true;
                }
            }
        } else if (obj == player2Map) {
            int checkSquare = player2Map.getPlayerTwoSquare(row, col);
            switch (checkSquare) {
                case hitShip, missShoot -> {
                    return true;
                }
            }
        }
        return false;
    }

    private void putShip(Object obj) {
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW_COL.string);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                char letter = input.findInLine(PATTERN.string).charAt(0);
                int r = verificationChar(letter);
                int c = input.nextInt();
                if (isShip(obj, r, c)) {
                    System.out.println(OCCUPIED.string);
                    System.out.println(ROW_COL.string);
                    input.nextLine();
                } else {
                    if (obj == player1Map) {
                        player1Map.setPlayerOneSquare(r, c, ship);
                        shipsOnMapPlayerOne++;
                        break;
                    } else if (obj == player2Map) {
                        player2Map.setPlayerTwoSquare(r, c, ship);
                        shipsOnMapPlayerTwo++;
                        break;
                    }
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println(WRONG_INPUT_POSITION_SHIP.string);
                System.out.println(ROW_COL.string);
                input.nextLine();
            }
        }
    }

    private void shoot(Object obj) {
        System.out.println(RDY_SHOOT.string);
        System.out.println(ROW_COL.string);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                char letter = input.findInLine(PATTERN.string).charAt(0);
                int r = verificationChar(letter);
                int c = input.nextInt();
                if (checkSquare(obj, r, c)) {
                    System.out.println(SQUARE_SHOT.string);
                    System.out.println(ROW_COL.string);
                    input.nextLine();
                } else {
                    if (isShip(obj, r, c)) {
                        int hit = 2;
                        if (obj == player1Map) {
                            player1Map.setPlayerOneSquare(r, c, hit);
                            player2Points++;
                            shipsOnMapPlayerOne--;
                            System.out.println(HIT_SHIP.string);
                            break;
                        } else if (obj == player2Map) {
                            player2Map.setPlayerTwoSquare(r, c, hit);
                            player1Points++;
                            shipsOnMapPlayerTwo--;
                            System.out.println(HIT_SHIP.string);
                            break;
                        }
                    } else if (!isShip(obj, r, c)) {
                        int miss = 3;
                        if (obj == player1Map) {
                            player1Map.setPlayerOneSquare(r, c, miss);
                            System.out.println(MISSED_SHIP.string);
                            break;
                        } else if (obj == player2Map) {
                            player2Map.setPlayerTwoSquare(r, c, miss);
                            System.out.println(MISSED_SHIP.string);
                            break;
                        }
                    }
                }
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println(WRONG_INPUT_POSITION_SHOOT.string);
                System.out.println(ROW_COL.string);
                input.nextLine();
            }
        }
    }

    private int amountOfShips(Object obj) {
        int totalMapSquare;
        if (obj == player1Map) {
            totalMapSquare = player1Map.totalMapSquare();
        } else {
            totalMapSquare = player2Map.totalMapSquare();
        }
        return verificationPlayerShips(totalMapSquare);
    }

    private void playerPutShip(Object obj) {
        if (obj == player1Map) {
            System.out.println(PLAYER_ONE.string);
        } else {
            System.out.println(PLAYER_TWO.string);
        }
        int playerShips = amountOfShips(obj);
        do {
            putShip(obj);
            playerShips--;
        } while (playerShips != 0);
    }

    private void playerXWinGame(int player) {
        if (player == 1 && shipsOnMapPlayerTwo == 0) {
            System.out.println(PLAYER_ONE.string + CONGRATULATION.string + WIN_SCORE.string + player1Points + GOODBYE.string);
        } else if (player == 2 && shipsOnMapPlayerOne == 0) {
            System.out.println(PLAYER_TWO.string + CONGRATULATION.string + WIN_SCORE.string + player2Points + GOODBYE.string);
        }
        System.exit(0);
    }

    private void verificationShipsOnMap(int player) {
        if (player == 1) {
            if (shipsOnMapPlayerTwo > 0) {
                System.out.println(PLAYER_ONE.string + REMAINING_SHIPS.string + shipsOnMapPlayerTwo + MORE_LEFT.string);
            } else {
                playerXWinGame(player);
            }
        } else if (player == 2) {
            if (shipsOnMapPlayerOne > 0) {
                System.out.println(PLAYER_TWO.string + REMAINING_SHIPS.string + shipsOnMapPlayerOne + MORE_LEFT.string);
            } else {
                playerXWinGame(player);
            }
        }
    }

    private void playerShootTurn(int player) {
        if (player == 1) {
            System.out.println(PLAYER_ONE.string);
            shoot(player2Map);
            verificationShipsOnMap(player);
        } else if (player == 2) {
            System.out.println(PLAYER_TWO.string);
            shoot(player1Map);
            verificationShipsOnMap(player);
        }
    }

    public void play() {
        System.out.println(WELCOME.string + START.string);
        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    if (i == 0) {
                        System.out.println(PRESS_ONE.string + PRESS_TWO.string + PRESS_THREE.string + SHOOT_THEM_ALL.string);
                        int j = scanner.nextInt();
                        switch (j) {
                            case 1 -> {
                                player1Map.showPlayerOneMap();
                                player2Map.showPlayerTwoMap();
                                System.out.println(PRESS_ZERO.string);
                            }
                            case 2 -> {
                                playerPutShip(player1Map);
                                playerPutShip(player2Map);
                                System.out.println(PRESS_ZERO.string);
                            }
                            case 3 -> {
                                if (shipsOnMapPlayerOne == 0 && shipsOnMapPlayerTwo == 0) {
                                    System.out.println(BEFORE_SHOOTING.string + PRESS_ZERO.string);
                                } else {
                                    int gameTurn = 1;
                                    do {
                                        System.out.println(WILDCARDS.string + GAME_TURN.string
                                                + gameTurn + WILDCARDS.string);
                                        playerShootTurn(1);
                                        playerShootTurn(2);
                                        gameTurn++;
                                    } while (true);
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
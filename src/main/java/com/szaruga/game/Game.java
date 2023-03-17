package com.szaruga.game;

import com.szaruga.map.WarshipMap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    WarshipMap map;

    public Game(WarshipMap map) {
        this.map = map;
    }


    private void start() {
        System.out.println("Start game please press: NUMBER ZERO ");
    }

    private Integer converter(String letter) {
        if (letter.equals("A")) {
            return 0;
        }
        if (letter.equals("B")) {
            return 1;
        }
        if (letter.equals("C")) {
            return 2;
        }
        if (letter.equals("D")) {
            return 3;
        }
        if (letter.equals("E")) {
            return 4;
        }
        if (letter.equals("F")) {
            return 5;
        }
        if (letter.equals("G")) {
            return 6;
        }
        if (letter.equals("H")) {
            return 7;
        }
        if (letter.equals("I")) {
            return 8;
        } else if (letter.equals("J")) {
            return 9;
        }
        return 0;

    }

    private Object[][] oneMastShip() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("Ready to set up One Mast ship?");
        System.out.println("Letter for row: ");
        int r = converter(row.next());
        System.out.println("Number for column: ");
        int c = col.nextInt();

        Object[][] oneMastShip = map.setOneMast(r, c);
        return oneMastShip;
    }

    //private Square setTwoMastShip(WarshipMap map){}
    //private Square setThreeMastShip(WarshipMap map){}
    //private Square setFourMastShip(WarshipMap map){}
    public void play() {
        Scanner scanner = new Scanner(System.in);
        start();

        int iterator = 0;

        while (iterator <= 3) {

            int i = scanner.nextInt();
            if (i == 0) {
                System.out.println("Welcome in WarShips\n" + "Press: Number 1 -> Show map\n"
                        + "Press: Number 2 -> Set up your fleet");

                int j = scanner.nextInt();
                if (j == 1) {
                    map.show();
                }
                if (j == 2) {
                    try {
                        //TODO zrobic metode putShipOnMap(oneMastShip();)
                        // + zanim wsadze to mape sprawidzc czy squere isEmpty
                        oneMastShip();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                    }
                } else if (j != 1 || j != 2) {
                    System.out.println("Press correct button");
                }

            } else if (i != 0) {
                System.out.println("Wrong button. Press NUMBER ZERO");

            }
            iterator++;
        }
    }
}
package com.szaruga.game;

import com.szaruga.map.WarshipMap;

import java.util.Scanner;

public class Game {
    private WarshipMap map;


    public Game(WarshipMap map) {
        if (map.getHeight() > 25 && map.getWidth() > 25) {
            System.out.println("Please fix size of map");
        } else this.map = map;

    }


    private void start() { //TODO to zostawic
        System.out.println("Start game please press: NUMBER ZERO ");
    }

    private Integer rowConverter(String letter) {
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
        }
        if (letter.equals("J")) {
            return 9;
        }
        if (letter.equals("K")) {
            return 10;
        }
        if (letter.equals("L")) {
            return 11;
        }
        if (letter.equals("M")) {
            return 12;
        }
        if (letter.equals("N")) {
            return 13;
        }
        if (letter.equals("O")) {
            return 14;
        }
        if (letter.equals("P")) {
            return 15;
        }
        if (letter.equals("Q")) {
            return 16;
        }
        if (letter.equals("R")) {
            return 17;
        }
        if (letter.equals("S")) {
            return 18;
        }
        if (letter.equals("T")) {
            return 19;
        }
        if (letter.equals("U")) {
            return 20;
        }
        if (letter.equals("V")) {
            return 21;
        }
        if (letter.equals("W")) {
            return 22;
        }
        if (letter.equals("X")) {
            return 23;
        }
        if (letter.equals("Y")) {
            return 24;
        } else if (letter.equals("Z")) {
            return 25;
        }
        return 0;
    }

    private void shipPosition() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("Ready to set up ship?");
        System.out.println("Letter for row: ");
        int r = rowConverter(row.next());
        System.out.println("Number for column: ");
        int c = col.nextInt();
        map.setShip(r, c);
    }

    private void shoot() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("Ready to shoot?");
        System.out.println("Letter for row: ");
        int r = rowConverter(row.next());
        System.out.println("Number for column: ");
        int c = col.nextInt();

        if (map.getShip(r, c)) {
            map.setHit(true);
            System.out.println("You hit ship!");

        } else if (!map.getShip(r, c)) {
            System.out.println("You missed...");
            map.setHit(false);
            //TODO isHit = false;
        }
    }

    public void play() {
        if (map != null) {
            Scanner scanner = new Scanner(System.in);
            start();

            int iterator = 0;
            while (iterator <= 5) {

                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println("Welcome in WarShips\n" + "Press: Number 1 -> Show map\n"
                            + "Press: Number 2 -> Set up your fleet\n" + "Press: Number 3 -> Shoot them all!");

                    int j = scanner.nextInt();
                    if (j == 1) {
                        map.showMap();
                    }
                    if (j == 2) {
                        shipPosition();
                    }
                    if (j == 3) {
                        shoot();
                    } else if (j != 1 || j != 2 || j != 3) {
                        System.out.println("Press Zero to show menu.");
                    }

                } else if (i != 0) {
                    System.out.println("Wrong button. Press NUMBER ZERO");
                }
                iterator++;
            }
        } else System.out.println("Goodbye");
    }
}
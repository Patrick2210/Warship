package com.szaruga.game;

import static com.szaruga.enums.Strings.*;

import com.szaruga.map.WarshipMap;

import java.util.Scanner;


public class Game {
    private WarshipMap map;
    SupportClass sc = new SupportClass();

    public Game(WarshipMap map) {
        if (map.getHeight() > 25 && map.getWidth() > 25) {
            System.out.println(FIX_SIZE.string);
        } else this.map = map;

    }

    private void start() {
        System.out.println(WELCOME.string + START.string);
    }
    private void shipPosition() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW.string);

        int r = sc.rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();

        if (map.getShip(r,c)){
            System.out.println(OCCUPIED.string);
        }else {
            map.setShip(r, c);
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

        if (map.isHit(r, c)) {
            System.out.println(SQUARE_SHOT.string);
        } else {
            if (map.getSquare(r, c)) {
                map.setHit(r, c);
                System.out.println(HIT_SHIP.string);

            } else if (!map.getSquare(r, c)) {
                map.setMiss(r, c);
                System.out.println(MISSED_SHIP.string);
            }
        }
    }
    public void play() {
        if (map != null) {
            Scanner scanner = new Scanner(System.in);
            boolean iterator = true;
            start();
            while (iterator) {
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println(PRESS_ONE.string + PRESS_TWO.string + PRESS_THREE.string + SHOOT_THEM_ALL.string);

                    int j = scanner.nextInt();
                    if (j == 1) {
                        map.showMap();
                        System.out.println(PRESS_ZERO.string);
                    }
                    if (j == 2) {
                        shipPosition();
                        System.out.println(PRESS_ZERO.string);
                    }
                    if (j == 3) {
                        shoot();
                        if (map.getLeftShips() != 0 ){
                            System.out.println(STILL_GOT.string + map.getLeftShips() + SHIPS_LEFT.string);
                            System.out.println(PRESS_ZERO.string);
                        } else {
                            System.out.println(CONGRATULATION.string + SHOOT_THEM_ALL.string);
                        }
                    } else if ((j != 1) && (j != 2) && (j != 3)) {
                        System.out.println(PRESS_ZERO.string);
                    }
                } else if (i != 0) {
                    System.out.println(PRESS_ZERO.string);
                }
            }
        } else System.out.println(GOODBYE.string);
    }
}
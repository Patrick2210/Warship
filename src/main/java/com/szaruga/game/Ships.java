package com.szaruga.game;

import java.util.Scanner;

public class Ships {
    public Object[][] oneMastShip;

    public void setOneMastShip(int row, int col) {
        oneMastShip = new Object[row][col];
    }
    public Object[][] getOneMastShip() {
        return oneMastShip;
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

    public void oneMastShip() { //TODO zrobic to w class Ships
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println("Ready to set up One Mast ship?");
        System.out.println("Letter for row: ");
        int r = converter(row.next());
        System.out.println("Number for column: ");
        int c = col.nextInt();

        setOneMastShip(r,c);
    }
}

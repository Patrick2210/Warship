package com.szaruga.game;

import static com.szaruga.enums.Strings.*;

import com.szaruga.map.WarshipMap;

import java.util.Scanner;

import static com.szaruga.enums.CapitalLetters.*;

public class Game {
    private WarshipMap map;

    public Game(WarshipMap map) {
        if (map.getHeight() > 25 && map.getWidth() > 25) {
            System.out.println(FIX_SIZE.string);
        } else this.map = map;

    }

    private void start() {
        System.out.println(WELCOME.string + START.string);
    }

    private Integer rowConverter(String letter) {
        if (letter.equals(A.letter)) {
            return 0;
        }
        if (letter.equals(B.letter)) {
            return 1;
        }
        if (letter.equals(C.letter)) {
            return 2;
        }
        if (letter.equals(D.letter)) {
            return 3;
        }
        if (letter.equals(E.letter)) {
            return 4;
        }
        if (letter.equals(F.letter)) {
            return 5;
        }
        if (letter.equals(G.letter)) {
            return 6;
        }
        if (letter.equals(H.letter)) {
            return 7;
        }
        if (letter.equals(I.letter)) {
            return 8;
        }
        if (letter.equals(J.letter)) {
            return 9;
        }
        if (letter.equals(K.letter)) {
            return 10;
        }
        if (letter.equals(L.letter)) {
            return 11;
        }
        if (letter.equals(M.letter)) {
            return 12;
        }
        if (letter.equals(N.letter)) {
            return 13;
        }
        if (letter.equals(O.letter)) {
            return 14;
        }
        if (letter.equals(P.letter)) {
            return 15;
        }
        if (letter.equals(Q.letter)) {
            return 16;
        }
        if (letter.equals(R.letter)) {
            return 17;
        }
        if (letter.equals(S.letter)) {
            return 18;
        }
        if (letter.equals(T.letter)) {
            return 19;
        }
        if (letter.equals(U.letter)) {
            return 20;
        }
        if (letter.equals(V.letter)) {
            return 21;
        }
        if (letter.equals(W.letter)) {
            return 22;
        }
        if (letter.equals(X.letter)) {
            return 23;
        }
        if (letter.equals(Y.letter)) {
            return 24;
        } else if (letter.equals(Z.letter)) {
            return 25;
        }
        return 0;
    }

    private void shipPosition() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW.string);
        int r = rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();
        map.setShip(r, c);
    }

    private void shoot() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHOOT.string);
        System.out.println(ROW.string);
        int r = rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();

        if (map.isHit()) {
            System.out.println("That square was already shot");
        } else {
            if (map.getShip(r, c)) {
                map.setHit(true, r, c);
                System.out.println(HIT_SHIP.string);

            } else if (!map.getShip(r, c)) {
                map.setHit(false, r, c);
                System.out.println(MISSED_SHIP.string);
            }
        }
    }

    public void play() {
        if (map != null) {
            Scanner scanner = new Scanner(System.in);
            int iterator = 0;
            start();
            do {
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println(PRESS_ONE.string + PRESS_TWO.string + PRESS_THREE.string);

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
                        System.out.println(PRESS_ZERO.string);
                    } else if ((j != 1) && (j != 2) && (j != 3)) {
                        System.out.println(PRESS_ZERO.string);
                    }
                    iterator++;
                } else if (i != 0) {
                    System.out.println(PRESS_ZERO.string);
                }
            } while (iterator <= 3);
        } else System.out.println(GOODBYE.string);
    }
}
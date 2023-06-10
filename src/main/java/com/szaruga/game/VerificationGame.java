package com.szaruga.game;

public class VerificationGame {
    private static int letterToInt(char letter) {
        return letter - 'A';
    }

    public static int verificationChar(char letter) {
        if (letter >= 65 && letter <= 90) {
            return letterToInt(letter);
        } else if (letter >= 97 && letter <= 122) {
            return letterToInt(letter) - ('@' / 2);
        } else {
            return -1;
        }
    }

    public static int verificationPlayerShips(int totalMapSquares) {
        return (int) ((totalMapSquares * 0.4) / 2);
    }
}
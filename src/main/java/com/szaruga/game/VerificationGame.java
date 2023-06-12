package com.szaruga.game;

public class VerificationGame {
    private static int letterToInt(char letter) {
        return letter - 'A';
    }

    private static int verificationUpperCaseChar(char letter) {
        if (letter >= 65 && letter <= 90) {
            return letterToInt(letter);
        } else {
            return -1;
        }
    }

    public static int verificationLowerCaseChar(char letter) {
        if (letter >= 97 && letter <= 122) {
            return letterToInt(letter) - ('@' / 2);
        } else {
            return -1;
        }
    }

    public static int verificationChar(char letter) {
        int upperCaseValue = verificationUpperCaseChar(letter);
        int lowerCaseValue = verificationLowerCaseChar(letter);
        if (upperCaseValue >= 0 && upperCaseValue <= 25) {
            return upperCaseValue;
        }
        if (lowerCaseValue >= 0 && lowerCaseValue <= 25) {
            return lowerCaseValue;
        } else return -1;
    }

    public static int verificationPlayerShips(int totalMapSquares) {
        return (int) Math.round((totalMapSquares * 0.4) / 2);
    }
}
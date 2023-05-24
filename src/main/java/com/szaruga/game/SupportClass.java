package com.szaruga.game;

import java.util.Scanner;

import static com.szaruga.enums.Strings.*;

public class SupportClass {
    protected static int letterToInt(char letter) {
        return letter - 'A';
    }

    protected static int verificationChar(Scanner input) {
        char letter = input.findInLine(PATTERN.string).charAt(0);
        if (letter >= 65 && letter <= 90) {
            return letterToInt(letter);
        } else if (letter >= 97 && letter <= 122) {
            return letterToInt(letter) - ('@' / 2);
        } else {
            return -1;
        }
    }

    protected static int verificationPlayerShips(int totalMapSquares) {
        return (int) ((totalMapSquares * 0.4) / 2);
    }
}
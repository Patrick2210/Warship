package com.szaruga.map;

import java.util.Scanner;

import static com.szaruga.enums.Strings.*;

public class Validation {

    protected static int validInput(int input) {
        if (input >= 5 && input <= 25) {
            return input;
        } else {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println(SIZE_MAP.string + VALID_NUMBER.string);
                if (sc.hasNextInt()) {
                    int scInput = sc.nextInt();
                    if (scInput >= 5 && scInput <= 25) {
                        return scInput;
                    } else {
                        System.out.println(INVALID_NUMBER.string);
                    }
                } else {
                    System.out.println(INVALID_NUMBER.string);
                    sc.nextLine();
                }
            }
        }
    }
}
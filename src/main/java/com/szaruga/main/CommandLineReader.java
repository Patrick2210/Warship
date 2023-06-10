package com.szaruga.main;

import static com.szaruga.enums.Strings.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineReader {

    private int valueOne;
    private int valueTwo;
    private final Scanner scanner;

    private void checkInputArgs(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println(MISSING_VALUE_CLI.string + SIZE_MAP.string);
                setInput();
            } else {
                valueOne = Integer.parseInt(args[0]);
                valueTwo = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            System.out.println(CLI_IF_STRING.string);
            setInput();
        }
    }

    public CommandLineReader(String[] args) {
        checkInputArgs(args);
    }
    public int getValueOne() {
        return valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }
    private void setInput() {
        while (true) {
            try {
                System.out.println(VALID_NUMBER.string);
                valueOne = scanner.nextInt();
                System.out.println(VALID_NUMBER.string);
                valueTwo = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_NUMBER.string);
                scanner.nextLine();
            }
        }
    }

    private void checkInputArgs(String[] args) {
        try {
            if (args.length == 0) {
                System.out.println(MISSING_VALUE_CLI.string + SIZE_MAP.string);
                setInput();
            } else {
                valueOne = Integer.parseInt(args[0]);
                valueTwo = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            System.out.println(CLI_IF_STRING.string);
            setInput();
        }
    }
}
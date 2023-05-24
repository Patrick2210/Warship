package com.szaruga.main;

import static com.szaruga.enums.Strings.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineReader {

    protected int valueOne;
    protected int valueTwo;

    private void setInput() {
        /*
         * Mam maly problem ktorego nie potrafie ogarnac, jezeli  Scannera zamkne poprzez try-with or sc.close()
         * Po przejsciu do classy Validation i validInput() bede mial NoSuchElement, podobna sytuacja bedzie jak
         * zrobie to samo sc.close() w validInput() patrzac na dalesze flow w daleszej czesci programu wyskoczy tez NoSuchElement
         *
         * Jezeli zostawie tutaj Scannera otwartego to dziala bez problemu i wykonuje sie wszystko jakbym chcial
         * */
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(VALID_NUMBER.string);
                valueOne = sc.nextInt();
                System.out.println(VALID_NUMBER.string);
                valueTwo = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(INVALID_NUMBER.string);
                sc.nextLine();
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

    public CommandLineReader(String[] args) {
        checkInputArgs(args);
    }
}

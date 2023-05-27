package com.szaruga.enums;

public enum Strings {
    MISSING_VALUE_CLI("""
            Oops it seems to somebody forgot to put map size
            Don't worry just put your number down below
            """),
    CLI_IF_STRING("Map can be only create on integer value"),
    INVALID_NUMBER("Invalid integer value\n"),
    VALID_NUMBER("Enter a valid integer value"),
    VERTICAL_BAR("|"),
    SIZE_MAP("""
            Minimum integer value is: 5
            Maximum integer value is: 25
            """),
    MAP_NULL("Map value null"),
    GOODBYE("\nGoodbye"),
    WELCOME("Welcome in WarShips\n"),
    START("Menu game please press: NUMBER ZERO "),
    RDY_SHIP("Ready to set up ship?"),
    RDY_SHOOT("Ready to shoot?"),
    ROW_COL("Capital letter for row & number for column: "),
    PATTERN("."),
    HIT_SHIP("You hit ship!"),
    MISSED_SHIP("You missed..."),
    PRESS_ONE("Press number 1 -> Show map\n"),
    PRESS_TWO("Press number 2 -> Set up your fleet\n"),
    PRESS_THREE("Press number 3 ->"),
    SHOOT_THEM_ALL(" Shot them all!\n"),
    PRESS_ZERO("Press Zero to show menu."),
    PLAYER_ONE("***** Player One *****"),
    PLAYER_TWO("***** Player Two *****"),
    SQUARE_SHOT("That square was already shot"),
    REMAINING_SHIPS("Remainig on battlefield: "),
    MORE_LEFT(" more to shoot!"),
    CONGRATULATION("Congratulation you"),
    OCCUPIED("This position is already occupied by ship..."),
    MAP_DECRIPTION("\nMAP DECRIPTION:\n"),
    NUMBER_ZERO("Number 0 on map means -> WATER\n"),
    NUMBER_ONE("Number 1 on map means -> SHIP\n"),
    NUMBER_TWO("Number 2 on map means -> HIT SHIP\n"),
    NUMBER_THREE("Number 3 on map means -> MISSED SHOOT"),
    BEFORE_SHOOTING("Before shooting you must set up ships on map...\n"),
    WRONG_INPUT_POSITION_SHIP("Unfortunately there is mistake in position place.\n" +
            "Please press capital letter for row & number for column in console, e.g: A1, D12"),
    WRONG_INPUT_POSITION_SHOOT("Unfortunately there is mistake in shoot position.\n" +
            "Please press capital letter for row & number for column in console, e.g: B3, F14");;
    public final String string;

    Strings(String str) {
        this.string = str;
    }
}
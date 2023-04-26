package com.szaruga.enums;

public enum Strings {
    VERTICAL_BAR("|"),
    SIZE_MAP("Max size of map is 25x25"),
    FIX_SIZE("Please fix size of map"),
    GOODBYE("\nGoodbye"),
    WELCOME("Welcome in WarShips\n"),
    START("Start game please press: NUMBER ZERO "),
    RDY_SHIP("Ready to set up ship?"),
    RDY_SHOOT("Ready to shoot?"),
    ROW("Capital letter for row: "),
    COL("Number for column: "),
    HIT_SHIP("You hit ship!"),
    MISSED_SHIP("You missed..."),
    PRESS_ONE("Press: Number 1 -> show map\n"),
    PRESS_TWO("Press: Number 2 -> set up your fleet\n"),
    PRESS_THREE("Press: Number 3 -> "),
    SHOOT_THEM_ALL(" shot them all!"),
    PRESS_ZERO("Press Zero to show menu."),
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
    BEFORE_SHOOTING("Before shooting you must set up ships on map...\n");
    public final String string;

    Strings(String str) {
        this.string = str;
    }
}
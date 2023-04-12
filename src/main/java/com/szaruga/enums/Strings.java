package com.szaruga.enums;

public enum Strings {
    VERTICAL_BAR("|"),
    SIZE_MAP("Max size of map is 25x25"),
    FIX_SIZE("Please fix size of map"),
    GOODBYE("Goodbye"),
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
    SHOOT_THEM_ALL(" shoot them all!"),
    PRESS_ZERO("Press Zero to show menu."),
    SQUARE_SHOT("That square was already shot"),
    STILL_GOT("Still you got "),
    SHIPS_LEFT(" ships to shoot!"),
    CONGRATULATION("Congratulation you"),
    OCCUPIED("This square if already occupied by ship"),
    MAP_DECRIPTION("\nMAP DECRIPTION:\n"),
    NUMBER_ZERO("Number 0 on map means -> WATER\n"),
    NUMBER_ONE("Number 1 on map means -> SHIP\n"),
    // nie ma takiego słowa jak HIITED, jest HIT
    NUMBER_TWO("Number 2 on map means -> HITTED SHIP\n"),
    // tu raczej nie MISSED SHIP a missed SHOT
    NUMBER_THREE("Number 3 on map means -> MISSED SHIP");
    public final String string;

    Strings(String str) {
        this.string = str;
    }
}

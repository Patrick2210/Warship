package enums;

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
    PRESS_ONE("Press: Number 1 -> Show map\n"),
    PRESS_TWO("Press: Number 2 -> Set up your fleet\n"),
    PRESS_THREE("Press: Number 3 -> Shoot them all!"),
    PRESS_ZERO("Press Zero to show menu.");
    public final String string;

    Strings(String str) {
        this.string = str;
    }
}
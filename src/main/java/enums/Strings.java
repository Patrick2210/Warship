package enums;

public enum Strings {
    VERTICAL_BAR("|"),
    SIZE_MAP("Max size of map is 25x25"),
    FIX_SIZE("Please fix size of map"),
    GOODBYE("Goodbye"),
    START("Start game please press: NUMBER ZERO "),
    RDY_SHIP("Ready to set up ship?"),
    RDY_SHOOT("Ready to shoot?"),
    ROW("Letter for row: "),
    COL("Number for column: "),
    HIT_SHIP("You hit ship!"),
    MISSED_SHIP("You missed..."),
    WELCOME("Welcome in WarShips\n"),
    PRESS_ONE("Press: Number 1 -> Show map\n"),
    PRESS_TWO("Press: Number 2 -> Set up your fleet\n"),
    PRESS_THREE("Press: Number 3 -> Shoot them all!"),
    PRESS_ZERO("Press Zero to show menu."),
    WRONG_BUTTON("Wrong button. Press NUMBER ZERO");

    public final String string;

    Strings(String str) {
        this.string = str;
    }
}

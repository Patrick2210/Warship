package enums;

public enum Strings {
    VERTICAL_BAR("|"),
    SIZE_MAP("Max size of map is 25x25"),
    FIX_SIZE("Please fix size of map"),
    GOODBYE("Goodbye");

    public final String string;

    Strings(String str) {
        this.string = str;
    }
}

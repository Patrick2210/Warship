package com.szaruga.game;

import static com.szaruga.enums.CapitalLetters.*;

public class SupportClass {

    // to jest dobrze ale można zrobić prostszy kod
    // zobacz sobie jakie enum ma metody i jak to możesz wykorzystać
    protected Integer rowConverter(String letter) {
        return valueOf(letter).ordinal();
    }
}
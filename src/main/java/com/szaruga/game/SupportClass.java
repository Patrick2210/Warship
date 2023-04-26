package com.szaruga.game;

import static com.szaruga.enums.CapitalLetters.*;
public class SupportClass {

    protected Integer rowConverter(String letter) {
        return valueOf(letter).ordinal();
    }
}
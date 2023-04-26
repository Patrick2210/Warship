package com.szaruga.game;

import static com.szaruga.enums.CapitalLetters.*;

public class SupportClass {

    //Czy chodzilo Ci o takie rozwiazanie? ordinal() zwraca mi inta wgl kolejnosci ulokowania w Enumie
    protected Integer rowConverter(String letter) {
        return valueOf(letter).ordinal();
    }
}
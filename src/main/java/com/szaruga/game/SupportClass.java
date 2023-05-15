package com.szaruga.game;

import static com.szaruga.enums.CapitalLetters.*;

// ta klasa to tak zwana klasa UTILITY, czyli ona wykonuje tylko jakieś operacje, nie trzyma stanu
// jej metody to powinny być metody statyczne, żebyś nie musiał tworzyć obiektu za każdym razem jak chcesz użyć jakieś metody
// to pozwala oszczędzić pamięć, bo masz tylko JEDEN obiekt na całą aplikację i sobie go używasz bez instancjonowania klasy
// poczytaj o metodach statycznych
public class SupportClass {

    //Czy chodzilo Ci o takie rozwiazanie? ordinal() zwraca mi inta wgl kolejnosci ulokowania w Enumie
    // raczej o takie rozwiązanie, bez tego enuma:
    private static int letterToInt(char letter) {
        // to ci zwróci 0 dla A, 1 dla B, 3 dla C itd. Uważaj bo poniższy kod będzie tak działał jak opisałem tylko dla wielkich liter.
        // każdy znak typu char jest reprezentowany liczbą https://www.ascii-code.com/
        return letter - 'A';
    }

    // poleganie na ordinalu wiąże się z ryzykiem, bo przestawisz w kodzie linijki i już jest lipa
    protected Integer rowConverter(String letter) {
        return valueOf(letter).ordinal();
    }
}

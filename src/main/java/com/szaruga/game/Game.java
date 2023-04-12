package com.szaruga.game;

import static com.szaruga.enums.Strings.*;

import com.szaruga.map.WarshipMap;

import java.util.Scanner;


// ogólna ważna rzecz, jak używasz klasy która otwiera albo używa zasobów systemu operacyjnego to musisz ją później zamknąć metodą
// .close() lub użyć try-with-resources, żeby zwolnić zasoby, bo inaczej aplikacja będzie pożerała zasoby
// To się tyczy wszystkich operacji na plikach i input/output streamach, czyli na przykład klasa Scanner
public class Game {
    private WarshipMap map;
    SupportClass sc = new SupportClass();

    public Game(WarshipMap map) {
        if (map.getHeight() > 25 && map.getWidth() > 25) {
            System.out.println(FIX_SIZE.string);
        } else {
            this.map = map;
        }

    }

    // metoda start nie startuje gry tak naprawdę tylko printuje powitalnego stringa, ja bym to wywalił, a printa wrzucił tam gdzie jest start() używany
    private void start() {
        System.out.println(WELCOME.string + START.string);
    }

    // ta metoda sugeruje że coś się dzieje z pozycją statku, a tymczasem ta metoda ustawia statek, więc powinna się nazywać
    // positiionShip albo putShip
    private void shipPosition() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHIP.string);
        System.out.println(ROW.string);

        int r = sc.rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();

        if (map.getShip(r, c)) {
            System.out.println(OCCUPIED.string);
        } else {
            map.setShip(r, c);
        }
    }

    private void shoot() {
        Scanner row = new Scanner(System.in);
        Scanner col = new Scanner(System.in);
        System.out.println(RDY_SHOOT.string);
        System.out.println(ROW.string);
        int r = sc.rowConverter(row.next());
        System.out.println(COL.string);
        int c = col.nextInt();

        if (map.isHit(r, c)) {
            System.out.println(SQUARE_SHOT.string);
        } else {
            if (map.getSquare(r, c)) {
                map.setHit(r, c);
                System.out.println(HIT_SHIP.string);

            } else if (!map.getSquare(r, c)) {
                map.setMiss(r, c);
                System.out.println(MISSED_SHIP.string);
            }
        }
    }

    public void play() {
        // kiedy map może być null? Już w konstruktorze można sprawdzać żeby później nie musieć pisać takich ifów, kod będzie prostszy
        // bo będizesz wiedział żę zawsze operujesz na nie nullowej mapie bo masz zabezpieczenie "na wejściu" czyli przy tworzeniu obiekty Game
        if (map != null) {
            Scanner scanner = new Scanner(System.in);
            boolean iterator = true;
            start();
            // tu po prostu powinieneś dać while(true), bez tej zmiennej
            while (iterator) {
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println(PRESS_ONE.string + PRESS_TWO.string + PRESS_THREE.string + SHOOT_THEM_ALL.string);

                    int j = scanner.nextInt();
                    if (j == 1) {
                        map.showMap();
                        System.out.println(PRESS_ZERO.string);
                    }
                    if (j == 2) {
                        shipPosition();
                        System.out.println(PRESS_ZERO.string);
                    }
                    if (j == 3) {
                        // tu powinieneś sprawdzać czy w ogóle jest w co strzelać, innymi słowy czy mapa jest pusta
                        shoot();
                        /* mam watpliwosci odnosnie ponizszej lini, gdyz tak naprawde 2x robi sie ten sam proces
                         * w 90 chcialbym tylko wyluskac wartosc inta, a nie robic cala petle od nowa, bo to zrobilem w 89
                         */
                        // masz rację, powinieneś raz zawołać tą funkcję i jej wynik zapisać do zmiennej w klasie Game
                        // klasa Game kontroluję grę i to co się dzieje więc warto żeby wiedziała ile statków zostało na mapie
                        // ogólnie możesz zrobić tak, że jak ustawiasz statki to zapisujesz do zmiennej ile ich ustawiłeś
                        // i po każdym trafieniu w statek odejmujesz od tej zmiennej, wtedy nie bedziesz musiał wykonywać
                        // całej tej operacji jaka jest w map.getLeftShips()
                        if (map.getLeftShips() != 0) {
                            System.out.println(STILL_GOT.string + map.getLeftShips() + SHIPS_LEFT.string);
                            System.out.println(PRESS_ZERO.string);
                        } else {
                            // jak zestrzelisz wszystkie statki to można zabić program po wyświetleniu komunikatu
                            // bo tak to nie wiadomo co zrobić jak jesteś użytkownikiem
                            System.out.println(CONGRATULATION.string + SHOOT_THEM_ALL.string);
                        }
                        // ten warunek możesz zamienić na j > 3, a najlepiej to użyć instrukcji switch żeby obsłużyć tą zmienną "j"
                    } else if ((j != 1) && (j != 2) && (j != 3)) {
                        System.out.println(PRESS_ZERO.string);
                    }
                    // ten else if bez sensu, wystarczy else
                } else if (i != 0) {
                    System.out.println(PRESS_ZERO.string);
                }
            }
        } else System.out.println(GOODBYE.string);
    }
}

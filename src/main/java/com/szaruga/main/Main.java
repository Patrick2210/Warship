package com.szaruga.main;

import com.szaruga.game.Game;
import com.szaruga.map.WarshipMap;

public class Main {
    public static void main(String[] args) {

        WarshipMap map = new WarshipMap(10 , 10);
        Game game = new Game(map);
        game.play();



    }
}
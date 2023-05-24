package com.szaruga.main;

import com.szaruga.game.Game;
import com.szaruga.map.WarshipMap;

public class Main {
    public static void main(String[] args) {
        CommandLineReader cli = new CommandLineReader(args);
        WarshipMap map = new WarshipMap(cli.valueOne, cli.valueTwo);
        Game game = new Game(map);
        game.play();
    }
}
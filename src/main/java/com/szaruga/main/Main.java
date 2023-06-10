package com.szaruga.main;

import com.szaruga.enums.Strings;
import com.szaruga.game.WarshipGame;
import com.szaruga.map.PlayerTwoMap;
import com.szaruga.map.PlayerOneMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandLineReader cli;
        try (Scanner scanner = new Scanner(System.in)) {
            cli = new CommandLineReader(args, scanner);
            PlayerOneMap playerOneMap = new PlayerOneMap(cli.getValueOne(), cli.getValueTwo());
            PlayerTwoMap playerTwoMap = new PlayerTwoMap(cli.getValueOne(), cli.getValueTwo());
            WarshipGame warShipGame = new WarshipGame(playerOneMap,playerTwoMap,scanner);
            warShipGame.play();
        } catch (Exception exception) {
            throw new RuntimeException(Strings.ERROR.string);
        }

    }
}
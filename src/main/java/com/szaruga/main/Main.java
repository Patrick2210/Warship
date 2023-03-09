package com.szaruga.main;

import com.szaruga.map.Square;
import com.szaruga.map.WarshipMap;

public class Main {
    public static void main(String[] args) {

        WarshipMap map = new WarshipMap(10, 10);
        Square square = map.getSquare(2,5);
        Square ship1 = map.setShip(1,2);

    }
}
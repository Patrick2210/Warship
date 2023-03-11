package com.szaruga.map;

public class Square {
    private boolean hasShip;
    private boolean isHit;

    public Square() {
        hasShip = false;
        isHit = false;
    }

    public boolean hasShip() {
        return hasShip;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
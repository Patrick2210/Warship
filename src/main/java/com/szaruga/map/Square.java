package com.szaruga.map;

public class Square {
    private boolean isEmpty;
    private boolean hasShip;
    private boolean isHit;

    public Square() {
        isEmpty = true;
        hasShip = false;
    }
    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
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
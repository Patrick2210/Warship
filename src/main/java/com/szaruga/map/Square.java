package com.szaruga.map;

public class Square {
    private boolean isOccupied;
    private boolean isHit;

    public Square() {
        isOccupied = false;
        isHit = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
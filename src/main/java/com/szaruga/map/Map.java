package com.szaruga.map;

import java.util.ArrayList;

public class Map {
    public Map() {
        Object[][] arr = new Object[10][10];

// fill the array with random values
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0  ) {
                    arr[i][j] = "A" + j;
                } else if (i == 1 ){
                    arr[i][j] = "B" + j;
                }else if (i == 2){
                    arr[i][j] = "C"+ j;
                }else if (i == 3){
                    arr[i][j] = "D"+ j;
                }else if (i == 4){
                    arr[i][j] = "E"+ j;
                }else if (i == 5){
                    arr[i][j] = "F"+ j;
                }else if (i == 6){
                    arr[i][j] = "G"+ j;
                }else if (i == 7){
                    arr[i][j] = "H"+ j;
                }else if (i == 8){
                    arr[i][j] = "I"+ j;
                }else if (i == 9){
                    arr[i][j] = "J";
                }
            }
        }

// print the array with dashes
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               //System.out.print(arr[i][j] + "|");
            }
            //System.out.println();
        }


    }
}

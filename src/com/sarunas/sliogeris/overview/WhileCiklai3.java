package com.sarunas.sliogeris.overview;

public class WhileCiklai3 {

    public static void main(String[] args) {

    int numba = 100;
    int i = 0;
    int total = 0;

    do {
        System.out.println(i);
        total = total + i;
        i++;
    } while (i <= numba);
        System.out.println(total);
    }
}

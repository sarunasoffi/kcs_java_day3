package com.sarunas.sliogeris.overview;

public class WhileCiklai2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }

        int total = 0;
        int number = 100;
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
            total = total + i;
        }
        System.out.println(total);
    }
}

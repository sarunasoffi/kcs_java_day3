package com.sarunas.sliogeris.overview;

public class WhileCiklai {

    public static void main(String[] args) {

        for (int ind = 0; ind < 5; ind++) {
            System.out.println("Labas Sarunas" + ind);
        }

        System.out.println("\n");

        int i = 0;
        int b = 5;
        String c = "Hello World";

        while (i < b) {
            System.out.println(c);
            i++;
        }

        System.out.println("\n");

        int ar = 0;

        do {
            System.out.println("Labas dp/while " + ar);
            ar++;
        } while (ar < b);

    }
}

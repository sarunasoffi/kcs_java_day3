package com.sarunas.sliogeris.overview;

import java.util.Arrays;

public class MasyvaiLygus {

    public static void main(String[] args) {

        int [] a={1, 2, 3};
        int [] b={1, 2, 4};

    motodas(a, b);

    }

    private static void motodas(int[] masyvas1, int[] masyvas2) {
        System.out.println("ar lygus? " + Arrays.equals(masyvas1, masyvas2));
    }
}

package com.sarunas.sliogeris.overview;

import java.util.Scanner;

public class Masyvai2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi: ");
        int masSize = sc.nextInt();

        int[] mas = new int[masSize];

        for(int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite " + i + " elementa");
            mas[i] = sc.nextInt();
        }

        int sum = 0;
        int sandauga = 1;
        double vidurkis = 0;

        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " ");
            sum += mas[i];
            sandauga *= mas[i];
        }
        vidurkis = sum / mas.length;
        System.out.println("\nSuma = " + sum);
        System.out.println("Sandauga = " + sandauga);
        System.out.println("Vidurkis = " + vidurkis);
    }
}

package com.msayrac;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // variables
        double kdv = 0.18;
        double miktar;
        double kdvMiktar;

        Scanner input = new Scanner(System.in);

        System.out.println("KDV hesaplanacak Tutarı Giriniz :");
        miktar = input.nextDouble();

        System.out.println("Girilen Paranız : " + miktar);
        kdvMiktar = miktar * kdv + miktar;
        System.out.println("Kdv Hesaplanan Paranız : " + kdvMiktar);
        System.out.println("KDV Tutar : " +miktar*kdv);


    }
}
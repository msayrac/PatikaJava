package com.msayrac;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // variables
        int mat, fizik, kimya, turkce, tarih, muzik;

        //kullanıcıdan deger al
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunu Giriniz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();
        System.out.println("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();
        System.out.println("Türkçe Notunu Giriniz : ");
        turkce = input.nextInt();
        System.out.println("Müzik Notunu Giriniz : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + muzik;
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız : " + sonuc);



    }
}
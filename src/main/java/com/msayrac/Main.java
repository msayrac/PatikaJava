package com.msayrac;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", "TRH", "555");
        Teacher t2 = new Teacher("Graham", "FZK", "444");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO", "111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Saban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(0, 0, 0);
        s1.isPass();

    }
}
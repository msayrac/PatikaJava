package com.msayrac;

public class Course {

    String name;
    String code;
    String prefix;

    int note;

    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void addTeacher(Teacher teacher) {

        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;

        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }



    }

    void printTeacher() {
        this.teacher.print();
    }
}

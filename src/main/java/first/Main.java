package first;

public class Main {
    //      Encapsulation - kapsülleme
//    Inheritance - Kalıtım
//        Polimorphism - Çok biçimlilik
//        Abstraction - Soyutlama

    public static void main(String[] args) {


        Student st1 = new Student("Mustafa", "Cetindag", "123", "Ankara", 50);
        Student st2 = new Student("Patika", "Dev", "121", "İstanbul", 100);
        Student st3 = new Student("Kodluyoruz", "Java", "222", "İzmir", 90);

        Instructor teacther = new Instructor("Mahmut", "Cetin", "MAT");
        Course mat = new Course("MAT101", "MAT", teacther);
        Student[] students = {st1, st2, st3};

        System.out.println(mat.getInstructor().getName());
    }
}

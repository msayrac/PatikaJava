package first;

public class Main {
    //      Encapsulation - kapsülleme
//    Inheritance - Kalıtım
//        Polimorphism - Çok biçimlilik
//        Abstraction - Soyutlama

    public static void main(String[] args) {

//        Worker w1 = new Worker("Mustafa Cetin", "123 123 22 22", "mus@gmail.com");

//        Academician a1 = new Academician("Ali Can", "125 22 55 44", "ali@gmail.com", "Fizik", "Dr");

//        Worker m1 = new Memur("MEtin Cak", "123 654 ", "metin@gmgm", "Bigi islem", "9-15");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Memet yıl", "m@gmail", "123 333 3333", "CENG", "Docent");


//        Worker a2 = new Academician("Kodluyoruz", "kodlu@gmail.com", "123 666 6666", "CENG", "Ars Gor");

        //abstraction - soyutlama sınıftan nesene üretimini engelliyoruz

o1.dersegir("12 00");





    }
}

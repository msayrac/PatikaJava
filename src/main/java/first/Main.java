package first;

public class Main {
    //      Encapsulation - kapsülleme
//    Inheritance - Kalıtım
//        Polimorphism - Çok biçimlilik
//        Abstraction - Soyutlama

    public static void main(String[] args) {

Book haryyPotter =new Book("HArry Potter",150);
Book lordOfTheRings = new Book("Lord of the Rings",52);

        System.out.println(lordOfTheRings.getName());
        lordOfTheRings.setName("Lord 2");
        System.out.println(lordOfTheRings.getName());







    }
}

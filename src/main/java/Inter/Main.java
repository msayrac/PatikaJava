package Inter;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz : ");
        double price = input.nextDouble();

        System.out.println("Card No giriniz : ");
        String cardNumber = input.nextLine();

        System.out.println("Son Kullanım Tarihi giriniz : ");
        String date = input.nextLine();

        System.out.println("Güvenlik Kodu giriniz : ");
        String cvc = input.nextLine();

        System.out.println("1. A Bank : ");
        System.out.println("2. B Bank : ");
        System.out.println("3. C Bank : ");
        System.out.println("4. D Bank : ");
        System.out.println("Banka Seciniz : ");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankasi", "123", "111");
                aPos.connect("127.1.1");
                aPos.payment(price, cardNumber, date, cvc);
                break;
            case 2:
                BBankasi bpos = new BBankasi("B Bankasi", "123", "111");
                bpos.connect("127.1.1");
                bpos.payment(price, cardNumber, date, cvc);
                break;
            default:
                System.out.println("Geçerli Banka Giriniz : ");

        }


    }
}

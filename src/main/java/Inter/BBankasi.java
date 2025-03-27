package Inter;

import java.io.Serializable;

public class BBankasi implements IBanka {

    private String name;
    private String terminalID;
    private String password;


    public BBankasi(String name, String terminalID, String password) {
        this.name = name;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip : "+ ipAddress);
        System.out.println("Makina ip : "+ this.hostIpAdress);
        System.out.println(this.name + " Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expireDate, String cvc) {
        System.out.println("B Bankasından Cevap bekleniyor ");
        System.out.println("B Bankasında İşlem Başarılı Oldu !");
        return true;
    }
}

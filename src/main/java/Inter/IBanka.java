package Inter;

public interface IBanka {

    final String hostIpAdress = "127.0.0.1";
    boolean connect(String ipAddress);

    boolean payment(double price,String cardNumber,String expireDate, String cvc);


}

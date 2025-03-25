package first;

public class OgretimGorevlisi extends Academician{


    public OgretimGorevlisi(String nameSurname, String email, String phoneNumber, String department, String unvan) {
        super(nameSurname, email, phoneNumber, department, unvan);
    }

    @Override
    public void giris(){
        System.out.println(this.getNameSurname()  + " üniversiteye B kapısından giriş yaptı");
    }
}

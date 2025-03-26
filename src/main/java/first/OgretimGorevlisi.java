package first;

public class OgretimGorevlisi extends Academician{


    public OgretimGorevlisi(String nameSurname, String email, String phoneNumber, String department, String unvan) {
        super(nameSurname, email, phoneNumber, department, unvan);
    }

    @Override
    public void giris(){
        System.out.println(this.getNameSurname()  + "  görevlisi B kapısından giriş yaptı");
    }
    @Override
    public void dersegir(String dersSaati){
        System.out.println(this.getNameSurname() + " derse "+ dersSaati +" giris yaptı.");
    }

}

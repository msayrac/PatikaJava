package first;

public class Worker {

    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Worker(String nameSurname, String phoneNumber,String email) {
        this.nameSurname = nameSurname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Worker(){

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void giris(){
        System.out.println(this.nameSurname  + " üniversiteye giriş yaptı");
    }

    public void giris(String girisSaati){
        System.out.println(this.nameSurname  + " saat "+ girisSaati + " üniversiteye giris yaptı");
    }


    public void cikis(){
        System.out.println(this.nameSurname  + " üniversiteye çıkış yaptı");
    }

    public void yemekhane(){
        System.out.println(this.nameSurname  + " yemekhaneye girdi");
    }

}

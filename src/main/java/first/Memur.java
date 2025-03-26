package first;

public abstract class Memur extends Worker {

    private String department;
    private String mesai;

    public Memur(String nameSurname, String phoneNumber, String email, String department, String mesai) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){

        System.out.println(this.getNameSurname() + " çalısıyor");
    }

    @Override
    public void giris(){
        System.out.println(this.getNameSurname()  + "  memur C kapısından giriş yaptı");
    }


}

package first;

public class Academician extends Worker {

    private String department;
    private String unvan;

    public Academician(String nameSurname, String email, String phoneNumber, String department, String unvan) {
        super(nameSurname, email, phoneNumber);
        this.department = department;
        this.unvan = unvan;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void dersegir(){
        System.out.println(this.getNameSurname() + " derse giriş yaptı");
    }
}

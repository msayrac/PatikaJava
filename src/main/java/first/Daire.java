package first;

public class Daire {
    public int r;
    public static final double PI_SAYISI=3.14;

    public Daire(int r) {
        this.r = r;
    }

    public void calcArea(){
        double area=Daire.PI_SAYISI*Math.pow(r,2);
        System.out.println("Dairenin alanı : "+area);
    }


}

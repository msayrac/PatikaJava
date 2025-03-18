package first;

public class First {

    protected String str;

   public First(String str) {
        this.str = str;
    }

    public void showStr() {
        System.out.println(this.str);
    }

    public void show() {
        this.showStr();
    }


}

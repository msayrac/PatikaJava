package first;

public class User {

    public String name;
    public static int counter=0;

    public User(String name) {
        this.name = name;
        counter ++;
    }

   static {
        System.out.println("Ben bir static cod bloguyum");
    }








}

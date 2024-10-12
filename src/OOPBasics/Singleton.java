package OOPBasics;

public class Singleton {

    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null)
            instance=new Singleton();
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj1=Singleton.getInstance();
        //All above reference variables are pointing to the same object.

    }
}

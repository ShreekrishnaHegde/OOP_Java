package OOPBasics;

public class GarbageCollection {
    public static void main(String[] args) {
        A obj;
        for (int i = 0; i < 1000000000; i++) {
                obj=new A("Random Name");
        }
    }
}

class A{
    final int num=10;
    String name;

    public A(String name){
        System.out.println("Object created");
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyeed");
    }


}

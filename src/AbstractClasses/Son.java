package AbstractClasses;

public class Son extends Parent{
    public Son(int age ){
        this.age=age;
    }
    @Override
    void career() {
        System.out.println("His career");
    }
    @Override
    void partner(){
        System.out.println("His partner");

    }
}

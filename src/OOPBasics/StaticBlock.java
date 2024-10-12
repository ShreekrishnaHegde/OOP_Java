package OOPBasics;

public class StaticBlock {
    static int a=5;
    static int b;

    static {
        System.out.println("In static block");
        b=a*4;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+ " "+StaticBlock.b);

    }
}
/*
->Static block will run only once.
->Outside class cannot be static

 */

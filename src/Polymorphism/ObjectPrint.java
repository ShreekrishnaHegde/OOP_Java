package Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num=num;
    }

    @Override
    public String toString() {
        return "Hey";
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(5);
        System.out.println(obj);
    }
}

package Access;

public class A {
    public int getNum() {
        return num;
    }

    private int num;
    String name;
    int[] arr;
    public A(int num,String name ) {
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }
}

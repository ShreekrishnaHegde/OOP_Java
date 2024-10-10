package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box();
//        Box box1=new Box(box);
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);

        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(1,2,3,4);
//        BoxWeight box5=new Box(1,2,3);
//        System.out.println(box5.weight);
        System.out.println(box3.h+" "+box3.weight);
    }
}

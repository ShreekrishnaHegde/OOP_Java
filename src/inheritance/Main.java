package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
//        Box box1=new Box(box);
//        System.out.println(box1.l+" "+box1.w+" "+box1.h);

        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(1,2,3,4);
        Box box5=new BoxWeight(1,2,3,4);

//        BoxPrice box=new BoxPrice();

//        BoxWeight box6=new Box(1,2,3);
//        Parents class has no idea about the weight filed
//        System.out.println(box5.weight);
        System.out.println(box3.h+" "+box3.weight);

        BoxPrice box10=new BoxPrice(5,8,200);
    }
}
/*
->Type of the reference variable and not the type of the object that determines what member can be accessed.
 ->But here all fields of box5 object are initialized. But the reference variable is of Box type
    and you can only access the properties that are in box class though box5 reference variable.
->Conclusion is: When a reference to a subclass object is assigned to a superclass reference variable like in
    the above example you will only access to only those parts of the object that are defined in the superclass.
->single inheritance
->Multiple inheritance-one class extending more than 1 classes.
->Multiple inheritance is not supported in java.
->Can be done using interfaces
->Hierarchical inheritance in java
    once class is inherited by many classes
 ->Hybrid inheritance not supported in java
    combination of single and multiple inheritance
->Object oriented and object basis language
 */

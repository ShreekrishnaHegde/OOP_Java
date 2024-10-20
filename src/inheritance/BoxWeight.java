package inheritance;

import javax.sound.sampled.BooleanControl;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    //Very very important concept
    /*
    ->Type of the reference variable and not the type of the object that determines what member can be accessed.
 ->But here all fields of box5 object are initialized. But the reference variable is of Box type
    and you can only access the properties that are in box class though box5 reference variable.
            ->Conclusion is: When a reference to a subclass object is assigned to a superclass reference variable like in
    the above example you will only access to only those parts of the object that are defined in the superclass.
            ->
            */
    BoxWeight (BoxWeight other){
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l,double h, double w, double weight){
        super(l,h,w);//used to initialize the values in parents class constructor
        this.weight=weight;
//        System.out.println(super.h);

    }
}
/*
But private variables cannot be used outside the class.Even private varibles.

parent cannot access child properties.

extends keyword
->child class contains properties of base class and it will have additional properties of its own.
->When you call the constructor of the child class you have to initialize the properties of base class also.
->Private properties cannot be accessed by the child classes.
->Properties of child class cannot be accessed by the parent class.

->Object class is the superclass of all classes
-Why to have super keyword at first
 */
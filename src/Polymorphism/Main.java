package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        //Type of the reference variable is of parent class and the type of object is of subclass
        /*
        Reference type determines which one to access
        Object type determines which one to run
         */
        Shapes circle=new Circle();
//        Square square=new Square();
        Shapes square=new Square();
        shape.area();
        circle.area();
    }

}

/*
Types of polymorphism
->Compile time/static polymorphism/Early biding
  achieved via method overloading in java(operator overladoign)
  method overloading means smae name of methods, but return type or arguments can be different
    example is multiple constructors


->Runtime/ Dynamic polymorphism/Late binding
    achieved by method overriding
    only function body is different.
->Dynamic method dispatch
    when the program is running , java will determine which method to run
    ->Superclass reference variable can refer to a subclass object.
    ->

->final keyword to prevent overriding
->If you declare a method as final, cant be overridden.
->Used to prevent inheritance
->Whenever you declare a class as final, all methods inside it will become final
->Overriding static methods
    cannot override static methods     in the parent class will always run because they are not dependent on objects
    Static methods can be inherited but cannot be over
    Overriding depends on objects static does not depend on objects
        hence static methods cannot be overridden.
        overloading and overriding does not apply to instance variable.
 */
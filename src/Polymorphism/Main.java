package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
//        Square square=new Square();
        Shapes square=new Square();
        shape.area();
        circle.area();
    }

}

/*
Types of polymorphism
->Compile time/static polymorphism
  achieved via method overloading in java(operator overladoign)
  method overloading means smae name of methods, but return type or arguments can be different
    example is multiple constructors


->
 */
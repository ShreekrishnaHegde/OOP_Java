package Polymorphism;

public class Circle extends  Shapes{
    /*
    Below line will run when object of child class is created
    hence it is overriding  the parent method
     */

    void area(){
        System.out.println("I'm in circle");
    }
}

package AbstractClasses;

public abstract class Parent {
    int age;
    abstract void career();
    abstract void partner();


}
/*
->To have an abstract method, parent class should be abstract. In other words non-abstract method cannot
    have abstract classes.
->Every child class has to override all the abstract methods in the parent class.
->You cannot create objects of an abstract class.
->Abstract constructors
->You cannot Abstract constructors
-> Static methods can be implemented in the abstract method.
->You cannot instantiate an abstract class directly.
->You cannot have final abstract class
->Multiple inheritance is not possible in abstract clases.


->Interfaces contain abstract functions.
->No body of the function is allowed.
->Variables are static and final by default in interfaces.
->Abstract classes can provide the implementation of the interface, but
    interface cannot provide the implementation of abstract classes.
->Implements keyword
->Multiple inheritance is allows using interfaces.
->

 */

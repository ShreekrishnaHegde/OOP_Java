package Access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(34,"Krishnsa");
        obj.getNum();
    }

}
/*
public-in the same package you can access
private-in the same class you can access
->only the subscales can access members in the protected class when it's outside the package
->Package has two types
    user defined and in built

----------------lang package--------------
->JAva language specific things.
----------------IO package---------------
->
------------------util-------------------
->Utility classes and data structures and collection frameworks
------------------applet-----------------
->
------------------awt---------------------
->
--------------------net-------------------
->networking operations
----------------------Object Class inside lang----------
->It is the top most class in inheritance
->All classes are children of object class. Even though you explicitly extend a class from parent class
    the child class is still extends from object class even though multiple inheritance is not allowed in java.
------------------Object Methods--------------------

-----------------HashCode method-------------
->A number representation of an object.
->Unique representation of an object using numbers.
->HashCode is not the address
->It is random integer value created by some algorithm
->You can override the default hashcode function in java.

------------------Equals--------------------
--Difference between == and .equals


---------------Instance operator--------------------

--------------getClass Method----------------


--Difference between object and instance

 */
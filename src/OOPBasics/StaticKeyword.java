package OOPBasics;

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human krishna=new Human(19,"Krishna",false);
        Human Abhi=new Human(23,"Abhi",false);
        System.out.println(Human.population);
        StaticKeyword obj=new StaticKeyword();
        obj.panda();
//        panda();
    }
    void panda(){
        System.out.println("Skadoosh");
    }
}


/*
->Use class name to access static variable.
->When a member is declared static, it can be accessed before any of the object of the class is being created.
--------Why main is static?------------
->We can use the main method without creating the object og the class.
->In order to create anything inside a class, we need to create an object of that class,
    But main is the entry point of a program, hence we use static keyword to use main function
    without creating any object of the main class.
->Inside a static method, you cannot use anything that is non-static.
->You cannot directly use a non-static function inside a static function without creating an object.
->Static functions belong to the class itself, not to specific instances.
->They can be called without creating an object. Non-static functions belong to individual instances of a class.
->They require an object to be called. Hence, non-static function "panda" cannot be accessed from static function.
 ->But you can use "panda" by declaring it as static.
 */

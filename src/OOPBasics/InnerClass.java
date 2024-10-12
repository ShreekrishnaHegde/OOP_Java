package OOPBasics;

public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }

//        @Override
//        public String toString() {
//            return super.toString();
//        }
    }
    public static void main(String[] args) {
        Test a=new Test("Krishna");
        Test b=new Test("Abhi");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
/*
->Where it is mentioned as static,
-----Reason for the output-----------
->Class Test is declared as static which is inside the InnerClass. Hence, Class test is not dependent on
    the objects of InnerClass. Hence, you can access class Test without creating an object of InnerClass.
->But Test can have its own objects, but static here means class Test is independent of instances of the
    "InnerClass".
->Static methods/variables are resolved during compile time.

 */

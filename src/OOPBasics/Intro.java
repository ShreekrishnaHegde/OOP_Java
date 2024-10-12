package OOPBasics;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        //Store 5 roll numbers, Every single elements contains integers
        int[] roll_no=new int[5];
        //Store names, Every single elements contains Strings
        String[] names=new String[5];
        //Every single element of students array contains 3 properties.
        Student[] students=new Student[5];
        //Declaring reference variable "student1" of type Student
        //student1 is in stack memory, Object is not yet created.
        //This happens at compile time.
        //When object is not initialized, its value is null.
        Student student1;
        //This line dynamically allocates the memory at runtime and returns a reference to it(student1).
        //Reference is stored in student1 variable.
        student1=new Student(23,"Shreekrishna",90);
        Student student2=new Student(23,"Abhilash",90);
        Student student3=new Student(student1);
        student3.greeting();

    }

    static  class Student {
        int roll_no;
        String name;
        float marks;
        Student(){
            this.roll_no=10;
            this.name="Shreekrishna Hegde";
            this.marks=90;
        }
        void greeting(){
            System.out.println("Hello "+name+ " you have scored "+this.marks+" Congrats!");
        }
        Student(int roll_no,String name,float marks){
            this.roll_no=roll_no;
            this.marks=marks;
            this.name=name;
        }
        Student(Student other){
            this.roll_no=other.roll_no;
            this.name=other.name;
            this.marks=other.marks;
        }
        //calling constructor from another constructor
//        Student(){
//            this(13,"K",50);
//        }
    }
}
/*
->Clas is a names group of properties and functions.
->It is like a blueprint
->Ex: Car is a class, BMW , audy are its objects.
->Class is the template of the object.
->Object is an instance of a class.
->Class is a logical construct.
->Object occupies spaces in memory , but not the class.
->The variables inside object are called instance variable.
->Dot operator links reference variable and instance variable.
->Constructor is a special function that runs when you create an object and it allocates some variables.
->
 */

package inheritance;

public class Box{
    double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    //Cube
    Box(double side){
//        super();
        this.l=side;
        this.h=side;
        this.w=side;

    }

    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("Hey!");
    }
}
/*
----------super keyword--------
->to class the keyword
->Differene between super.weight and this.weight --when the name of two fields are same.. to specify the class
->
 */

package inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double l,double h, double w, double weight){
        super(l,h,w);//used to initialize the values in parents class constructor
        this.weight=weight;

    }
}
/*
But private variables cannot be used outside the class.Even private varibles.

parent cannot access child properties.
 */
package Inheritance.extra_practice;

public class Box_Weigth extends Box{
    double weigth;
    Box_Weigth(){
        this.weigth = -1;
    }
    public Box_Weigth(double l,double h,double w,double weigth){
        super(w,h,l);// what is this ? call the parent class constructor with same parameter
        // it will find the constructor with thw same parameter and it will initialise the value
        this.weigth = weigth;
    }
    Box_Weigth (Box_Weigth old){
        this.h = old.h;
        this.w = old.l;
//        System.out.println("Hello");
    }
}

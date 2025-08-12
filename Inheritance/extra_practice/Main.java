package Inheritance.extra_practice;

public class Main {
    public static void main(String[] args){

        Box_Weigth bg = new Box_Weigth(5.2,5.3,4,10);
        Box_Weigth cg = new Box_Weigth(bg);
        System.out.println(bg.h);
        System.out.println(cg.w);
    }
}

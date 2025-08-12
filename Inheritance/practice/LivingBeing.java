package Inheritance.practice;

public class LivingBeing {
    void breathe(){
        System.out.println("Breathing....");
    }
}
class Animal1 extends LivingBeing{
    void eat(){
        System.out.println("Eating....");
    }
}
class dog extends  Animal1 {
    void bark(){
        System.out.println("Barking....");
    }
    public static void main(String[] args){
        dog d = new dog();
        d.breathe();
        d.eat();
        d.bark();
    }
}

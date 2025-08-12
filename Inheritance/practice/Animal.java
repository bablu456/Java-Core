package Inheritance.practice;

public class Animal {
    void MakeSound(){
        System.out.println("Animal sound !!!! ");
    }
}
class Dog extends Animal {
    void MakeSound(){
        System.out.println("Dog is Barking !!!! ");
    }

    public static void main(String[] args) {
        Dog d1 =  new Dog();
        d1.MakeSound();
    }
}

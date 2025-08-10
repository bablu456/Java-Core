package Polymorphism.practice;

public class Animal {
    void make(){
        System.out.println("Animal Make Sound");
    }
}
class Dog extends Animal {
    void make(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void make(){
        System.out.println("Cat meows");
    }
    public static void main(String[] args){
        Cat c = new Cat();
        c.make();
        Dog d = new Dog();
        c.make();
        Animal a = new Animal();
        a.make();
    }
}

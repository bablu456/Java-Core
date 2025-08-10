package Polymorphism.home_work;

public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound ");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meows ");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Animal s = new Animal();
        s.makeSound();
    }
}

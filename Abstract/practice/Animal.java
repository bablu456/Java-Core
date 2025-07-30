package Abstract.practice;

abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dogs barks");
    }
    void describe(){
        System.out.println("dog is a animal !! ");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat meow !! ");
    }
    void describe(){
        System.out.println("Cat is animal ! ");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
        d.describe();
    }
}

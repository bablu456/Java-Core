package Abstract.home_Work;

abstract class Animal {
    abstract void makeSound();

}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dogs Bark's");
    }
}
class Cat extends  Animal{
    void makeSound(){
        System.out.println("Cat Meow ");
    }
}
class Cow extends Animal{
    void makeSound(){
     System.out.print("Cow Speak !! ");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Cow cow = new Cow();
        cow.makeSound();
    }
}

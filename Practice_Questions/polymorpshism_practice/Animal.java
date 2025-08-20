package Practice_Questions.polymorpshism_practice;

public class Animal {
    void makeSound(){
        System.out.println("Animal Makes Sound ");
    }

}
class dog extends Animal{
    void makeSound(){
        System.out.println("Dog Barks ");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat Meows ");
    }
    public static void main(String[] args){
        Cat a = new Cat();
        a.makeSound();
        dog  b = new dog();
        b.makeSound();
        Animal c = new Animal();
        c.makeSound();
    }
}
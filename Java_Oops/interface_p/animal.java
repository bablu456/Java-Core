package Java_Oops.interface_p;

public interface animal {
    void makeSound();
}
class Dog implements animal{
    public void makeSound(){
        System.out.println("Dogs Barks !!1 ");
    }
}
class Cat implements animal{
    public void makeSound(){
        System.out.println("Cat Meow !!");
    }
}
class Cow implements animal{
    public void makeSound(){
        System.out.println("Cow sound ");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
        Cat c =new Cat();
        c.makeSound();
        Cow w = new Cow();
        w.makeSound();
    }
}

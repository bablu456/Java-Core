package Home_Work.inheritance;

public class Animal {
    void makeSound(){
        System.out.println("Animal sound like a creepy !!");
    }
}
class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

package Home_Work.inheritance;

public class Animal2 {
    void eat(){
        System.out.println("Animal is eating.. ..");
    }
}
class cat extends Animal2{
    void eat(){
        System.out.println("Cat is eating.. ..");
    }
    void sound(){
        System.out.println("Cat meows ");
    }

    public static void main(String[] args) {
        cat n = new cat();
        n.eat();
        n.sound();
    }
}

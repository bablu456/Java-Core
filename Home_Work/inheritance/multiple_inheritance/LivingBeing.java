package Home_Work.inheritance.multiple_inheritance;

public class LivingBeing {
    void breather(){
        System.out.println("Breathing.....");
    }
}
 class Animal extends LivingBeing {
    void eat(){
        System.out.println("Eating...");
    }
 }
 class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }

     public static void main(String[] args) {
         Dog d = new Dog();
         d.breather();
         d.eat();
         d.bark();
     }
 }



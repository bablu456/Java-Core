package Oops;
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a animal ");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class animal_fun {
    public static void main(String[] args) {
        horse hors = new horse();
//        hors.walk();
////        Animal animal = new Animal();



    }
}

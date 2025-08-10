package Polymorphism.home_work;

public class Greeter {
    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("Hello , "+name);
    }
    void greet(String name ,String time){
        System.out.println("Good "+time+","+name);
    }
    public static void main(String[] args){
        Greeter g = new Greeter();
        g.greet();
        g.greet("Bablu");
        g.greet("Bablu","morning");
    }
}

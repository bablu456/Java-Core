package Practice_Questions.polymorpshism_practice;

public class Greeter {
    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("hello ,"+name);
    }
    void greet(String name , String time){
        System.out.println("Good "+time+" "+name);
    }
    public static void main(String[] args){
        Greeter g = new Greeter();
        g.greet();
        g.greet("Bablu");
        g.greet("Sandeep","Good Morning");
    }
}

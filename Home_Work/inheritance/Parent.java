package Home_Work.inheritance;

public class Parent {
    Parent(){
        System.out.println("this is a parents class ! ");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class called !! ");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}

package Practice_Questions.object_and_class;

public class Main {
    public static void main(String[] args){
        Static_Example r = new Static_Example(22,"B",20000,true);
        System.out.println(Static_Example.polulation);
    }
    static void fun(){
        Main obj = new  Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello wrolds ");
    }
}

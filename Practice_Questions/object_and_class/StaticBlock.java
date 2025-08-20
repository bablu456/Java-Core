package Practice_Questions.object_and_class;

public class StaticBlock {
    static int a = 5;
    static  int  b ;

    static {
        System.out.println("I'm in Static Block !!");
        b = a *a;
    }
    public static void main(String[] args){
        StaticBlock obj = new  StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b = 6;
        
        System.out.println(obj.b);
    }
}

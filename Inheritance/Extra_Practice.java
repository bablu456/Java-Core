package Inheritance;

public class Extra_Practice {
    int age;
    String name;
    Extra_Practice(){
        System.out.println("Hello Chutiye !! ");
    }

}
class Practice extends Extra_Practice{
    Practice(){
        System.out.println("Bol Lavde !!");
    }
    void print(){
        age = 6;
        name = "Bab";
    }
    public static void main(String[] args){
        Practice p = new Practice();
        System.out.println(p.age);
    }

}

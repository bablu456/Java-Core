package constructor;
import java.util.Scanner;
public class this_callConst {
    int id;
    String name;
    String department;

    this_callConst (int id,String name,String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
    this_callConst(int id,String name){
        this(id,name,"general");
    }
    void show(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee department name : "+department);
    }
    public static void main(String[] args) {
        this_callConst s1 = new this_callConst(123,"Rohan");
        s1.show();

    }
}

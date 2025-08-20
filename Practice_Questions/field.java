package Practice_Questions;
import java.util.Scanner;
class student{
    String name;
    int age;

    public boolean adult(){
        if(this.age>=18){
        return true;
        }else{
            return false;
        }
    }
}
public class field {
    public static void main(String[] args){
        student s = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        s.name = sc.nextLine();
        System.out.println("Enter the age : ");
        s.age = sc.nextInt();
        System.out.println(s.adult());


    }
}

package Home_Work.inheritance;
import java.util.Scanner;
public class shape2 {
    void perimeter(){
        System.out.println("Calculating perimeter.....");
    }
}
class Square extends shape2{
    Scanner sc = new Scanner(System.in);
    int side;
    void input(){
        System.out.println("Enter the side : ");
        side = sc.nextInt();
    }
    void perimeter(){
        System.out.println("Perimeter of Squad : "+(side*4));
    }

    public static void main(String[] args) {
        Square n = new Square();
        n.input();
        n.perimeter();
    }
}

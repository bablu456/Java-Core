package Basics;
import java.util.Scanner;
public class Variables {
    String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Variables n = new Variables();
        System.out.println("Enter the any number : ");
        n.name = sc.nextLine();
        System.out.println(n.name);

    }
}

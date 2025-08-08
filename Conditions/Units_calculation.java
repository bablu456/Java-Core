package Conditions;
import java.util.Scanner;
public class Units_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units : ");
        int unit = sc.nextInt();
        if(unit<=100){
            System.out.println("this is your bill "+unit*1);
        } else if (unit>=101 && unit<=200) {
            System.out.println("this is your bill "+unit*2);

        }else{
            System.out.println("your bill is "+unit*3);
        }
    }
}

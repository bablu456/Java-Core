package Method;
import java.util.Scanner;
public class printEvenNumber {
    public static void printEven(int a){
        for(int i=1;i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        printEven(num);

    }
}

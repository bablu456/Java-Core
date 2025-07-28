package Method;
import java.util.Scanner;
public class fibbonaci {
    public static void fibbonaciPrint(int num){
        int a = 0;
        int b = 1;
        for(int i=1;i<=num;i++){
            if(a==0 && b==1){
                System.out.print(a);
                System.out.print(b);
            }
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibbonaciPrint(n);

    }
}

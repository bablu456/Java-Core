package class_work;
import java.util.Scanner;
public class print_5_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
       a: for(int i=2;true;i++){
            boolean flag = true;
          b:  for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    count++;
                    if(count==5){
                        break a;
                    }
                }
            }
            if(flag){
                System.out.println("this is a prime no "+i);
            }
        }
    }
}

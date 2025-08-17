package Home_Work;
import java.util.Scanner;
public class Bank_view {
    String accountHolderName;
    String accountNumber;
    double balance;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("The "+amount+"added in your Account Successfully !!");
    }
    void withdrawel(double money) {
        if (balance != 0) {
            balance = balance - money;
            System.out.println("The " + money + "Deduct Successfully!!");
        }
    }
        void display(){
            System.out.println("the total balance is : "+balance);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_view bank = new Bank_view();
        System.out.println("Enter the account holder name : ");
        bank.accountHolderName = sc.nextLine();
        System.out.println("Enter the account number : ");
        bank.accountNumber = sc.nextLine();
        System.out.println("Enter the bank balanace : ");
        bank.balance = sc.nextInt();
        bank.display();
    }
}

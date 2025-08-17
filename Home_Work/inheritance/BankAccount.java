package Home_Work.inheritance;

import java.util.Scanner;

public class BankAccount {
    Scanner sc = new Scanner(System.in);
    double Balance;
    void input(){
        System.out.println("Enter the Balance : ");
        Balance = sc.nextInt();
    }
    void displayBalance(){
        System.out.println("intital Balance : "+Balance);
    }
}

class SavingsAcoount extends BankAccount{
    Scanner sc = new Scanner(System.in);
    double deposit;
    void add(){
        System.out.println("Enter the Deposit Amount : ");
        deposit = sc.nextInt();
    }
    void deposit(){
        Balance = Balance + deposit;
        System.out.println("New Balanace : "+Balance);
    }

    public static void main(String[] args) {
        SavingsAcoount n = new SavingsAcoount();
        n.input();
        n.displayBalance();
        n.add();
        n.deposit();
    }
}

package Home_Work.inheritance;
import java.util.AbstractCollection;
import java.util.Scanner;
public class Account {
    double balance = 1000;
    void showBalance(){
        System.out.println("The total balance is : "+balance);
    }
}
class SavingAccount extends Account {
    double intrest = 5;
    void showBalance(){
        double store = (balance * intrest )/ 100;
        double total = balance + store;
        System.out.println("The total Balance after intrest is : "+total);
    }
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.showBalance();
    }

}

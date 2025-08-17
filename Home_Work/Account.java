package Home_Work;
import java.util.Scanner;
public class Account {
    String userName;
    String password;
    boolean loginStatus;
    void login(String inputPassword){
        if(this.password == inputPassword){
            loginStatus = true;
            System.out.println("login system successfully match successfully ");
        }else{
            loginStatus = false;
            System.out.println("password didn't match ");
        }
    }
    void status (){
        if(loginStatus){
            System.out.println("user is login ");
        }else{
            System.out.println("user isn't login ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        System.out.print("Enter the user name : " );
        a1.userName = sc.nextLine();
        System.out.println("Enter the user password : ");
        a1.password = sc.nextLine();
        System.out.println("Enter the password to login : ");
        String pass = sc.nextLine();
        a1.login(pass);
        a1.status();
    }
}

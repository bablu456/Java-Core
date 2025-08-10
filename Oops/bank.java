package Oops;
class Account  {
    public String name;
    protected String email;
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void setpassword(String pass){
        this.password = pass;
    }
}

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Bablu kumar";
        account1.email = "bablu707041dk@gmail.com";
        account1.setpassword("bablu");
        System.out.println(account1.getPassword());
    }
}

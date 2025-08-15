package Encapsulation;

public class Implementation {
    // setter method to Asign a Value
    private String name;
    public void setName (String n){
        name = n;
    }
    // getter Method to retrieve a Value
    public String getName(){
        return name;
    }
}
class main{
    public static void main(String[] args){
        Implementation i = new Implementation();
        i.setName("Bablu");
        System.out.println(i.getName());
    }
}

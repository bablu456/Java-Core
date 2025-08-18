package Practice_For_Test;

public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age)
    {
        if(age>=0 && age<=120) {
            this.age = age;
        }else{
            throw new IllegalArgumentException("Please Enter Positive Age ");
        }
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
  public  String toString(){
        return "Name : "+name+"\nAge : "+age;
    }
    public static void main(String[] args){
       Person p = new Person("Bablu",22);
       p.setAge(23);
        System.out.println(p.toString());
    }
}

package constructor;

public class student1 {
    int id;
    String name;
    student1(int id,String name){
        this.id = id;
        this.name = name;
    }
    void info1(){
        info a = new info();
        a.print(this);
    }

}
class info{
    void print(student1 s){
        System.out.println("ID : "+s.id);
        System.out.println("Name : "+s.name);

    }
    public static void main(String[] args) {
        student1 s = new student1(123,"Bablu");
        s.info1();
    }
}

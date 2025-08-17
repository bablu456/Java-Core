package Home_Work.inheritance;

public class Person {
    void showDetails(){
        System.out.println("Person details !!");
    }

    }
    class s1 extends Person{
    void showDetails(){
        System.out.println("Studetn Details !! ");
    }

        public static void main(String[] args) {
            s1 s = new s1();
            s.showDetails();
        }
    }


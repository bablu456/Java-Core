package Practice_Questions.polymorpshism_practice;


public class Student {
    void printDetails(String name,int age){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    void printDetails(String name,int age,String course){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Course : "+course);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.printDetails("Bablu",12);
        s.printDetails("Sandeep",22,"B.tech");
    }
}

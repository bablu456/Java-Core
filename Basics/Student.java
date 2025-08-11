package Basics;

public class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Student : "+name + "\nID : "+id;
    }
    public static void main(String[] args){
        Student t = new Student(12,"Bablu");
        System.out.println(t);
//        System.out.println(t);
    }
}

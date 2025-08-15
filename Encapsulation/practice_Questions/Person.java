package Encapsulation.practice_Questions;

import java.util.Set;

public class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age){
        this.name = name;
        this.age = age;
//        this.email = email;
    }
    public void setAge(int age) {
        if(age<=120) {
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
//    public void setEmail(String email) {
////        for(i)
//        this.email = email;
//    }
//    public String getEmail() {
//        return email;
//    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    void show(){
        System.out.println("Name : "+getName()+"\nAge :  "+getAge());
    }
    public static void main(String[] args){
        Person p = new Person("bablu",22);
        p.show();
    }

}

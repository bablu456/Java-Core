package Oops;

public class student_Class {
    String model;
    int year;
    String name;
    void start() {
        System.out.println(model + " Started! ");
    }


    public static void main(String[] args) {
        student_Class  mycar = new student_Class();
        student_Class car = new student_Class();
        mycar.model = "Tesla";
        mycar.start();
        System.out.println(car.year);
    }
    //we need a way to add values of the above
    // properties object by object
    // we need one word to access every object
    student_Class(){
        this.year = 2025;
        this.model = "Audi";
        this.name = "bablu";

    }
}

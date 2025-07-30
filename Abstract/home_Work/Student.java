package Abstract.home_Work;

abstract class Student {
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    abstract void generateReport();
}
class EngineerStudent extends Student{
    int marks;
    EngineerStudent(String name,int rollNo,int marks){
        super(name,rollNo);
        if(marks>0 && marks<=100){
            this.marks = marks;
        }else{
            throw new IllegalArgumentException("Please Enter the Marks Between 0 and 100 !! ");
        }
    }
    void generateReport(){
        System.out.println("Student Name  : "+name);
        System.out.println("Student Roll Number : "+rollNo);
        System.out.println("Student Marks : "+marks+" Student Pass : "+(marks>=40));
    }
}
class MedicalStudent extends Student{
    int marks;
    MedicalStudent(String name,int rollNo,int marks){
        super(name,rollNo);
        if(marks>0 && marks<=100){
            this.marks = marks;
        }else{
            throw new IllegalArgumentException("Please Enter The Marks between 0  and 100 ");
        }
    }
    void generateReport(){
        System.out.println("Student Name : "+name);
        System.out.println("Student Roll Number : "+rollNo);
        System.out.println("Student Marks : "+marks+" Student Pass : "+(marks>=40));
    }
public static void main(String[] args){
        EngineerStudent en = new EngineerStudent("Sumeet kumar",12,100);
        MedicalStudent ms = new MedicalStudent("Bablu kumar",13,40);
        en.generateReport();
        ms.generateReport();
}
}


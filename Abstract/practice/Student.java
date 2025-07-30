package Abstract.practice;

abstract class Student {
    String name;
    int rollNo;

    Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    abstract void generate();
}
class engneer extends Student{
    int marks;
    engneer(String name,int rollNo,int marks){
        super(name,rollNo);
        this.marks = marks;
    }
    void generate(){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollNo);
        System.out.println("Marks "+marks+" pass or fail : "+(marks>=40));
    }
    public static void main(String[] args){
        engneer e = new engneer("Bablu",123,45);
        e.generate();
    }
}

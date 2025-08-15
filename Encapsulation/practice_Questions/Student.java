package Encapsulation.practice_Questions;

public class Student {
    private String name;
    private int rollNumber;
    private double mathGrade;
    private double scienceGrade;
    private double englishGrade;
    
    Student(String name,int age){
        this.name = name;
        this.rollNumber = age;
    }
    public void setName(String s){
        name  = s;
    }
    public void setRollNumber(int roll){
        rollNumber = roll;
    }
    public void setMathGrade(double math){
        mathGrade = math;
    }
    public void setScienceGrade(double sciene){
        scienceGrade = sciene;
    }
    public void setEnglishGrade(double eng){
        englishGrade = eng;
    }
    double getAverageGrade(){
        return (scienceGrade + englishGrade + mathGrade)/3; 
    }
    void getLettergrade(){
        if(getAverageGrade()>=90 && getAverageGrade()<=100){
            System.out.println("A Grade ");
        } else if (getAverageGrade()>=80  && getAverageGrade()<=89) {
            System.out.println("B Grade ");
        } else if (getAverageGrade()>=70 && getAverageGrade()<=79) {
            System.out.println("C Grade ");
        } else if (getAverageGrade()>=60 && getAverageGrade()<=69) {
            System.out.println("D Grade ");
        }else{
            System.out.println("F ");
        }
    }
    public static void main(String[] args){
        Student s = new Student("Bablu",123);
        s.setEnglishGrade(50);
        s.setMathGrade(90);
        s.setScienceGrade(100);
        System.out.println(s.getAverageGrade());
        s.getLettergrade();
        
    }
}

package Home_Work.inheritance;

public class Collage {
    String collegeName = "Techno Institute";

}
class Admission extends Collage {
    String studentName = "Ananya";
    String course = "B.Tech";
    void display(){
        System.out.println("Collage : "+collegeName);
        System.out.println("Course : "+course);
        System.out.println("Student : "+studentName);
    }

    public static void main(String[] args) {
        Admission a = new Admission();
        a.display();
    }
}

package Home_Work.inheritance;

public class Food {
    String foolName = "Gulab Jamun";
    void  display(){
        System.out.println("food display : "+foolName);
    }
}
class Desert extends Food{
    String sweetLevel = "high";
    void display(){
        System.out.println("food : "+foolName);
        System.out.println("Sweetness : "+sweetLevel);
    }

    public static void main(String[] args) {
        Desert d = new Desert();
        d.display();
    }

}

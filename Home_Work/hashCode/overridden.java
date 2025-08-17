package Home_Work.hashCode;
import java.util.Objects;
public class overridden {
    int id;
    String name;
    overridden(int id,String name){
    this.id = id;
    this.name = name;
    }
    public int hashCode(){
        return Objects.hash(id,name);
    }
    public static void main(String[] args) {
        overridden s1 = new overridden(1,"alice");
        overridden s2 = new overridden(1,"alice");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

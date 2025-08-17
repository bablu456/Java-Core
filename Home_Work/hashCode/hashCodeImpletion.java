package Home_Work.hashCode;

public class hashCodeImpletion {
    int id;
    String name;
        hashCodeImpletion(int id,String name){
            this.id = id;
            this.name = name;
        }
    public static void main(String[] args) {
        hashCodeImpletion s = new hashCodeImpletion(1,"alice");
        hashCodeImpletion s1 = new hashCodeImpletion(1,"alice");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}

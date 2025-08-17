package Home_Work.hashCode;

public class toStingImpletion {
    int id;
    String name;

    toStingImpletion(int id,String name){
        this.id = id;
        this.name = name ;
    }

    public static void main(String[] args) {
        toStingImpletion s1 = new toStingImpletion(1,"alice");
        System.out.println(s1);
    }
}

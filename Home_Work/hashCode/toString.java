package Home_Work.hashCode;

public class toString {
    int id;
    String name;
    toString(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String  toString(){
        return "Student id = "+id+" name "+name+ """
                """;
    }

    public static void main(String[] args) {
        toString s1 = new toString(1,"Alice");
        toString s2 = new toString(1,"Alice");
        System.out.println(s1);
    }
}

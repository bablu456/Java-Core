package Abstract.practice;

public interface printer {
    abstract void print(String document);
}
class injet implements printer{
    public void print(String document){
        System.out.println(document);
    }
}
class laser implements printer{
    public void print(String document){
        System.out.println(document);
    }
    public static void main(String[] args){
        injet i = new injet();
        i.print("Hey ");
    }
}

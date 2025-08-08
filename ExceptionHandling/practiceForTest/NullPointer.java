package ExceptionHandling.practiceForTest;

public class NullPointer {
    public static void main(String[] args){
        String s = null;
        try{
            int k = s.length();
            System.out.println(k);
        }
        catch (NullPointerException n){
            System.out.println(n.getMessage());
        }
    }
}

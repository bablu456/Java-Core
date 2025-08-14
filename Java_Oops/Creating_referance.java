package Java_Oops;

interface  Creating_referance {
    void play();
}
abstract class check{
    abstract void pl();
}
class p  extends check implements  Creating_referance{
    public void play(){
        System.out.println("playing Games !! ");
    }
    void pl(){
        System.out.println("playing chess ");
    }
    void k (){
        System.out.println("h");
    }

    public static void main(String[] args) {
        Creating_referance r ;
        check p;
        
    }
}

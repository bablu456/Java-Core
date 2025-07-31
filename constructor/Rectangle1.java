package constructor;

public class Rectangle1 {
    int lenght ;
    int breath ;
    Rectangle1(int lenght,int breath){

        this.lenght = lenght;
        this.breath = breath;
    }
    boolean method(Rectangle1 r){
        int area1 = this.lenght * this.breath;
        int area2 = r.lenght * r.breath;
        return area2 == area1;
    }

    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(5,10);
        Rectangle1 r2 = new Rectangle1(10,10);
        boolean store = r1.method(r2);
        System.out.println(store);
    }
}


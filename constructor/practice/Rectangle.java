package constructor.practice;

import org.w3c.dom.css.Rect;

public class Rectangle {
    int lenght;
    int breath;
    Rectangle(int lenght,int breath){
        this.lenght = lenght;
        this.breath = breath;
    }
    boolean compare(Rectangle r){
        int area1 = this.lenght * this.breath;
        int area2 = r.breath * r.breath;
        return area2 == area1;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(10,10);
        boolean flag = r1.compare(r2);
        System.out.println("flag");
    }
}

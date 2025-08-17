package Home_Work;

import java.util.Scanner;

public class rectangle {
    double lenght;
    double width;
    double  calculateAre(){
        return width * lenght;
    }
    double permiter(){
        return (lenght + width ) * 2;
    }
    void display(){
        System.out.println("the lenght is "+lenght);
        System.out.println("the width is "+width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r = new rectangle();
        System.out.println("Enter the lenght : ");
        r.lenght = sc.nextInt();
        System.out.println("Enter the width : ");
        r.width = sc.nextInt();
    }
}

package constructor;

import java.util.Scanner;

public class book {
    String title;
    String author;
    int price;
    book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    book(String title,String author){
        this.title = title;
        this.author = author;
        this.price = 250;
    }
    void display(){
        System.out.println("book title name : "+title);
        System.out.println("book author name : "+author);
        System.out.println("book price : "+price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title name  : ");
        String title = sc.next();
        System.out.println("Enter the book author name : ");
        String author = sc.next();
        System.out.println("Enter the book price : ");
        int price = sc.nextInt();
        book b1 = new book(title,author,price);
        b1.display();
        System.out.println("Enter the book title name  : ");
        String title1 = sc.next();
        System.out.println("Enter the book author name : ");
        String author1 = sc.next();
        book b2 = new book(title1,author1);
        b2.display();
    }
}

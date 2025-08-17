package Home_Work.inheritance;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    String title;
    String author;
    void input(){
        System.out.println("Enter the Title Name : ");
        title = sc.nextLine();
        System.out.println("Enter the Author Name : ");
        author = sc.nextLine();
    }
    void showDetails(){
        System.out.println("Title name : "+title);
        System.out.println("Author name : "+author);
    }
}
class LibraryBook extends Book{
    Scanner sc = new Scanner(System.in);
    int shelfNumber;
    void input1(){
        System.out.println("Enter the shelf number : ");
        shelfNumber = sc.nextInt();
    }
    void showDetails(){
        System.out.println("Title name : "+title);
        System.out.println("Author name : "+author);
        System.out.println("Shelf Name : "+shelfNumber);
    }

    public static void main(String[] args) {
        LibraryBook l = new LibraryBook();
        l.input();
        l.input1();
        l.showDetails();
    }
}

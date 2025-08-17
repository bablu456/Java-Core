package Home_Work;

import java.util.Scanner;

public class book {
    String title;
    String author;
    int price;
    int pages;
    void readPages(){
        System.out.println("The total pages read by user is : "+pages);
    }
    void updatePrice(int newPrice){
        price = newPrice;
    }
    void display(){
        System.out.println("Book Title Name : "+title);
        System.out.println("Book Author Name : "+author);
        System.out.println("Book price : "+price);
        System.out.println("Readed page : "+pages);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b1 = new book();
        int choose = 0;
        System.out.println("1 : - Enter the Details\n2 : - count pages\n3 : - update price\n4 : - display book details\n5 : - Exit");
        while(true){
        System.out.println("Please choose option according to you : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.println("Enter the book title name : ");
                    b1.title = sc.next();
                    System.out.println("Enter the book author name : ");
                    b1.author = sc.next();
                    System.out.println("Enter the book price name : ");
                    b1.price = sc.nextInt();
                    System.out.println("Enter the book page readed no : ");
                    b1.pages = sc.nextInt();
                    break;
                }
                case 2 -> b1.readPages();
                case 3 -> {
                    System.out.println("Enter the new price : ");
                    int update = sc.nextInt();
                    b1.updatePrice(update);
                }
                case 4 -> b1.display();
                case 5 -> {
                    System.out.println("Exiting the programs ......");
                    return;
                }
                default -> System.out.println("Enter the correct option !! ");
            }

        }
    }

}

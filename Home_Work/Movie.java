package Home_Work;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Movie {
    String title;
    String genre;
    int duration;
    double rating;

    void updateRating(double newRating){
        rating = newRating;
        System.out.println("The new rating is "+rating);
    }
    void watchMovie(){
        System.out.println("i'm wacthing this "+title+" movie right now");
    }
    void display(){
        System.out.println(title);
        System.out.println(genre);
        System.out.println(duration);
        System.out.println(rating);
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the movie title name : ");
        m1.title = sc.nextLine();
        System.out.println("Enter the movie genre : ");
        m1.genre = sc.next();
        System.out.println("Enter the movie duration ");
        m1.duration = sc.nextInt();
        System.out.println("enter the rating for the movue : ");
        double rate = sc.nextInt();
        m1.updateRating(rate);
        m1.display();
    }

}

package Encapsulation.practice_Questions;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;
    private boolean isRented;

    Movie(String title,String director,int year,double rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = 0;
    }
    int getYear()
    {
        return year;
    }
    String getDirector(){
        return director;
    }
    String getitle(){
        return title;
    }
    double getRating(){
        return rating;
    }
    void renMovie(){
        if(isRented){
            System.out.println("Rent Fails Alredy Rented !!");
        }
        isRented = true;
    }
    void returnMovie(){
        isRented = false;
    }
    void setRating(double rating){
        if(rating>=1.0 && rating<=10.0){
            this.rating = rating;
        }else{
            throw new IllegalArgumentException("Please Choose rating between 1.0 To 10.0 Thanks ");
        }
    }
    boolean getMovieStatus(){
        if(isRented){
            System.out.println("The Movie Is Under Rent !! ");
        }else{
            System.out.println("The Is Available !! ");
        }
        return false;
    }
    public static void main(String[] args){
        Movie m = new Movie("Bahubali","Bablu",2003,0);
        m.renMovie();
        System.out.println(m.getMovieStatus());
    }
}

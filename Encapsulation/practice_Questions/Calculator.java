package Encapsulation.practice_Questions;

public class Calculator {
    private double result;
    int a = 5;
    int b = 10;
    Calculator(){
        result = 0;
    }
public void setResult(double n){
        result = n;
}
public double getResult(){
        return result;
}
    void add(double number){
        double store = number + number;
        setResult(store);
    }
    void subtract(double number){
        double store = number - 5;
        setResult(store);
    }
    void multiply(double number){
        double store = number * number;
        setResult(store);
    }
    void divide(double number){
        double store = number % 3;
        setResult(store);
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(5);
        System.out.println(c.getResult());
    }
}

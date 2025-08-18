package Practice_For_Test.encapsulation;

public class Calculator {
    private double result;

    Calculator(){
        this.result = 0;
    }
    void add(double number){
        this.result = number + number;
    }
    void subtract(double number){
        this.result -= number;
    }
    void multiply(double numebr){
        this.result *= result;
    }
    double getResult(){
        return result;
    }
    void clear(){
        result = 0;
    }
    public static void main(String[] args){
     Calculator c = new Calculator();

    }
}

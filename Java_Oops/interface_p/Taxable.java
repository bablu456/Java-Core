package Java_Oops.interface_p;

public interface Taxable {
     double income = 50000;
    double calculateTax(double income);
}
class Employee implements Taxable{
    public double calculateTax(double percentage){
        double income_per = (income * percentage/100);
        return income_per;
    }
    public static void main(String[] args){
        Employee e = new Employee();
        System.out.println(e.calculateTax(10));
    }
}

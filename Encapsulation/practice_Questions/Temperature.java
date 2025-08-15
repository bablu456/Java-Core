package Encapsulation.practice_Questions;

public class Temperature {
    private static final double ABSOULUTE_ZERO = -273.15;
    private double celcius;
    Temperature(double value,char unit){
        switch (Character.toUpperCase(unit)){
            case 'C':
                setCelcius(value);
                break;
            case 'F':
                setFahrenheit(value);
                break;
            case 'K':
                setKelvin(value);
                break;
            default:
                throw new IllegalArgumentException("Invalid tempreture unit. Use 'C','F', or 'k'.");
        }

    }
    void setCelcius(double temp){
        if(temp<ABSOULUTE_ZERO)
        {
            throw new IllegalArgumentException("Tempreture can't be below absoulute zero(-273.153c).");
        }
        this.celcius = temp;

    }
    void setFahrenheit(double temp){
        double c = (temp - 32 )* 5 / 9;
        setCelcius(c);

    }
    void setKelvin(double temp){
        double c = temp - 273.15;
        setCelcius(c);
    }
    public double getKelvin(){
        return  celcius + 273.15;
    }
    double getFahrenheit(){
        return (celcius * 9 / 5) + 32;
    }
    double getCelcius(){
        return celcius;
    }
    public String toString(){
      return String.format("Tempreture:\nCelcius: %.2fc\nFahrenheite : %.2f\nkelvin: %.2fk",getCelcius(),getFahrenheit(),getKelvin());
    }
    public static void main(String[] args){
        Temperature t = new Temperature(100,'c');
        System.out.println(t.getFahrenheit());
        System.out.println("After Setting to 0c ");
        System.out.println(t.toString());
        System.out.println(t.getCelcius());
    }
}

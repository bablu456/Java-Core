package Java_Oops.interface_p;
@FunctionalInterface
public interface NumberCheck {
    boolean check(int num);
}
class NumbercheckTest{
    public static void main(String[] args){
        int num = 123;
        NumberCheck iseven = n -> n%2 == 0;
        NumberCheck isPrime = n -> {
            if(n <=1) return false;
            for(int i = 2;i<Math.sqrt(n);i++){
                if(n % i == 0)return false;
            }
            return false;
        };
        NumberCheck isPalindrome = n ->{
            int original = n;
            int reversed = 0;
            while(n>0){
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }
            return original == reversed;
        };
        System.out.println("Number : "+num);
        System.out.println("Is Even? "+iseven.check(5));
    }

}
package Java_Oops.interface_p;
@FunctionalInterface
public interface StringProcessor {
    String process(String input);
}
class LambdaStringOperations{
    public static void main(String[] args){
        String input = "Hello Bablu";

        // going to converte in uppercase
        StringProcessor toUpper;
        toUpper = s -> s.toUpperCase();
        System.out.println("Uppercase : "+toUpper.process(input));
        // going to converte in lowercase
        StringProcessor toLower = s -> s.toLowerCase();
        System.out.println("Lowercase: "+toLower.process(input));
        StringProcessor reverse;
        reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: "+reverse.process(input));
        StringProcessor removeVowels = s -> s.replaceAll("(?i)[aeiou]","");
        System.out.println("Without Vowels: "+removeVowels.process(input));

    }
}

package Java_Oops.practice_for_test;
@FunctionalInterface
public interface StringProcessor {
    String process(String input);
}
class lambdaimple {
    public static void main(String[] args){
        String input = "Bablu";
        StringProcessor toUpper = n -> n.toUpperCase();
        System.out.println(toUpper.process(input));
        StringProcessor toLower = n -> n.toLowerCase();
        System.out.println(toLower.process(input));
        StringProcessor reverse = n -> new StringBuilder(n).reverse().toString();
        System.out.println(reverse.process(input));

    }
}


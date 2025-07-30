package Abstract.home_Work;

import java.util.Scanner;

interface Printer {
    void pr(String document);
}
class InkjetPrinter implements Printer{
    public void pr(String p){
        System.out.println(p);
    }
}
class LaserPrinter implements Printer{
    public void pr (String p){
        System.out.println(p);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InkjetPrinter i = new InkjetPrinter();
        System.out.println("Enter your Story : ");
        String s = sc.nextLine();
        i.pr(s);
        LaserPrinter ls = new LaserPrinter();
        System.out.println("Enter your Story : ");
        String l = sc.nextLine();
        ls.pr(l);
    }
}

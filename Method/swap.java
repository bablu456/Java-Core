package Method;

public class swap {

   int swapp(int a,int b){
      int temp = a;
      a = b;
      b = temp;
//        System.out.println(a);
//        System.out.print(b);
       return a;
    }

    public static void main(String[] args) {
       swap c1 = new swap();
        int a = 15;
        int b = 10;
        int store = c1.swapp(a,b);
        System.out.println(store);
    }
}

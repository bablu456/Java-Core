package Java_Oops.interface_p;

public interface Operations {
    int operate(int a,int b);
}
class Anonymous {
    public static void main(String[] args) {
        Operations add = new Operations() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        Operations subtract = new Operations() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        Operations multi = new Operations() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };
        Operations divide = new Operations() {
            @Override
            public int operate(int a, int b) {
                return a / b;
            }
        };
        System.out.println("Addition : " + add.operate(5, 5));
        System.out.println("Subtraction : " + subtract.operate(10, 5));
        System.out.println("Multiply : " + multi.operate(2, 2));
        System.out.println("Divide : " + divide.operate(2, 1));
    }


}



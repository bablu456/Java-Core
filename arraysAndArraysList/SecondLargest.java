package MegaTestPractice.arraysAndArraysList;

public class SecondLargest {
    static int SecondMax(int[] arr){
        int Max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        for(int i : arr){
            if(Max < i) Max = i;
        }
        for(int i : arr){
            if(Smax < i && Max !=i){
                Smax = i;
            }
        }
        return Smax;
    }
    public static void main(String[] args){
        int[] arr = {5,7,2,9,1};
        int result =  SecondMax(arr);
        System.out.println(result);
    }
}

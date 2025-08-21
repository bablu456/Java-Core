package MegaTestPractice.arraysAndArraysList;

public class FindMaximum {
    static int FindMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max<i) max = i;
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int result = FindMax(arr);
        System.out.println(result);

    }
}

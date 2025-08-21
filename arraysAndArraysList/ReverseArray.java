package MegaTestPractice.arraysAndArraysList;

public class ReverseArray {
    static void Reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Reverse(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}

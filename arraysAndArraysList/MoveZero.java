package MegaTestPractice.arraysAndArraysList;

public class MoveZero {
    static void Move(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        Move(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}

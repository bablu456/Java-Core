package Array.home_Work;

public class moveZero {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int target = 0;
        int left = 0;
        int right = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}

package MegaTestPractice.arraysAndArraysList;

public class seperatePostiveNegative {
    static void Seperate(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,-1,3,-2,5};
        Seperate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

package Array.home_Work;

public class allPairs {
    public static void main(String[] args){
       int[] arr = {2,4,3,5,7};
       int sum = 7;
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[i] + arr[j] == sum){
                   System.out.println("("+i+","+j+")");
               }
           }
       }
    }
}

package MegaTestPractice.arraysAndArraysList;

public class FindMissing {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int xor = 0;
        for(int i=0;i<=arr.length+1;i++){
            xor ^= i;
        }
        int xorVal = 0;
        for(int i : arr){
            xorVal ^= i;
        }
        System.out.println(xor^xorVal);
    }
}

package Array;

public class LargestNum {
    public static int largeNum(int arr[]){
        int result=Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>=result){
                result=arr[i];
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1,2,3};
        int result=largeNum(arr);
        System.out.println(result);
    }
}

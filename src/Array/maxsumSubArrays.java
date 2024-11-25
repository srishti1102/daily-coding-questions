package Array;

public class maxsumSubArrays {
    public static int maxSumSubArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum=sum+arr[k];
                    if(maxSum<=sum){
                        maxSum=sum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] ={1,-2,6,-1,3};
        int res=maxSumSubArray(arr);
        System.out.println(res);
    }
}

package Array;

public class prefixSubArray {
    public static void prefix(int arr[]){
        int sum=Integer.MIN_VALUE;
        int result=0;
        int[] prefixSubArray=new int[arr.length];
        prefixSubArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSubArray[i]=prefixSubArray[i-1]+arr[i];
        }

        for(int i=0;i<prefixSubArray.length;i++){
            int start=i;
            for(int j=i; j<prefixSubArray.length;j++){
                int end=j;
                result=0;
                if(i==0){
                   sum=prefixSubArray[end];
                }else
                {
                    sum = prefixSubArray[end] + prefixSubArray[start-1];
                }
                if(sum<result){
                    sum=result;
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefix(arr);

    }
}

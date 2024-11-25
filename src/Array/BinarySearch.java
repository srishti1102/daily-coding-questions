package Array;

public class BinarySearch {
    public static int Binary(int arr[] ,int key){
        int start=arr[0];
        int end=arr.length-1;
        while(start<=end){
            int mid=start+end/2;
            if(arr[mid]==key){
                return mid;
            }
            if(key<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=10;
        int index=Binary(arr,key);
        System.out.println(index);
    }
}

package Array;

public class reverseAnArray {
    public static void reverse(int arr[]){
        int temp=0;
        int first=0;
        int last=arr.length-1;
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

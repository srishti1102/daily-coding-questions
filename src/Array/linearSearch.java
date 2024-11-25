package Array;

public class linearSearch {
    public static int search(int arr[],int key){
        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] num ={2,4,6,8,10,12,14};
        int key=10;
        int res=search(num,key);
        System.out.println(res);
    }
}

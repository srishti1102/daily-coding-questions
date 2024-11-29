package Recursion;

public class LastOccurence {
    public static int lastOccure(int arr[],int key,int index){
        if(index==arr.length){
            return -1;
        }
        int isFound=lastOccure(arr,key,index+1);
        //check with self
        if(isFound!=-1){
            return isFound;
        }
        if(arr[index]==key){
            return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(lastOccure(arr,key,0));
    }
}

package Recursion;

public class FirstOccurence {
    public static int firstOccure(int key,int num[],int i){
        if(i==num.length){
            return -1;
        }
        if(num[i]==key){
            return i;
        }
        return firstOccure(key,num,i+1);

    }

    public static void main(String[] args) {
        int key=5;
        int num[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccure(key,num,0));
    }
}

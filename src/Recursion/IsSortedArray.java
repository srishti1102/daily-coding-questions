package Recursion;

import java.util.Scanner;

public class IsSortedArray {
    public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);
    }
    public static void main(String[] args) {
        int num[]=new int[5];
        int j=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(sorted(num,j));
    }
}

package Recursion;

import java.util.Scanner;

public class SumOfNaturalNum {

    public static int sum(int n){
        int result=0;
        if(n==0){
            return 0;
        }
        int fn = sum(n - 1);
        return result = n + fn;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num));
    }
}

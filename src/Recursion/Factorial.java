package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int result=1;
        if(n==0){
            return 1;
        }
        int num=fact(n-1);
         result=n*num;
         return result;
    }

    public static void main(String[] args) {
        System.out.println("enter  number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(fact(num));
    }
}

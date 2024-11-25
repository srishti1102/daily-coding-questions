package Function;

import java.util.Scanner;

public class productOfNum {
    public static int product(int a,int b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=product(a,b);
        System.out.println(result);
    }
}

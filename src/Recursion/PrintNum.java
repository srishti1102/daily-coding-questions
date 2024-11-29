package Recursion;

public class PrintNum {

    public static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n=10;
        num(n);
    }
}

package Recursion;

public class FibbonacciNum {
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 =fibbo(n-1);
        int fnm2=fibbo(n-2);
        int fn=fnm1+fnm2;
        return fn;

    }
    public static void main(String[] args) {
        int n1=8;
        System.out.println(fibbo(n1));
    }
}

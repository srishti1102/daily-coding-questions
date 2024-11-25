package Function;

import java.util.Scanner;

public class checkPrimeOrNot {
    public static boolean primeOrNot(int n){
        for(int i=2;i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(primeOrNot(num));
    }
}

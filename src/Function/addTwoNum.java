package Function;

import java.util.Scanner;

public class addTwoNum {
    public static int addNum(int a ,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=addNum(a,b);
        System.out.println(res);
    }
}

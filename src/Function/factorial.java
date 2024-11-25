package Function;

import java.util.Scanner;
public class factorial {
public static int factNum(int n){
    int res=1;
    for(int i=n; i>1; i--){
        res=res*i;
    }
    return res;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=factNum(num);
        System.out.println(result);
    }
}

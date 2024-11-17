package Basic;
import java.util.*;
public class printTheLargestOfThreeNum {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if((num1>num2) && (num1>num3)){
            System.out.println(num1);
        }else if((num2>num1) && (num2>num3)){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }

    }
}

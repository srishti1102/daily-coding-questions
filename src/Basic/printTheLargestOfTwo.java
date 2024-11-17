package Basic;
import java.util.*;

public class printTheLargestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>=num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }
}

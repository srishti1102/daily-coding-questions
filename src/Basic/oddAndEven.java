package Basic;
import java.util.*;
public class oddAndEven {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}

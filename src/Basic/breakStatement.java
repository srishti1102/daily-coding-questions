package Basic;
import java.util.*;
public class breakStatement {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}

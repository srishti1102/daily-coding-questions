package Basic;

public class reverseNum {
    public static void main(String[] args) {
        int num=10899;
        int res=0;
        while(num>0) {
            int lastdigit=num%10;
            res=res*10+lastdigit;
            num=num/10;
        }
        System.out.println(res);
    }
}

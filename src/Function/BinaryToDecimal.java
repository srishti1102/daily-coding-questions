package Function;

public class BinaryToDecimal {
    public static int binaryToDecimal(int n){
        int power = 0;
        int result=0;
        while(n>0) {
            int lastDigit = n % 10;
            result = result + (lastDigit *(int)Math.pow(2,power));
            power++;
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=1001;
        int res=binaryToDecimal(n);
        System.out.println(res);
    }
}

package Basic;

public class practice {
    public static int binaryToDec(int num){
        int result=0;
        int power=0;
        while(num>0){
            int rem=num%10;
            result=result+((int)Math.pow(2,power)*rem);
            power++;
            num=num/10;
        }
        return result;
    }

    public static int decimalToBinary(int n){
        int result=0;
        int power=0;
        while(n>0){
            int rem=n%2;
            result=result+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        return result;
    }
    public static void main(String[] args) {
        int num=1011;
        int n=11;
        //System.out.println(binaryToDec(num));
        System.out.println(decimalToBinary(n));
    }
}

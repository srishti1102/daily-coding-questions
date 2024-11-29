package Basic;

public class practice {
    public static int binToDec(int n){
        int dec=0;
        int power=0;
        while(n>0){
            int rem=n%10;
            dec=dec+((int)Math.pow(2,power)*rem);
            power++;
            n=n/10;
        }
        return dec;
    }
    public static int decToBin(int n){
        int result=0;
        int power=0;
        while(n>0){
            int rem=n%2;
            result= result+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        return result;
    }

    public static void main(String[] args) {
        int num=1011;
        System.out.println(binToDec(num));
        int num1=11;
        System.out.println(decToBin(num1));
    }
}


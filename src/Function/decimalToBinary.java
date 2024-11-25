package Function;

public class decimalToBinary {
    public static int decToBin(int n){
        int binNum=0;
        int power=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        int n=7;
        int result =decToBin(n);
        System.out.println(result);
    }
}

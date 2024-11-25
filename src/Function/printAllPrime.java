package Function;

public class printAllPrime {
    public static boolean primOrNot(int n){

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void prime(int range){
        for(int i=2;i<=range; i++){
            if(primOrNot(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int range=10;
        prime(range);

    }
}

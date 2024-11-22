package Pattern;

public class invertedStar {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=i;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

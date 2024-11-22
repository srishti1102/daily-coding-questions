package Pattern;

public class charPattern {
    public static void main(String[] args) {
        char Character ='A';
     for(int i=0;i<4;i++){
         for(int j=0;j<=i;j++){
             System.out.print(Character);
             Character++;
         }
         System.out.println();
     }
    }
}

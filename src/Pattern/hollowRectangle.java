package Pattern;

public class hollowRectangle {
    public static void hollowRect(int row,int columns){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=columns;j++){
                if(i==1 || i==row || j==1|| j==columns){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      hollowRect(10,7);
    }
}

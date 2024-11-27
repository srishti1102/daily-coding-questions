package Strings;

public class FindSortestPath {
    public static float getPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            if(direction=='E'){
                x++;
            }else if(direction=='W'){
                x--;
            }else if(direction=='S'){
                y--;
            }else {
                y++;
            }
        }
        int xsqure=x*x;
        int ysqure=y*y;
        return (float)Math.sqrt(xsqure+ysqure);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getPath(path));
    }
}

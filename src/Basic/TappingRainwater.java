package Basic;

public class TappingRainwater {
    public static int trappingWater(int []height){
        //leftMax height
        int []leftMaxHeight=new int[height.length];
        int min=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            if(height[i]>min){
                min=height[i];
                leftMaxHeight[i]=height[i];
            }else{
                leftMaxHeight[i]=min;
            }
        }
        //rightMaxHeight
        int []rightMaxHeight=new int[height.length];
        int min1=Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>min1){
                min1=height[i];
                rightMaxHeight[i]=height[i];
            }else{
                rightMaxHeight[i]=min1;
            }
        }

        //calculate trapping water
        int result=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftMaxHeight[i],rightMaxHeight[i])-height[i];
            result=result+waterlevel;
        }
        return result;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappingWater(height));
    }
}

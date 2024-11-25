package Array;

public class BuyAndSellStock {
    public static int profit(int price[]){
        int minBuyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(minBuyingPrice<price[i]){
                int profit=price[i]-minBuyingPrice; //today profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                minBuyingPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        int result=profit(price);
        System.out.println(result);
    }
}

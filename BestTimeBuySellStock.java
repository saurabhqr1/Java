public class BestTimeBuySellStock{
    public static int maxProfit(int[] prices){
        int max1 =0;
        int max;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<(prices.length);j++){
                if(prices[j]>prices[i]){
                    max = prices[j]-prices[i];
                    if(max>max1){
                        max1=max;
                    }
       }        }
    }
    return max1;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int t = maxProfit(arr);
        System.out.println(t);

    }
}
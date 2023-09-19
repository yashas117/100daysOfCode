package LeetCode150.Arrays_Strings;

public class Buy_Sell_Stocks_II {

    public static void main(String args[]){

        int prices[] = {10, 1, 6, 3, 1, 8, 9};

        System.out.println("Max Profit = "+maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //int buyprice = Integer.MAX_VALUE;
        int totalprofit = 0;

        for(int i=1;i<prices.length;i++){

            if(prices[i] > prices[i-1]){
                totalprofit += prices[i] - prices[i-1];
            }
            // if(buyprice < prices[i]){
            //     int profit = prices[i] - buyprice;
            //     totalprofit += profit;
            //     buyprice = prices[i];
                
            // }
            // else{
            //     buyprice = prices[i];
            // }
        }
        return totalprofit;
    }
}

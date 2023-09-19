package LeetCode150.Arrays_Strings;

public class Buy_Sell_Stock {

    public static int buy_sell_stocks(int prices[]){

        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){

            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;       // Current profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }

        return maxProfit;
    }
    
    public static void main(String args[]){

        int prices[] = {10, 1, 6, 3, 1, 8, 9};

        System.out.println("Max Profit = "+buy_sell_stocks(prices));
    }
}

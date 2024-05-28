class StockSolution {
    public int maxProfit(int[] prices) {
        
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int profit;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < mini)
            {
                mini=prices[i];
            }
            profit=prices[i]-mini;
            maxi=Math.max(profit,maxi);
            
        }
        return maxi;
        
        
    }
}

public class Stock {
    public static void main(String[] args) {
        System.out.println("Stock problem ");

        StockSolution stockSolution = new StockSolution();
        int[] prices = {7,1,5,3,6,4};
        int result = stockSolution.maxProfit(prices);
        System.out.println("Maximum profit is " + result);
    }
}

class Solution {
    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {

                minPrice = prices[i];

            } //end of 1st if

            if (prices[i] - minPrice > maxProfit) {

                maxProfit = prices[i] - minPrice;

            } //end of 2nd if

        } //end of for

        return maxProfit;

    }//end of maxProfit

}
//code writen by umer but issue is that it has the time complexity that will be very high when the input is very large due to nested loop
// in this we take every number and get it maximum profit by selling every day and do it for all numbers untill we get the maximum profit
class Solution {
    public int maxProfit(int[] prices) {
        int n2n=0;
        int tot=0;
        for( int i=0 ; i<prices.length ;i++){
            if(i==prices.length-1){
                break;
            }
            for(int j= i+1; j<prices.length;j++){
                
                tot=prices[j]-prices[i];

                n2n=Math.max(tot,n2n);
            }
        }
        // for(int j=index+1;j<prices.length;j++){
        //     n2=prices[j]-n1;
            
        //     tot=Math.max(n2,n2n);   
        //     n2n=n2; 
        // }
      
        return n2n;
        
    }
}
// code given by chatgpt that has good time complexity due to no nested loop 
// my old code , that is not that i given up, was little bit similar to it in which i got the smallest number in the array then compare it with teh further numbers to get the maximum profit 
// but there is the limitation of my old code taht if the smallest number exist at last then it will return zero but there is a number greater than the smallest number 
// then there is the chance that it will give profit greater than zero.

class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            // update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // calculate profit if sold today
            else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}

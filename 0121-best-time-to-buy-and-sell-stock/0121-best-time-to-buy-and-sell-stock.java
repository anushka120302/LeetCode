class Solution {
public int maxProfit(int[] prices) {
int max = Integer.MAX_VALUE;
int maxProfit=0;
for(int i = 0; i<prices.length;i++){
if( prices[i]<max){
max=prices[i];
}
maxProfit = Math.max(maxProfit,prices[i]-max);
}
return maxProfit;
}
}
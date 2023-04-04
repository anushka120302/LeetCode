class Solution {
    
    int dp[]=new int[58];
    public int climbStairs(int n) {
     if(n<4)
         return n;
        
        
        
        if(dp[n]!=0)
            return  dp[n];
        else
            return dp[n]= climbStairs(n-1)+climbStairs(n-2);
            
         
    
    }
}
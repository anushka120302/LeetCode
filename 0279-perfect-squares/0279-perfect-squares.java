class Solution {
    public int numSquares(int n) {
        if(n<=3)
            return n;
        //int sq_root = Math.sqrt(n);
        int[] dp = new int[n+1];
        for(int i = 1; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][] = new int[n][n];
        return solver(s,0,n-1,dp);
    }
    public int solver(String s, int start, int e, int dp[][])
    {
        if(dp[start][e]!=0)
            return dp[start][e];
        if(start>e)
            return 0;
        if(start==e)
            return 1;
        if(s.charAt(start)==s.charAt(e))
        {
            return dp[start][e]= 2+ solver(s,start+1,e-1,dp);
        }
        else
        {
            return dp[start][e]= Math.max(solver(s,start+1,e,dp),solver(s,start,e-1,dp));
        }
    }
}
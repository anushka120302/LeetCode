class Solution {
    Integer[][] dp = null;
    public int minScoreTriangulation(int[] a) {
        dp = new Integer[a.length][a.length];
        return helper(a, 0, a.length-1);
    }
    private int helper(int[] a, int i, int j){
        if( (j-i+1) < 3) return 0;
        if(dp[i][j] != null) return dp[i][j];
        dp[i][j] = Integer.MAX_VALUE;
        for(int k=i+1; k < j; k++)
            dp[i][j] = Math.min(dp[i][j], helper(a, i, k)+a[i]*a[k]*a[j]+helper(a, k, j));
        return dp[i][j];
    }
}


// class Solution {
//     public int minScoreTriangulation(int[] values) {
//         Arrays.sort(values);
//         int sum=0;
//         for(int i =2;i<values.length;i++)
//         {
//             sum=sum+(values[0]*values[1]*values[i]);
//         }
//         return sum;
//     }
// }
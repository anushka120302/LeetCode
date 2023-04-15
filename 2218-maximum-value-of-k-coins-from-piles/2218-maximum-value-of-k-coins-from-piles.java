class Solution {
    
    public int maxValueOfCoins(List<List<Integer>> piles, int K) {
        int n = piles.size();
        int[][] dp = new int[n + 1][K + 1];
        return func(0, K, piles, dp);
    }
    
    public int func(int i, int k, List<List<Integer>> piles, int[][] dp) {
        if (dp[i][k] > 0) return dp[i][k];
        if (i == piles.size() || k == 0) return 0;
        //for going to the next pile, ye use krre h 
        int res = func(i + 1, k, piles, dp), cur = 0;
        for (int j = 0; j < piles.get(i).size() && j < k; ++j) {
            cur += piles.get(i).get(j);
            //next pile mei values nhi mili to current file se lene ke liye ye use krre h 
            res = Math.max(res, func(i + 1, k - j - 1, piles, dp) + cur);
        }
        dp[i][k] = res;
        return res;
    }

}
class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = 0;
        for (int rod : rods) {
            sum += rod;
        }

        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0; // for every dp[i], it stands for the max value of the shorter support in the pairs that have the diff of i
        // ie. for diff = 3, ther're {5, 2} (the shorter support is 2) and {10, 7} (the shorter support is 7) having the diff of 3, then dp[3] = 7

        for (int rod : rods) {
            int[] prev = dp.clone();

            for (int diff = 0; diff <= sum - rod; diff++) {
                if (prev[diff] < 0) continue;

                dp[diff + rod] = Math.max(dp[diff + rod], prev[diff]); // rod is adding to the taller support so we're passing the shorter support along
                dp[Math.abs(diff - rod)] = Math.max(dp[Math.abs(diff - rod)], prev[diff] + Math.min(diff, rod));
                // when diff >= rod, rod is adding to the shorter support, which is prev[diff] + rod
                // when rod > diff, we pass along the originally taller support because dp[diff] + diff < dp[diff] + rod
            }
        }

        return dp[0];
    }
}

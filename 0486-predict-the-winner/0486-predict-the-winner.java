class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int s=0,e=nums.length-1;
        return (Scores(nums,s,e)>=0);
    }
    public int Scores(int nums[], int s, int e)
    {
        if(s==e)
        return nums[s];

            int chooseStart=nums[s]-Scores(nums,s+1,e);
            int chooseEnd=nums[e]-Scores(nums,s,e-1);

            return Math.max(chooseStart,chooseEnd);
        
    }
}
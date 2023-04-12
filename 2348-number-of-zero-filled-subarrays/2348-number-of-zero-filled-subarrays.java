class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        long c=0;

        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            ans=ans+(++c);
            else
            c=0;
        }
        return ans;
    }
}
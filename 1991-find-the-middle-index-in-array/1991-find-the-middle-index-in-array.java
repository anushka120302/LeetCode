class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int left=0,right=0;

        for(int i =0;i<nums.length;i++)
        {
            right = right +nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            right=right-nums[i];
            if(right==left)
            return i;
            left =left+nums[i];
        }
        return -1;
    }
}
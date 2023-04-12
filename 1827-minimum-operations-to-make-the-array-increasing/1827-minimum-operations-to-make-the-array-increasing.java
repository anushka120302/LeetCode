class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int change =(nums[i-1]-nums[i]+1);
                c+=change;
                nums[i]+=change;
            }
        }
        return c;
    }
}
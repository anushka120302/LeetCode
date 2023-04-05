/*class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c=1;
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    c++;
            }
            if(c!=3)
                return nums[i];
        }
        return -1;
    }
}*/

class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,two=0;
        for(int i:nums){
            ones=ones^i & (~two);
            two= two^i&(~ones);
        }
        return ones;
    }
}
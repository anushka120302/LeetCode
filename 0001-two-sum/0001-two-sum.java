class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int a[]=new int[2];
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target)
            {
                a[c]=i;
                a[c+1]=j;
                c++;
            }
            }       
        }
        return a;
    }
}
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;
        int c=0;
      for(int i=1;i<n;i++)
      {
          if(nums[i-1]>=nums[i])
          {
              c++;
              if(i>1 && nums[i] <= nums[i-2])  nums[i] = nums[i-1]; 
          }
      }
        if(c<=1)
            return true;
        else 
            return false;
    }
}
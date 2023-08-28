class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n =nums.length;
        for(int k=n-1; k>=2;k--)
        {
            int a=nums[k];
            int b=nums[k-1];
            int c=nums[k-2];

            if(isValid(a,b,c))
            return a+b+c;

        }
        return 0;
    }
    boolean isValid(int a, int b, int c)
    {
        if(a<b+c)
        return true;

        return false;
    }
}
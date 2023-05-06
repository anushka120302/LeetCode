class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count =0;
        int mod =(int) 1e9 + 7;
        int pows[] = new int[nums.length];
        pows[0]=1;
        int i =0,j=nums.length-1;
        for(int n=1;n<nums.length;n++)
        {
             pows[n]=(pows[n-1]*2)%mod;
        }
        while(i<=j)
        {
            
           
            if(nums[i]+nums[j]>target)
                j--;
            else
                count =(count + pows[j-i++])%mod;
        }
        
        return count%mod;
    }
}
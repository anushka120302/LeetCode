class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        ans[0]=1;
        int temp=1;
        for(int i=0; i<n-1; i++){
            temp*=nums[i];
            ans[i+1]=temp;
        }
        temp=1;
        for(int i=n-1; i>0; i--){
            temp*=nums[i];
            ans[i-1]*=temp;
        }
        return ans;
    }
}
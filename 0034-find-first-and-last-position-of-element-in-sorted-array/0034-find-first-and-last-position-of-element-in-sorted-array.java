class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int[] res ={-1,-1};
        int b=0,e=nums.length-1;
        while(b<=e){
            int mid=b+(e-b)/2;
            if(nums[mid]==target){
                res[0]=mid;
                e=mid-1;
            } else if(nums[mid]<target)
                b=mid+1;
            else
                e=mid-1;
        }
        b=res[0];
        if(b==-1)
            return res;
        e=nums.length-1;
        while(b<=e){
            int mid=b+(e-b)/2;
            if(nums[mid]==target){
                res[1]=mid;
                b=mid+1;
            } else if(nums[mid]<target)
                b=mid+1;
            else
                e=mid-1;
        }
        return res;
    
    }
}
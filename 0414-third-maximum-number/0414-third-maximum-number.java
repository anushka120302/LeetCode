class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
       
        if(n==2)
            return Math.max(nums[0],nums[1]);
        else if(n==1)
            return nums[0];
        
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        
                for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num > max2 && num != max1){
                max3 = max2;
                max2 = num;
            }else if(num > max3 && num != max1 && num != max2){
                max3 = num;
            }
            
        }
        
        // at the end if thr third max is still Long.MIN_VALUE, it means there are no 3 distinct element in
		// nums. So we return the maximum as specified on the question
        if(max3 == Long.MIN_VALUE){
            return (int)max1;
        }
        return (int)max3;
            
    }
}
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        return((nums[l-1]*nums[l-2])-(nums[0]*nums[1]));
    }
}
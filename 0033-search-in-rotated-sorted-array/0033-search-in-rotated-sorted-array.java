class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[mid] < nums[lo]) {
                // 6,7,0,1,2,3,4,5
                if (target < nums[mid] || target >= nums[lo])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                // 2,3,4,5,6,7,0,1
                if (target > nums[mid] || target < nums[lo])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}
// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         return(isincreasing(nums) || isdecreasing(nums));
//     }
//     public boolean isincreasing(int[] nums)
//     {
//         int c=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]<=nums[j])
//                 c++;
//             }
//         }
//         if(c==nums.length)
//         return true;
//         return false;
//     }
//     public boolean isdecreasing(int[] nums)
//     {
//         int c=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]>=nums[j])
//                 c++;
//             }
//         }
//         if(c==nums.length)
//         return true;
//         return false;
//     }
// }


import java.util.*;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 2) return true;

        int check = 0;  // 0 means unknown, 1 means increasing, -1 means decreasing

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {  // increasing
                if (check == 0) check = 1;
                else if (check == -1) return false;
            } else if (nums[i] < nums[i - 1]) {  // decreasing
                if (check == 0) check = -1;
                else if (check == 1) return false;
            }
        }

        return true;
    }
}
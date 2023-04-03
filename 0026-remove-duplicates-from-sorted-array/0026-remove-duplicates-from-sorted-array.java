class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int cou =0;
        int j = nums[0];
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 101);
        arr[0] = nums[0];
        int itr = 1;
        while(i < nums.length){
            if(nums[i] != j){
                arr[itr++] = nums[i];
                j = nums[i];
            }
            i++;
        }
        for(int k=0;k<nums.length;k++){
            if(arr[k] != 101){
            nums[k] = arr[k];
            cou++;
            }
        }
        return cou;
    }
}
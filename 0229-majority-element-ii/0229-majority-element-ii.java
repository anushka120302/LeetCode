class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        //list.add(nums[nums.length/3]);

        int prev=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(prev==nums[i])
            count++;
            else
            {
                if(count>nums.length/3)
                list.add(prev);
                prev=nums[i];
                count=1;
            }
        }
        if(count>nums.length/3)
        list.add(prev);





        return list;
    }
}
class Solution {
    public boolean xorGame(int[] nums) {
        int x=0;
        
        for(int i:nums)
        {
            x=x^i;
        }
        if(x==0 || (nums.length & 1)==0)
            return true;
        else return false;
    }
}
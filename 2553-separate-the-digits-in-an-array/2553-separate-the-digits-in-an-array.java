class Solution {
    public int[] separateDigits(int[] nums) {
       
       int k=0;
       String t="";
       for(int i=0;i<nums.length;i++){
             t=t+nums[i];
         }
         int ar[]=new int[t.length()];
       for(int i =0;i<nums.length;i++)
       {
           String s = Integer.toString(nums[i]);
           for(int j =0;j<s.length();j++)
           {
               ar[k++]=s.charAt(j)-'0';
           }
       } 
       return ar;
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[nums.length];
        
        int mid=nums.length/2;
        int i=0,k=0;
        while(i<=mid && mid<nums.length)
        {
            a[k++]=nums[i++];
            a[k++]=nums[mid++];
        }
        
        return a;
    }
}


/*
int l=0,m=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j+=2)
            {
                a[j]=nums[l++];
            }
            for(int k=1;k<nums.length;k+=2)
            {
                a[k]=nums[m++];
            }
        }
        return a;
*/
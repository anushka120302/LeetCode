class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int l=0,r=arr.length-1;
        int m=0;
        while(l<=r)
        {
            m=(l+r)/2;
            int missing=arr[m]-m-1;
            if(k>missing)
            l=m+1;
            else
            r=m-1;
        }
        return r+k+1;
    }
}
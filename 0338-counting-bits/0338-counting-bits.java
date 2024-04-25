class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i =0;i<n+1;i++)
        {
            a[i]=countSetBits(i);
        }
        return a;
    }
    public int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
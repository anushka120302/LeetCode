class Solution {
    public long coloredCells(int n) {
        long r=1,i=1;
        if (n==1)
            return 1l;
        else
        {
            while(n-->1)
            {
                r+=(i*4l);
                i++;
            }
        }
        return r;
            
    }
}
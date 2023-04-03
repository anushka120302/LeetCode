class Solution {
    public int mySqrt(int x) {
        //for(int i =1;i<=x;i++)
        // {
        //     if(i*i>x)
        //         return i-1;
        // }
        // complexity: root of log(n)
        
        if(x<0)
            return -1;
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        
        int low=1, high =x;
        
        while(low<high)
        {
            int mid =(low+high)/2;
            if(x/mid==mid)
                return mid;
            else if(x/mid>mid)
                low=mid+1;
            else
                high=mid;
        }
        return low-1;
    }
}   
class Solution {
    public int arrangeCoins(int n) {
        int i =0;
        
        while(n>0)
        {
            i=i+1;
            n=n-i;
        }
        if(n==0)
            return i;
        else 
            return i-1;
    }
}

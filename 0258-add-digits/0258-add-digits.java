class Solution {
    public int addDigits(int n) 
    {
        int sum=0;
        int t=n;
        while(n>9)
        {
            sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
            n=sum;
        }
        return n;
    }
}
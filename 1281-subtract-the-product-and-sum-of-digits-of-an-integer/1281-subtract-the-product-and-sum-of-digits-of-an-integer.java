class Solution {
    public int subtractProductAndSum(int n) {
        
        int t=n,x=1,sum=0;
        
        while(t>0)
        {
            int rem=t%10;
            sum=sum+rem;
            x=x*rem;
            t=t/10;
        }
        
        return x-sum;
    }
}
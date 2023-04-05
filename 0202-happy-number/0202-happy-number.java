class Solution {
    public boolean isHappy(int n) {
        int num=n,rem=1,sum=0;
        
        while(n>9)
        {
            while(n>0)
            {
                rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }
            n=sum;
            sum=0;
        }
        if(n==1||n==7)
            return true;
        
    
            return false;
        
    }
}
class Solution {
    public boolean isPalindrome(int x)
    {
        int n=x, ans=0;
        while(n>0)
        {
            int r=n%10;
            ans=ans*10+r;
            n=n/10;
        }
        if(ans==x)
            return true;
        else
           return false;
    }
}
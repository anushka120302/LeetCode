class Solution {
    public int reverse(int x) {
        
        int n=x,T=0,rem;
        
        while(n!=0)
        {
            rem=n%10;
            if (T > Integer.MAX_VALUE/10 || (T == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (T < Integer.MIN_VALUE/10 || (T == Integer.MIN_VALUE / 10 && rem< -8)) return 0;
            T=T*10+rem;
            n=n/10;
        }
        return T;
            
        
    }
}
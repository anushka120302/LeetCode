class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b =(int) Math.sqrt(c);
        while(a<=b)
        {
            if(a*a+b*b==c)
            return true;
            else if(a*a+b*b>c)
            b--;
            else 
            a++;
        }
        return false;
    }
}
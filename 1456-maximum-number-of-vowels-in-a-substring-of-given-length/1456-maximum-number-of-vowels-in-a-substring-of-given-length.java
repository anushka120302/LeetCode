class Solution {
    public int maxVowels(String s, int k) {
        int count =0,max=0;
        for(int i =0;i<k;i++)
        {
            if(check(s.charAt(i)))
                count++;
        }
        max=count;
        for(int i =k;i<s.length();i++)
        {
            if(check(s.charAt(i-k)))
                count--;
            if(check(s.charAt(i)))
                count++;
            max=Math.max(count,max);
        }
            return max;
    }
    public boolean check(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u');
    }
}
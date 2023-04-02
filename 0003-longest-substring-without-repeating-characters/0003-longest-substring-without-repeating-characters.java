class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       /* char ch,c;
        int x=1;
        for(int i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            
            for(int j=i+1;j<s.length();j++)
            {
                c=s.charAt(j);
                if(c==ch)
                {
                    x=1;
                    i=j;
                }
                else
                    ++x;
            }
        }
        return x;
        */
        
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        int mx=0;
        Set<Character> set=new HashSet<>();
        int j=0;
        
        for(int i=0;i<n;i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                mx=Math.max(set.size(),mx);
                
            }
            else
            {
                set.remove(s.charAt(j));
                --i;
                ++j;     
            }
        }
        return mx;
    }
}

class Solution 
{
    public boolean isMatch(String s, String p) 
    {
       /* for(int j=0;j<p.length();j++)
        { 
             for(int i=0;i<s.length();i++)
             {
                if(s.charAt(i)==p.charAt(i) || s.charAt(i)=='*' || s.charAt(i)=='.' || p.charAt(i)=='*' || p.charAt(i)=='.'|| ())
                    return true;
             }
        }
        return false;
        */
        return s.matches(p);
    }
}
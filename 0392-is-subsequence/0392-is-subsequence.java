class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0,i=0;
        
            for(int j =0;j<t.length() && i<s.length();j++)
            {
                if(s.charAt(i)==t.charAt(j))
                  i++;
            }
            
        
        if(i==s.length())
        return true;
        else
        return false;
    }
}
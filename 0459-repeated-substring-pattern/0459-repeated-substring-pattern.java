/*
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()%2!=0)
            return false;
        
        else
        {
            String x = s.substring(0,s.length()/2);
            String y = s.substring(s.length()/2);
            
            if(x.equals(y))
                return true;
            else
                return false;
        }
    }
}
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) 
        {
             String y= s+s;
             return(y.substring(1,y.length()-1).contains(s));
        }
    
}

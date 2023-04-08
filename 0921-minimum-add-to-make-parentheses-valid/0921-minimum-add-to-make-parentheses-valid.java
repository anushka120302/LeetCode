class Solution {
    public int minAddToMakeValid(String s) {
        int start=0,end=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                start++;
            else 
            {
                if(s.charAt(i)==')' && start==0)
                end++;
                
                else
                    start--;
            }
        }
        return Math.abs(start+end);
    }
}
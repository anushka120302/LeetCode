class Solution {
    public String firstPalindrome(String[] words) {
        String str="";
        for(int i=0;i<words.length;i++)
        {
        if(ispalin(words[i]))
        {
            str=words[i];
            break;
        }
        }
        return str;
    }
        public boolean ispalin(String n)
        {
            String rev="";
            for(int i=n.length()-1;i>=0;i--)
            {
                rev=rev+n.charAt(i);
            }
            if(rev.equalsIgnoreCase(n))
                return true;
            return false;
        }
    
    
}
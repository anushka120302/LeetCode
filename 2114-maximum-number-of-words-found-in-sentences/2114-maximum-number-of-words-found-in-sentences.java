class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(String s:sentences)
        {
            c=1;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                    c++;
            }
            if(c>max)
                max=c;
        }
            return max;
        
    }
}
    
    
    
    
   /* }
        
        
        {
            for(int j=0;j<sentences[i].length();j++)
            {
                
            }
        }*/
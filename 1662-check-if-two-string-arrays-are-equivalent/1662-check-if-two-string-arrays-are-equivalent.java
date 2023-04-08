class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String w1="", w2="";
        int n1=word1.length, n2=word2.length;
        for(int i=0;i<n1;i++)
        {
            w1+=word1[i];
        }
        for(int j=0;j<n2;j++)
        {
            w2+=word2[j];
        }
        
        if(w1.equalsIgnoreCase(w2))
            return true;
        return false;
    }
}
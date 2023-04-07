class Solution {
    public int firstUniqChar(String s) {
        char ch[]=s.toCharArray();
        int frequency[]=new int[26];
        
        
        for(char c: ch)
            frequency[c-'a']++;
        
        for(int i=0;i<ch.length;i++)
        {
            if((frequency[ch[i]-'a'])==1)
                return i;
        }
        return -1;
    }
}
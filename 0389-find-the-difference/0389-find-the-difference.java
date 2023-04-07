class Solution {
    public char findTheDifference(String s, String t) 
    {
        char c=0;
        for(char i:s.toCharArray()) c ^= i;
        for(char j:t.toCharArray()) c ^= j;

        return c;
    }
}
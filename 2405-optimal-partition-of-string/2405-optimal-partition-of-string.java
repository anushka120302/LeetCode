class Solution {
    public int partitionString(String s) {
        int count;
        if(s.length()==0)
            count=0;
        else
            count =1;
        HashSet<Character> hash= new HashSet<>();
        for(int i =0;i<s.length();i++)
        {    
            if(hash.contains(s.charAt(i)))
            {
                hash.clear();
                count++;
            }
            hash.add(s.charAt(i));
        }
        return count;
        
        
        
    }
}
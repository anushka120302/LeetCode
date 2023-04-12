class Solution {
    public int secondsToRemoveOccurrences(String s) {
       
        
        
        
        int sec=0;
        while(s.contains("01"))
        {
            s=s.replaceAll("01","10");
            ++sec;
        }
        return sec;
    }
}
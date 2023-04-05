class Solution {
    public String convertToTitle(int columnNumber) {
        
        
        StringBuilder SB=new StringBuilder();
        while(columnNumber>0)
        {
            columnNumber--;
            SB.append((char)('A'+columnNumber%26));
            
            columnNumber/=26;
        }
        return SB.reverse().toString();
    }
}
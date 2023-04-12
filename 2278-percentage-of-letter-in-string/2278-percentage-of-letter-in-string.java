class Solution {
    public int percentageLetter(String s, char letter) {
        double c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
                c++;
        }
        double x=(c/s.length())*100;
        return (int)x;
    }
}